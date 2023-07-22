package com.freak.CRM.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class madeStocksController {

	@GetMapping("/stocks_made.html")
    public String stocksMade() {
        return "stocks_made"; 
    }
}
