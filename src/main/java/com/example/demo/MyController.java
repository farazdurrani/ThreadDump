package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/test")
	public String test() {
		Thread.dumpStack();
		return "hi";
	}
}
