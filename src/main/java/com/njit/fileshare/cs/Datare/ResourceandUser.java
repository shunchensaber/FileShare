package com.njit.fileshare.cs.Datare;

import com.njit.fileshare.cs.Dao.resource.ResourceEntity;
import com.njit.fileshare.cs.Dao.user.UserEntity;
import lombok.Data;

import javax.persistence.criteria.CriteriaBuilder;
import java.math.BigInteger;
import java.util.Date;

@Data
public class ResourceandUser {

    private Integer resourceId;
    private Boolean resourceisdelete;
    private Integer downloadTimes;
    private String label1;
    private String label2;
    private String resourcePath;
    private String resourceRealname;
    private String type;
    private Integer ResourceUserId;
    private BigInteger ResourceSize;
    private Date uploadDate;
    private Integer UserId;
    private Integer ClassId;
    private String USername;
    private String userisdelete;

    public ResourceandUser(Object[] objects) {
        int i = 0;
        this.resourceId = (Integer) objects[i++];
        this.resourceisdelete = (Boolean) objects[i++];
        this.downloadTimes = (Integer) objects[i++];
        this.label1 = (String) objects[i++];
        this.label2 = (String) objects[i++];
        this.resourcePath = (String) objects[i++];
        this.resourceRealname = (String) objects[i++];
        this.type = (String) objects[i++];
        this.ResourceUserId = (Integer) objects[i++];
        this.ResourceSize = (BigInteger) objects[i++];
        this.uploadDate = (Date) objects[i++];
        this.UserId = (Integer) objects[i++];
        this.ClassId = (Integer) objects[i++];
        this.USername = (String) objects[i++];
        this.userisdelete = (String) objects[i++];

    }


}
