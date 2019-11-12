package com.njit.fileshare.cs.Dao.Discpline;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DiscplineRepositoryTest {

    @Autowired
    DiscplineRepository discplineRepository;

    @Test
    public void find()
    {
        List<DiscplineEntity> list =  discplineRepository.findBySchoolId(27);
        System.out.println(list);
    }

    @Test
    public void findbyname()
    {
        DiscplineEntity discplineEntity = discplineRepository.findByName("网络工程");
        System.out.println(discplineEntity);
    }

}