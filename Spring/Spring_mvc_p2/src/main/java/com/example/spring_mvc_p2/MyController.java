package com.example.spring_mvc_p2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping
    public String display1()
    {
        return "mvc";
    }

//    @RequestMapping("/home")
//    public String display2()
//    {
//        return"Welcome to mvc 2";
//    }
}
