package com.equipo4.dao;

import java.util.List;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;

import com.equipo4.entities.Cuenta;

public interface CuentaRepository extends CrudRepository<Cuenta, Integer> {

	@Procedure
	List<Cuenta> addClient(String cteName, String phone, String email, String address, String balance, String executive);
	
}
