package com.example.cuenta_bancoEquipo4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling

public class CuentaBancoEquipo4Application extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CuentaBancoEquipo4Application.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(CuentaBancoEquipo4Application.class, args);
	}
}

