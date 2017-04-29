package com.devopsbuddy.web.controllers.advices;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by macbookpro on 4/29/17.
 */
@Controller
public class CopyController {
    @RequestMapping("/about")
    public String about()
    {
        return "copy/about";
    }
}
