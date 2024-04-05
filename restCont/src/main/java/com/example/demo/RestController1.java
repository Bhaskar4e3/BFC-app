package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestController1 {
	@GetMapping("/home")
	public String home() {
		return "this is rest controller";
	}

}
