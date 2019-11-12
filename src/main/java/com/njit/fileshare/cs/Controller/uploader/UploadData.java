package com.njit.fileshare.cs.Controller.uploader;

import com.njit.fileshare.cs.Dao.Discpline.DiscplineEntity;
import com.njit.fileshare.cs.Dao.Discpline.DiscplineRepository;
import com.njit.fileshare.cs.Dao.ResourcesReference.ResourceReferencesEntity;
import com.njit.fileshare.cs.Dao.ResourcesReference.ResourcesReferenceRepository;
import com.njit.fileshare.cs.Dao.resource.ResourceEntity;
import com.njit.fileshare.cs.Dao.resource.ResourceRepository;
import com.njit.fileshare.cs.Service.DiscplineService;
import com.njit.fileshare.cs.Util.Msg;
import com.njit.fileshare.cs.Util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Controller
public class UploadData {
    @Autowired
    DiscplineService discplineService;
    @Autowired
    DiscplineRepository discplineRepository;
    @Autowired
    ResourceRepository resourceRepository;
    @Autowired
    ResourcesReferenceRepository resourcesReferenceRepository;


    @RequestMapping("getDiscpline")
    public @ResponseBody
    HashMap<String, List<DiscplineEntity>> returnDiscpline() {
        return discplineService.findschoolandDescpline();
    }

    @RequestMapping(value = "uploadfile", method = RequestMethod.POST)
    public @ResponseBody
    Msg handleFileUpload(String filename, String schoolname, String discplinename, String label1, String label2, HttpServletRequest request) {
        System.out.println(1);
        DiscplineEntity discplineEntity = discplineRepository.findByName(discplinename);
        MultipartFile file = ((MultipartHttpServletRequest) request).getFile("file");
        long size = file.getSize();
        File filepath = new File("Files");
        if (!filepath.exists()) {
            filepath.mkdirs();
        }
        String originalFilename = file.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        String realfilepath = filepath.getAbsolutePath() + File.separator + uuid + originalFilename;
        System.out.println(realfilepath);
        File file1 = new File(realfilepath);

        BufferedOutputStream bufferedOutputStream = null;

        String filetype = realfilepath.substring(realfilepath.lastIndexOf(".") + 1, realfilepath.length());
        System.out.println(filetype);

        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file1));
                bufferedOutputStream.write(bytes);
                bufferedOutputStream.close();


            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("获取byte流");
                return ResultUtil.error(444, "文件获取byte出现问题");
            }
        }
        //存取资源 入数据库
        try {
            ResourceEntity resourceEntity = new ResourceEntity();
            resourceEntity.setResourceType(filetype);
            resourceEntity.setResourceRealName(filename);
            resourceEntity.setUploadDate(new Date());
            resourceEntity.setResourcePath(realfilepath);
            resourceEntity.setLabel2(label2);
            resourceEntity.setLabel1(label1);
            resourceEntity.setDownloadTimes(0);
            //埋坑 size应该long
            resourceEntity.setResourcesize((int) size);
            resourceRepository.save(resourceEntity);


            //System.out.println(resourceEntity.getResourceId());
            //资源归属入库
            ResourceReferencesEntity resourceReferencesEntity = new ResourceReferencesEntity();
            resourceReferencesEntity.setSchoolId(discplineEntity.getSchoolId());
            resourceReferencesEntity.setDiscplineId(discplineEntity.getId());
            resourceReferencesEntity.setResourceId(resourceEntity.getResourceId());
            resourcesReferenceRepository.save(resourceReferencesEntity);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.error(444, "数据库存取出错");
        }
        return ResultUtil.success("上传成功");
    }

}
