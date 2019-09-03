package com.njit.fileshare.cs.Dao.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {
    public UserEntity findByUserId(Integer id);
    public UserEntity removeByUserId(Integer id);
}
