package com.example.Calculator.SpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
		@GetMapping("")
		public String helloWorld() {
			return "Hello World!";
		}

		@GetMapping("/add/{num1}/{num2}")
		public int addAPI(@PathVariable int num1,@PathVariable int num2) {
			return num1 + num2;
		}
		
		@GetMapping("/subtract/{num1}/{num2}")
		public int subtractAPI(@PathVariable int num1,@PathVariable int num2) {
			return num1 - num2;
		}
		
		@GetMapping("/divide/{num1}/{num2}")
		public int divideAPI(@PathVariable int num1,@PathVariable int num2) {
			return num1 / num2;
		}
		
		@GetMapping("/multiple/{num1}/{num2}")
		public int multipleAPI(@PathVariable int num1,@PathVariable int num2) {
			return num1 * num2;
		}
}
