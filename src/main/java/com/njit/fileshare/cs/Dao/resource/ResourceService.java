package com.njit.fileshare.cs.Dao.resource;

import com.njit.fileshare.cs.Datare.ResourceandUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ResourceService {
    @Autowired
    ResourceRepository resourceRepository;
    public List<ResourceandUser> findReresourceandUser(int startindex,int endIndex)
    {

        List<ResourceandUser> re = new ArrayList<>();
        List<Object[]> list = resourceRepository.findReresourceandUser(startindex,endIndex);
        for(Object[] temp:list)
        {
            ResourceandUser resourceandUser = new ResourceandUser(temp);
            re.add(resourceandUser);
        }
        return re;

    }
}
