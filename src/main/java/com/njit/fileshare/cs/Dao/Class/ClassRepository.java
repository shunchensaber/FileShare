package com.njit.fileshare.cs.Dao.Class;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface ClassRepository extends JpaRepository<ClassEntity,Integer>{

    //在获取列表的时候使用@Transactional标记为事务，就可以实现懒加载，不会出现错误：
    // org.hibernate.LazyInitializationException: could not initialize proxy - no Session

    public ClassEntity findByClassId(Integer id);
}
