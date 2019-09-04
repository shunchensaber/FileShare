package com.njit.fileshare.cs.Dao.Class;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClassRepositoryTest {

    @Autowired
    ClassRepository classRepository;
 @Test
    public void testSave()
    {
        ClassEntity classEntity = new ClassEntity();
        classEntity.setClassName("网嵌172");
//        classEntity.setSchool("计算机工程学院");
//        classEntity.setDiscpline("网络工程");
        ClassEntity classEntity1  =  classRepository.save(classEntity);
        Assert.assertNotNull(classEntity1);
    }

    @Test
   @Transactional
//    如果使用懒加载来调用关联数据，必须要保证主查询session(数据库连接会话)的生命周期没有结束，否则，你是无法抽取到数据的。那么如果保证自己想要获取关联数据时，数据库会话session还存在呢？今天讲解一种方法，借助Spring提供的@Transactional注解来实现方法内部的操作在同一
//    次数据库连接中执行。需要注意的是，使用@Transactional注解，必须要保证方法通过Spring组件解析方式处理，spring代理会为方法注入事务拦截逻辑。
    public void testfindbyid()
    {
        ClassEntity classEntity = classRepository.findByClassId(1);
        System.out.println(classEntity.toString());
    }



}
