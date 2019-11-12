package com.njit.fileshare.cs.Dao.resource;


import com.njit.fileshare.cs.Dao.user.UserEntity;
import com.njit.fileshare.cs.Dao.user.UserRepository;
import com.njit.fileshare.cs.Datare.ResourceandUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ResourceRepositoryTest {

    @Autowired
    ResourceRepository resourceRepository;
    @Autowired
    UserRepository userRepository;

    @Test
//    @Transactional
    public void save()  //上传文件的插入动作
    {
        for (int i = 10; i < 20; i++) {
            ResourceEntity resourceEntity = new ResourceEntity();
            UserEntity userEntity = userRepository.findByUserId(4);
//        System.out.println(userEntity);
            resourceEntity.setDownloadTimes(100 + i);
            resourceEntity.setLabel1("高等数学");
            resourceEntity.setLabel2("期末复习");
            resourceEntity.setResourcePath("D://re//td/2.pdf");
            resourceEntity.setUploadDate(new Date());
            resourceEntity.setResource_user_id(1);

            //resourceEntity.setResource_user_id(4);
            resourceEntity.setResourceRealName("高等数学");
            resourceEntity.setResourceType("pdf");
            resourceRepository.save(resourceEntity);
        }
    }

    //unuse
    @Test
    public void deletebyID() {
        resourceRepository.deleteById(1);
    }


    //根据下载次数降序排序
    @Test
    public void findorderbydownloadTimes() {
//        List<ResourceEntity> list =  resourceRepository.findByDeleteFlagOrderByDownloadTimesDeleteFlagDesc(0);
//       List<ResourceEntity> list = resourceRepository.findAllByDeleteFlagFalse();
//        List<ResourceEntity> list = resourceRepository.count();
        //    System.out.println(list);
        List<ResourceEntity> list = resourceRepository.findAllByDeleteFlagFalseOrderByDownloadTimesDesc();
        System.out.println(resourceRepository.count());
        System.out.println(list);

    }

    //根据上传时间降序排序
    @Test
    public void findorderbyupdatetime() {

        List<ResourceEntity> list = resourceRepository.findAllByDeleteFlagFalseOrderByUploadDateDesc();
        System.out.println(resourceRepository.count());
        System.out.println(list);

    }

    @Test
    public void findUSer() {
        List<Object[]> list = resourceRepository.findReresourceandUser(1,4);
        for(Object[] temp:list)
        {
            ResourceandUser resourceandUser = new ResourceandUser(temp);
            System.out.println(resourceandUser);
        }


    }

}


