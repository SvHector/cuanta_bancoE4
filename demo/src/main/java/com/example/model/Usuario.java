package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	
	private int cteID;
	private String cteName;
	private String email;
	private int phone;
	private String name;
	private String executive;
	private int balance;
	private int accountID;
	
	
	public int getCteID() {
		return cteID;
	}
	public void setCteID(int cteID) {
		this.cteID = cteID;
	}
	public String getCteName() {
		return cteName;
	}
	public void setCteName(String cteName) {
		this.cteName = cteName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExecutive() {
		return executive;
	}
	public void setExecutive(String executive) {
		this.executive = executive;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	
	
}
