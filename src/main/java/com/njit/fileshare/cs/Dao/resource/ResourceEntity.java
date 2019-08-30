package com.njit.fileshare.cs.Dao.resource;

import javax.persistence.*;
import java.util.Date;

/**
 * 上传文件信息
 */
@Entity
public class ResourceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer resourceId;

    @Column(nullable = false)
    private String resourceRealName;//文件名

    @Column(nullable = false)
    private String uploader; //文件上传者

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

    public ResourceEntity() {
    }

    public ResourceEntity(String resourceRealName, String uploader, Date uploadDate, String resourceType, long resourcesize, int downloadTimes, String resourcePath, boolean deleteFlag, String label1, String label2) {
        this.resourceRealName = resourceRealName;
        this.uploader = uploader;
        this.uploadDate = uploadDate;
        this.resourceType = resourceType;
        this.resourcesize = resourcesize;
        this.downloadTimes = downloadTimes;
        this.resourcePath = resourcePath;
        this.deleteFlag = deleteFlag;
        this.label1 = label1;
        this.label2 = label2;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceRealName() {
        return resourceRealName;
    }

    public void setResourceRealName(String resourceRealName) {
        this.resourceRealName = resourceRealName;
    }

    public String getUploader() {
        return uploader;
    }

    public void setUploader(String uploader) {
        this.uploader = uploader;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public long getResourcesize() {
        return resourcesize;
    }

    public void setResourcesize(long resourcesize) {
        this.resourcesize = resourcesize;
    }

    public int getDownloadTimes() {
        return downloadTimes;
    }

    public void setDownloadTimes(int downloadTimes) {
        this.downloadTimes = downloadTimes;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public boolean isDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getLabel1() {
        return label1;
    }

    public void setLabel1(String label1) {
        this.label1 = label1;
    }

    public String getLabel2() {
        return label2;
    }

    public void setLabel2(String label2) {
        this.label2 = label2;
    }
}
