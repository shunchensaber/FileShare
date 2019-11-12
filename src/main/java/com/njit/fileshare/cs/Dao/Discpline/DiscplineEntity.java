package com.njit.fileshare.cs.Dao.Discpline;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class DiscplineEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;  //专业名称

    @Column
    private Integer schoolId; //学院Id
}
