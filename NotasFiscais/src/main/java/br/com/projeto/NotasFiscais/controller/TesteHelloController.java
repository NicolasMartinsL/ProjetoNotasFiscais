package br.com.projeto.NotasFiscais.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TesteHelloController {
	
	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		return "Hello World";
	}
	
	
}
