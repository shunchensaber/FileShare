package com.njit.fileshare.cs.Dao.user;

import com.njit.fileshare.cs.Dao.Class.ClassEntity;
import com.njit.fileshare.cs.Dao.Class.ClassRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;
    @Autowired
    ClassRepository classRepository;

    @Test
  //  @Transactional
    public void save(){
        UserEntity userEntity  = new UserEntity();
       userEntity.setClassId(1);
        userEntity.setUsername("chenshun");
        userEntity.setPassword("123");
        userRepository.save(userEntity);
    }

    @Test
    public void findbyId()
    {
        UserEntity userEntity = userRepository.findByUserId(3);
        System.out.println(userEntity);
    }
    @Test
    public void deleteByid()
    {
        UserEntity userEntity = userRepository.findByUserId((3));
        userRepository.deleteById(3);
        //userRepository.removeByUserId(3);
    }


}
