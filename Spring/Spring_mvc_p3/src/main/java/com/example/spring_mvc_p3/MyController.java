package com.example.spring_mvc_p3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {
    @RequestMapping
    public String display1()
    {
        return "mvc1";
    }
}
