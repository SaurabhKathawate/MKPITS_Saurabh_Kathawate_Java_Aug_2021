package com.example.spring_mvc_p8;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/stud")
public class MyController {
    @RequestMapping("/home")
    public String displayForm()
    {
        return"form1";
    }

    @RequestMapping("/success")
    public String collectData(@ModelAttribute("lob")Login ob, Model mod)
    {
        return"form2";
    }
}
