package com.equipo4.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.equipo4.dao.CuentaRepository;
import com.equipo4.entities.Cuenta;

@SpringBootApplication
public class DemoApl {

	public static void main(String[] args) {

		System.out.println(CuentaRepository.class);
		List<Cuenta> listaCuentas = new ArrayList <Cuenta>();
		// com.turreta.springboot.springdata.sp;
		// ComTurretaSpringbootSpringdataSpApplication.class
		ApplicationContext c = SpringApplication.run(DemoApl.class, args);
		CuentaRepository repo = c.getBean(CuentaRepository.class);
		listaCuentas = repo.addClient("Donaldo Lira", "7751020362", "donaldo.lirag@gmail.com", "CDMX", "34", "Reeny Caja Llena");
		
		for(Cuenta ctas : listaCuentas) {
			System.out.println(ctas.getCteName());
			System.out.println(ctas.getAccountId());
	}
}
}
