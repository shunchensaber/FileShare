package com.njit.fileshare.cs.Dao.Class;

import com.njit.fileshare.cs.Dao.user.UserEntity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ClassEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer classId; //班级Id

    @Column
    private String className; //班级名称

    @Column
    private String school; //班级专业名

    @Column
    private boolean isdeleate; //删除标记

    @OneToMany(targetEntity = UserEntity.class)
    @JoinColumn(name = "user_class_id",referencedColumnName = "classId")
    private Set<UserEntity> classusers;
    public ClassEntity() {
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public boolean isIsdeleate() {
        return isdeleate;
    }

    public void setIsdeleate(boolean isdeleate) {
        this.isdeleate = isdeleate;
    }

    public Set<UserEntity> getClassusers() {
        return classusers;
    }

    public void setClassusers(Set<UserEntity> classusers) {
        this.classusers = classusers;
    }
}
