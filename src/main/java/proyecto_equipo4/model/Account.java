package proyecto_equipo4.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Account
{
	@Id
	@GeneratedValue
	private int idClient; 
	
	private int idCount; 
	private String executive;
    private float balance;
	
	//methods Getters
	public int getIdClient() {return idClient;}
	public int getIdCount() {return idCount;}
	public String getExecutive() {return executive;}
	public float getBalance() {return balance;}
	
	//methods Setters
	public void setIdClient(int idClient) {this.idClient = idClient;}
	public void setIdCount(int idCount) {this.idCount = idCount;}
	public void setExecutive(String executive) {this.executive = executive;}
	public void setBalance(float balance) {this.balance = balance;}

}//end class Account
