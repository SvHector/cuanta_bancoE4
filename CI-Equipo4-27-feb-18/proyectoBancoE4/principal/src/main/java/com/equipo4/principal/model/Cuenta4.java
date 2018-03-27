package com.equipo4.principal.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cuentae4", catalog = "p", schema = "")
public class Cuenta4 implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "ID_CUENTA")
	private int idCuenta;
	@Column(name = "ID_CTEFK")
	private int idClienteFK;
	@Column(name = "EJECUTIVO")
	private String ejecutivo;
	@Column(name = "SALDO")
	private float saldo;
	
	@JoinColumn(name = "Cuentae4_ID_CTEFK", referencedColumnName = "ID_CTE")
	@ManyToOne(optional = false)
	private Cliente4 Cliente4IdclienteFK;
	
	public Cuenta4() {
	}

	public int getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}

	public int getIdCliente() {
		return idClienteFK;
	}

	public void setIdCliente(int idCliente) {
		this.idClienteFK = idCliente;
	}

	public String getEjecutivo() {
		return ejecutivo;
	}

	public void setEjecutivo(String ejecutivo) {
		this.ejecutivo = ejecutivo;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public Cliente4 getCliente4Idcliente() {
		return Cliente4IdclienteFK;
	}

	public void setCliente4Idcliente(Cliente4 cliente4Idcliente) {
		Cliente4IdclienteFK = cliente4Idcliente;
	}

}