package com.njit.fileshare.cs.Dao.ClassResources;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class ClassResourcesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer classId;

    @Column(nullable = false)
    private Integer resourceId;

}
