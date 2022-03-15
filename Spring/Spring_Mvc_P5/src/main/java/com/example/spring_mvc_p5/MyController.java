package com.example.spring_mvc_p5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/stud")
public class MyController {
    @RequestMapping("/home")
    public String displayForm()
    {
        return"form1";
    }

    @RequestMapping("/success")
    public String collectData()
    {
        return"form2";
    }
}
