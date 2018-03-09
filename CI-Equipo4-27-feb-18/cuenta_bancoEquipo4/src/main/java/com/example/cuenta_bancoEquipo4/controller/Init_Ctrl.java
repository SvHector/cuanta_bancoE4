package com.example.cuenta_bancoEquipo4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Init_Ctrl {

	@GetMapping("/inicio")
	public String index() {
		return "reg_form";
	}
	
	@GetMapping("/")
	public String raiz() {
		return "reg_form";
	}
}

