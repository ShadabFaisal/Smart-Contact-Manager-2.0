package com.springboot.smart_contact_manager_20.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model){
        model.addAttribute("name","Shadab Faisal");
        model.addAttribute("Company","Cognizant Technology Solutions");
        model.addAttribute("Location","Kolkata");
        return "home";
    }
}
