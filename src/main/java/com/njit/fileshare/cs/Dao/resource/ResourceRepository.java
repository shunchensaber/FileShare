package com.njit.fileshare.cs.Dao.resource;

import com.njit.fileshare.cs.Datare.ResourceandUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface ResourceRepository extends JpaRepository<ResourceEntity,Integer> {
    public ResourceEntity findByResourceId(Integer id); //根据id查询

   // public List<ResourceEntity> findByDeleteFlagOrderByDownloadTimesDeleteFlagDesc(int deleteflag);

    //根据下载次数降序排序
    public List<ResourceEntity> findAllByDeleteFlagFalseOrderByDownloadTimesDesc();

    //根据上传时间排序
    public List<ResourceEntity> findAllByDeleteFlagFalseOrderByUploadDateDesc();



    public ArrayList<ResourceEntity> findAll();


    //左外连接
    @Query(nativeQuery = true,value="SELECT * FROM resource_entity left join  user_entity on user_id=resource_user_id where delete_flag!=true order by upload_date desc limit :start1,:end1")
    public List<Object[]> findReresourceandUser(int start1,int end1);

    //查询有效资源数
    @Query(nativeQuery = true,value = "select count(*) from resource_entity where delete_flag!=true")
    public Integer countnums();

}
