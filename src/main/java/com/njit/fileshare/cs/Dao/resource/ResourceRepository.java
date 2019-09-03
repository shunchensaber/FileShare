package com.njit.fileshare.cs.Dao.resource;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface ResourceRepository extends JpaRepository<ResourceEntity,Integer> {
    public ResourceEntity findByResourceId(Integer id); //根据id查询

   // public List<ResourceEntity> findByDeleteFlagOrderByDownloadTimesDeleteFlagDesc(int deleteflag);

    public List<ResourceEntity> findAllByDeleteFlagFalseOrderByDownloadTimesDesc();

    public ArrayList<ResourceEntity> findAll();

}
