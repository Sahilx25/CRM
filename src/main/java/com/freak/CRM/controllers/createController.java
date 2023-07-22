package com.freak.CRM.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class createController {


    @GetMapping("/create.html")
    public String create() {
        return "create";
    }
    
}
