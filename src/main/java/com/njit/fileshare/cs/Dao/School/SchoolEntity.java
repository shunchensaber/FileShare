package com.njit.fileshare.cs.Dao.School;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class SchoolEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column
    private String name; //学院名称
}
