package com.njit.fileshare.cs.Dao.user;

import com.njit.fileshare.cs.Dao.Class.ClassEntity;

import javax.persistence.*;

@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Transient
    private Integer classid;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @ManyToOne(targetEntity = ClassEntity.class)
    @JoinColumn(name = "user_class_id",referencedColumnName = "classId")
    private ClassEntity classEntity;

    public UserEntity() {
    }

    public UserEntity(Integer classid, String username, String password, ClassEntity classEntity) {
        this.classid = classid;
        this.username = username;
        this.password = password;
        this.classEntity = classEntity;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ClassEntity getClassEntity() {
        return classEntity;
    }

    public void setClassEntity(ClassEntity classEntity) {
        this.classEntity = classEntity;
    }
}
