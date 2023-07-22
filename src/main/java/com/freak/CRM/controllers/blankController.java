package com.freak.CRM.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class blankController {

    @GetMapping("/blank.html")
    public String blank() {
        return "blank";
    }

}


