package proyecto_equipo4.controller;

import proyecto_equipo4.model.Client4;
import proyecto_equipo4.repository.RepositoryCLient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

@Controller
public class Equipo4Controller 
{
    //@Autowired
	//RepositoryCLient repositoryClien;
    
	//craete a new Clien
	//@PostMapping("/")
	//public Client4 createClient(@Valid @RequestBody Client4 clien4) 
	//{
	//  return repositoryClien.save(clien4);
   //}
	
	@RequestMapping("/saludo")
	public String saludo()
	{
		return "hola";
	}//Fin request mapping /saludo

}
