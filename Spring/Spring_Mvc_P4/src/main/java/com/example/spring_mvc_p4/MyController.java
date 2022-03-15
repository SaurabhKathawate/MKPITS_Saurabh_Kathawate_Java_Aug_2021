package com.example.spring_mvc_p4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//for Model

//@Controller
//public class MyController {
//@RequestMapping
//    public String display(Model mod)
//    {
//        mod.addAttribute("msg","this is model object data");
//        return "page1";
//    }

//for ModelMap

//@Controller
//public class MyController {
//    @RequestMapping
//    public String display(ModelMap mod)
//    {
//        mod.addAttribute("msg","Here we can send object also");
//        return "page1";
//    }

//for Map

//@Controller
//public class MyController {
//    @RequestMapping
//    public String display(Map<String,Object> mod)
//    {
//        mod.put("msg","object value");
//        return "page1";
//    }

//for Map
@Controller
public class MyController {
    @RequestMapping
    public ModelAndView display()
    {
        ModelAndView mod=new ModelAndView("page1");
        mod.addObject("msg","object value");
        return mod;
    }
}
