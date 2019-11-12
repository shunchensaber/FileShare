package com.njit.fileshare.cs.Service;

import com.njit.fileshare.cs.Dao.Discpline.DiscplineEntity;
import com.njit.fileshare.cs.Dao.Discpline.DiscplineRepository;
import com.njit.fileshare.cs.Dao.School.SchoolRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DiscplineServiceTest {
    @Autowired
    DiscplineService service;
    @Autowired
    SchoolRepository schoolRepository;
    @Autowired
    DiscplineRepository discplineRepository;

    @Test
    public void getOption()
    {
       HashMap hs =  service.findschoolandDescpline();
       System.out.println(hs.toString());
    }

    @Test
    public void find()
    {
     List<DiscplineEntity> list =  discplineRepository.findBySchoolId(27);
        System.out.println(list);

    }

}