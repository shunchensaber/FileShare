package com.njit.fileshare.cs.Dao.Class;

import com.njit.fileshare.cs.Dao.resource.ResourceEntity;
import com.njit.fileshare.cs.Dao.user.UserEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class ClassEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer classId; //班级Id

    @Column
    private String className; //班级名称

    @Column
    private Integer id; //班级学院名

    @Column
    private Integer discplineid; //班级专业名

    @Column
    private boolean isdeleate; //删除标记

//    @OneToMany(mappedBy = "classEntity",fetch = FetchType.LAZY) //班级内成员
//    private List<UserEntity> classusers;
//

    /**
     * 放弃多对多维护
     * 2019/9。2
     * @return
     */
//    @ManyToMany
//    @JoinColumn(name="class_resource_id")
//    private List<ResourceEntity> resources;   //班级文件


}
