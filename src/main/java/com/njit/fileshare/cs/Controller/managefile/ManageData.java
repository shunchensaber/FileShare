package com.njit.fileshare.cs.Controller.managefile;

import com.njit.fileshare.cs.Dao.resource.ResourceEntity;
import com.njit.fileshare.cs.Dao.resource.ResourceRepository;
import com.njit.fileshare.cs.Dao.resource.ResourceService;
import com.njit.fileshare.cs.Datare.ResourceandUser;
import com.njit.fileshare.cs.Setting.DividePage;
import com.njit.fileshare.cs.Util.Msg;
import com.njit.fileshare.cs.Util.ResultUtil;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Optional;

@Controller
public class ManageData {
    @Autowired
    ResourceRepository resourceRepository;

    @RequestMapping("getpages")
    @ResponseBody
    public Msg getpages()
    {
        int pages = DividePage.getpages(resourceRepository.countnums());
        return ResultUtil.success(pages);
    }

    @Autowired
    ResourceService resourceService;
    //resource表左外连接User表
    @RequestMapping("searchresource")
    @ResponseBody
    public Msg searchresource(int page) {
        int pages = DividePage.getpages(resourceRepository.countnums());
        if(page<0)
            page=0;
        if(page>pages)
            page=pages;
        int startIndex = DividePage.getStartIndex(page);
        System.out.println(startIndex);

        List<ResourceandUser> list = resourceService.findReresourceandUser(startIndex,DividePage.pagesize);

        if(list==null)
            return ResultUtil.error(444,"出现错误");
        else{
            return ResultUtil.success(list);
        }


    }
    //预览
    @RequestMapping("preview")
    public void preview(HttpServletResponse response,Integer id)
    {
        System.out.println("id"+id);
       ResourceEntity resourceEntity = resourceRepository.findByResourceId(id);
        File file = new File(resourceEntity.getResourcePath());
        try{
            ServletOutputStream outputStream = response.getOutputStream();
            InputStream inputStream = new FileInputStream(file);
            int  i  = IOUtils.copy(inputStream,outputStream);
            inputStream.close();
            outputStream.close();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
