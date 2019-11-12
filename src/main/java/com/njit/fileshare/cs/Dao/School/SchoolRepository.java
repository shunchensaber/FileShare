package com.njit.fileshare.cs.Dao.School;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;

@Repository
public interface SchoolRepository extends JpaRepository<SchoolEntity,Integer> {

    public SchoolEntity findByName(String name);

}
