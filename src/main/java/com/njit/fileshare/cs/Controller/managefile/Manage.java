package com.njit.fileshare.cs.Controller.managefile;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Manage {

    @RequestMapping(value = "managefiles")
    public String manage()
    {
        return "managefile";
    }


}
