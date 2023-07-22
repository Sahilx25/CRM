package com.freak.CRM;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
	
	@GetMapping("/index.html")
	public String goHome() {
		return "index";
	}
	

    @GetMapping("/success.html")
    public String successfull() {
        return "success";
    }
    
	

	@GetMapping("/login.html")
	public String login() {
		return "login";
	}
	
	@GetMapping("/logout.html")
	public String logout() {
		return "login";
	}	
	
	@GetMapping("/register.html")
	public String register() {
		return "register";
	}


	@GetMapping("/accessDenied.html")
	public String fail(){
		return "accessDenied";
	}

}
