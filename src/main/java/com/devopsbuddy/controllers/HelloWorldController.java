package com.devopsbuddy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by macbookpro on 4/24/17.
 */
@Controller
public class HelloWorldController {
    @RequestMapping("/")
    public String sayHello()
    {
        return "index";
    }
}
