package com.njit.fileshare.cs.Dao.user;

import com.njit.fileshare.cs.Dao.Class.ClassEntity;
import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    /**
     * user_class_id 查询不出数据，插入也是鸡肋
     * mother fuck
     * 坑先放这里，改日来研究
     * 2019.08.31
     */
    @Transient
    private Integer user_class_id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private Integer classId = 1;

//    @ManyToOne(targetEntity = ClassEntity.class,fetch = FetchType.LAZY)
//    @JoinColumn(name = "user_class_id",referencedColumnName = "classId")
//    private ClassEntity classEntity;

}
