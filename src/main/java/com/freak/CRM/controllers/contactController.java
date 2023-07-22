package com.freak.CRM.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class contactController {

    @GetMapping("/contact.html")
    public String contact() {
        return "contact";
    }

}


