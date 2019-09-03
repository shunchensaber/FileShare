package com.njit.fileshare.cs.Dao.ResourcesReference;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ResourceReferencesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Integer resourceId; //文件Id

    @Column
    private Integer classId; //班级Id；

    @Column
    private Integer discplineId; //专业Id

    @Column
    private Integer schoolId; //学院Id

    @Column
    private boolean isdeleateflag; //是否删除标记

}
