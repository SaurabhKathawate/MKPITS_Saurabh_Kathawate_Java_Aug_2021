package com.example.spring_mvc_p7;

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
        Login ob=new Login();
        ob.setUsername(name);
        ob.setPassword(pass);

        mod.addAttribute("lob",ob);
        return"form2";
    }
}
