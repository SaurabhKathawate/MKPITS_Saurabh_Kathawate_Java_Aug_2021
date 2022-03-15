package com.example.spring_mvc_p6;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String collectData(@RequestParam("username")String name, @RequestParam("password")String pass, Model mod)
    {
        mod.addAttribute("name1",name);
        mod.addAttribute("pass1",pass);
        return"form2";
    }

//    @RequestMapping("/success")
//    public String collectData(@RequestParam(defaultValue="defaultusername",name="username")String name, @RequestParam("password")String pass, Model mod)
//    {
//        mod.addAttribute("name1",name);
//        mod.addAttribute("pass1",pass);
//        return"form2";
//    }
}
