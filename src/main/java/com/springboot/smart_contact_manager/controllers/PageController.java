package com.springboot.smart_contact_manager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/home")
    public String home(Model model){
        model.addAttribute("name","Shadab");
        model.addAttribute("company","Cognizant Technology Solutions");
        return "home";
    }
}
