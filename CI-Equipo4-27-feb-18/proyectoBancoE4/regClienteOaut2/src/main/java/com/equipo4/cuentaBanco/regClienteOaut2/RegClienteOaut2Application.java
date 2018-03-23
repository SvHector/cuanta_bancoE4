package com.equipo4.cuentaBanco.regClienteOaut2;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RegClienteOaut2Application {
 	
	public static void main(String[] args) {
		SpringApplication.run(RegClienteOaut2Application.class, args);
	}
	
	@RequestMapping(value="index")
	public Principal user(Principal principal) {
		return principal;
		
	}
}
