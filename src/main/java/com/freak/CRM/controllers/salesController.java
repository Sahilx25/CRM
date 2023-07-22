package com.freak.CRM.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class salesController {

    @GetMapping("/sales.html")
    public String salesPage() {
        return "sales";
    }

}


