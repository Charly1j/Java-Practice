package com.codingdojo.contador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class VisitController {
	 @GetMapping("/")
	    public String index(HttpSession session) {
	        // Obtener el contador de la sesión o inicializarlo si es la primera visita
	        VisitCounter visitCounter = (VisitCounter) session.getAttribute("visitCounter");
	        if (visitCounter == null) {
	            visitCounter = new VisitCounter();
	            session.setAttribute("visitCounter", visitCounter);
	        }

	        // Incrementar el contador y mostrar la página principal
	        visitCounter.increment();
	        return "index.jsp";
	    }

	    @GetMapping("/counter")
	    public String counter(HttpSession session, Model model) {
	        // Obtener el contador de la sesión
	        VisitCounter visitCounter = (VisitCounter) session.getAttribute("visitCounter");

	        // Mostrar la página del contador con el valor actual del contador
	        model.addAttribute("visitCount", visitCounter != null ? visitCounter.getCount() : 0);
	        return "counter.jsp";
	    }

}
