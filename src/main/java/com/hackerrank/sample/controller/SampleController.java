package com.hackerrank.sample.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hackerrank.sample.model.Message;

@RestController
public class SampleController {
	
	@GetMapping("/defaultHello")
	public String defaultHelloWithParam(@RequestParam Optional<String> message) {
		return "{\"echo\": \"Default Hello World!\"}";
	}
	
	@PostMapping("/customHello")
	public String customHello(@RequestParam Message message) {
		return "{\"echo\": \"Custom " + message.getMessage() + "\"}";		
	}	

}
