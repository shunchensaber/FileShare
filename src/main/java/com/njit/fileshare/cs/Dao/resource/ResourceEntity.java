package com.njit.fileshare.cs.Dao.resource;

import com.njit.fileshare.cs.Dao.user.UserEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 上传文件信息
 */
@Data
@Entity
public class ResourceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer resourceId;

    @Column(nullable = false)
    private String resourceRealName;//文件名



    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date uploadDate; //文件上传时间

    @Column(nullable = false)
    private String resourceType; //文件类型

    @Column
    private long resourcesize; //文件大小

    @Column
    private int downloadTimes; //下载次数

    @Column(nullable = false)
    private String resourcePath; //文件路径地址

    @Column(nullable = false)
    private boolean deleteFlag = false; //删除标记

    @Column
    private String label1; //文件标记1

    @Column
    private String label2; //文件标记2

    @Column
    private Integer resource_user_id; //文件上传者

    /**
     * 放弃外键维护
     * 2019.9.1
     */
//    @ManyToOne(targetEntity = UserEntity.class,fetch = FetchType.LAZY)
//    @JoinColumn(name = "resource_user_id",referencedColumnName = "userId")  //上传者，与用户相互关联
//    private UserEntity uploader ;



}
