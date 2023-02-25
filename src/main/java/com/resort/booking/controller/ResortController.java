package com.resort.booking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResortController {
 
	@GetMapping("/")
	public String home() {

		return "index";
	}

	@GetMapping("/explore")
	public String explore() {

		return "explore";
	}

	
	@GetMapping("/bb")
	public String bb() {

		return "bb";
	}

	@GetMapping("/contact")
	public String contact() {

		return "contact";
	}

	@GetMapping("/login")
	public String login() {
		
		System.out.println("I am log in get method");
		
		return "login";

	}

	@GetMapping("/signup")
	public String signup() {

		return "signup";

	}

}
