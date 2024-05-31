package com.codingdojo.rotular;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("coding")
public class HomeController {
	@RequestMapping("")
	public String coding() {
		return "¡Hola Coding Dojo!";
	}
	@RequestMapping("/python")
	public String python() {
		return "¡Python /Django es mejor!";
	}
	@RequestMapping("/java")
	public String java() {
		return "¡Java/Spring es lo mejor!";
	}

}


	


