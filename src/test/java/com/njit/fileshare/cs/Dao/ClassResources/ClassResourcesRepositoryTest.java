package com.njit.fileshare.cs.Dao.ClassResources;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClassResourcesRepositoryTest {
    @Autowired
    ClassResourcesRepository classResourcesRepository;

    @Test
    public void add()
    {
        ClassResourcesEntity classResourcesEntity = new ClassResourcesEntity();
        classResourcesEntity.setClassId(1);
        classResourcesEntity.setResourceId(2);
        classResourcesRepository.save(classResourcesEntity);

    }

    @Test
    public void deletebytwoIds()
    {
        return;
    }



}
