package com.hscastro.cxeletronico.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
		
	@GetMapping("/")
	public String home() {
		System.out.println("ok, teste");
		return "home";
	}
	
}
