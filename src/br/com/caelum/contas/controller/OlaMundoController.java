package br.com.caelum.contas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OlaMundoController {
	@RequestMapping("/olaMundoSpring")
	public String execute(){
		System.out.println("Olá Mundo Spring MVC");
		
		return "ola";
	}
}
