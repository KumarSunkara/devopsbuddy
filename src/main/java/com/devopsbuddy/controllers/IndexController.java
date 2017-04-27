package com.devopsbuddy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by macbookpro on 4/25/17.
 */
@Controller
public class gidIndexController {
    @RequestMapping("/")
    public String home()
    {
        return "index";
    }

}
