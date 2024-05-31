package com.codingdojo.rotular;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DojoController {
	
	@GetMapping("/{dojo}")
	public String getMethdName(@PathVariable("dojo")String dojo) {
		switch (dojo) {
			case "dojo":
				return"¡El Dojo es increible!";
			case "burbank-dojo":
				return "El Dojo Burbank esta localizado al sur de California";
			case "san-jose":
				return "El Dojo SJ es el cuartel general";
			default:
				return "No conozco el dojo"+dojo;
		}
	}
}
