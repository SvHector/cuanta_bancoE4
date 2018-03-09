package proyecto_equipo4.model;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Client4 
{
	//declaro las variables der los campos que seran ingresados en la BD
	@Id
	private String email;
	private String nameclient, telephone, address;

	//methods getters
	public String getNameclient(){return nameclient;}
	public String getEmail(){return email;}
	public String getTelephone(){return telephone;}
	public String getAddress(){return address;}

	//methods Setters
	public void setNameclient(String nameclient){this.nameclient = nameclient;}
	public void setEmail(String email){this.email = email;}	
	public void setTelephone(String telephone){this.telephone = telephone;}	
	public void setAddress(String address){this.address = address;}
	
   
}//end class Cliente4
