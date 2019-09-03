package com.njit.fileshare.cs.Dao.Discpline;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DiscplineEntity {

    @Id
    private Integer id;

    @Column
    private String name;  //专业名称

    @Column
    private Integer SchoolId; //学院Id
}
