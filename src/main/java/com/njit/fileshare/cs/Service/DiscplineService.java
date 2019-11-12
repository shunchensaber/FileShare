package com.njit.fileshare.cs.Service;

import com.njit.fileshare.cs.Dao.Discpline.DiscplineEntity;
import com.njit.fileshare.cs.Dao.Discpline.DiscplineRepository;
import com.njit.fileshare.cs.Dao.School.SchoolEntity;
import com.njit.fileshare.cs.Dao.School.SchoolRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

@Service
@Data
public class DiscplineService {
    @Autowired
    DiscplineRepository discplineRepository;
    @Autowired
    SchoolRepository schoolRepository;

    public HashMap<String, List<DiscplineEntity>> findschoolandDescpline()
    {
        List<SchoolEntity> schoolEntities =  schoolRepository.findAll();
        HashMap<String,List<DiscplineEntity>> hs = new HashMap<>();
        for(SchoolEntity schoolentity:schoolEntities)
        {
            List<DiscplineEntity> discplineEntities = discplineRepository.findBySchoolId(schoolentity.getId());
            hs.put(schoolentity.getName(),discplineEntities);


        }
        return hs;
    }

}
