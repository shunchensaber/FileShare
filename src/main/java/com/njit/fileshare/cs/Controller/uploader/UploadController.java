package com.njit.fileshare.cs.Controller.uploader;

import com.njit.fileshare.cs.Dao.Discpline.DiscplineEntity;
import com.njit.fileshare.cs.Service.DiscplineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@Controller
public class UploadController {

    @Autowired
    DiscplineService discplineService;

    @RequestMapping(value = "uploadfile")
    public String upload()
    {
        return "upload";
    }



}
