package com.njit.fileshare.cs.Dao.Discpline;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public interface DiscplineRepository extends JpaRepository<DiscplineEntity,Integer> {

    public List<DiscplineEntity> findBySchoolId(int SchoolId);

    public DiscplineEntity findByName(String name);
}
