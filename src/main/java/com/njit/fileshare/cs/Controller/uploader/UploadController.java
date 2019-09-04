package com.njit.fileshare.cs.Controller.uploader;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UploadController {

    @RequestMapping(name = "uploadfile")
    public String upload()
    {
        return "upload";
    }
}
