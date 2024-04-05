package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class Controller1 {
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/home2")
	public String home2(@ModelAttribute("name") String name,Model m) {
		m.addAttribute("name", name);
		System.out.println(name);
		return "home2";
	}


}
