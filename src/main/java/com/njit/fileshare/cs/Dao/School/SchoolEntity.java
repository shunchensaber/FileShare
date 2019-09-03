package com.njit.fileshare.cs.Dao.School;

import javax.persistence.*;

@Entity
public class SchoolEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column
    private String name; //学院名称
}
