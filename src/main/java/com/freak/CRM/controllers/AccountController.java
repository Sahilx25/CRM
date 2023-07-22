package com.freak.CRM.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.freak.CRM.models.User;

@Controller
@RequestMapping("/account")
public class AccountController {

   
    @PostMapping("/register")
    public String registerAccount(User userForm) {

        return "redirect:/account/success"; 
    }

    @GetMapping("/success")
    public String showSuccessPage() {
        return "account-success"; 
    }
}
