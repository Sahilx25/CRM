package com.freak.CRM.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ordersController {

	@GetMapping("/orders.html")
    public String showEmployeePage() {
        return "orders"; 
    }
}
