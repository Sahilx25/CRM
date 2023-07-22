package com.freak.CRM.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class complaints {

    @GetMapping("/complaints.html")
    public String complaint() {
        return "complaints";
    }

}


