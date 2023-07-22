package com.freak.CRM.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class profileController {

    @GetMapping("/profile.html")
    public String profile() {
        return "profile";
    }

}


