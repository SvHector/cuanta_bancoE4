package com.equipo4.principal.model;

import java.util.Map;

public class Cliente_Output {
	
	public String numCuenta;
	public String numCliente;
	public Double saldo;
	
	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public String getNumCliente() {
		return numCliente;
	}

	public void setNumCliente(String numCliente) {
		this.numCliente = numCliente;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Cliente_Output(String numCuenta, String numCliente, Double saldo) {
		super();
		this.numCuenta = numCuenta;
		this.numCliente = numCliente;
		this.saldo = saldo;
	}
	
	public Cliente_Output(){}
	
	public Cliente_Output (Map<String, Object> out) {
		super();
		this.numCliente = out.get("ID_CTE_OUT").toString();
        this.numCuenta = out.get("ID_CUENTA_OUT").toString();
        this.saldo = Double.parseDouble(out.get("saldoOut").toString());
	}
	

}
