package com.njit.fileshare.cs.Dao.ClassResources;

import com.njit.fileshare.cs.Dao.Class.ClassEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassResourcesRepository extends JpaRepository<ClassResourcesEntity,Integer> {



}
