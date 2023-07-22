package com.freak.CRM.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class purchasedStocksController {

	@GetMapping("/stocks_purchased.html")
    public String stocksPurchasedPage() {
        return "stocks_purchased"; 
    }
}
