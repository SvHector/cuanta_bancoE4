package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.UserRepository;
import com.example.model.Usuario;

@Controller
@RequestMapping(path="/validacion") 
public class MainController {

	@Autowired
	
	private UserRepository userRepository;

	@GetMapping(path="/add")
	public @ResponseBody String addNewUser (@RequestParam String cteName
			, @RequestParam String email, @RequestParam int phone, 
			@RequestParam String name, @RequestParam String executive,
			@RequestParam int balance) {
		
		
		Usuario n = new Usuario();
		n.setCteName(cteName);
		n.setEmail(email);
		n.setPhone(phone);
		n.setExecutive(executive);
		n.setBalance(balance);
		
		return "Saved";
		
	}
	 
	
		
		@GetMapping(path="/all")
		public @ResponseBody Iterable<Usuario> getAllUsers() {
			// This returns a JSON or XML with the users
			return userRepository.findAll();
		}

	
}
