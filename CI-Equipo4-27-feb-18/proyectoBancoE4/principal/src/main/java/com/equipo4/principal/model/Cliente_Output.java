package com.equipo4.principal.model;

import java.util.Map;

public class Cliente_Output {
	
	public String numCuenta;
	public String numClienteFK;
	public Double saldo;
	
	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public String getNumClienteFK() {
		return numClienteFK;
	}

	public void setNumCliente(String numCliente) {
		this.numClienteFK = numCliente;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Cliente_Output(String numCuenta, String numClienteFK, Double saldo) {
		super();
		this.numCuenta = numCuenta;
		this.numClienteFK = numClienteFK;
		this.saldo = saldo;
	}
	
	public Cliente_Output(){}
	
	public Cliente_Output (Map<String, Object> out) {
		super();
		this.numClienteFK = out.get("ID_CTE_OUT").toString();
        this.numCuenta = out.get("ID_CUENTA_OUT").toString();
        this.saldo = Double.parseDouble(out.get("saldoOut").toString());
	}
	

}
