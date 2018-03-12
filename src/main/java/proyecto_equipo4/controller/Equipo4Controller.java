package proyecto_equipo4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.jpa.repository.JpaRepository;

import proyecto_equipo4.model.Cliente_Insert;
import proyecto_equipo4.model.Cliente_Output;
import proyecto_equipo4.service.ClientService;

import javax.validation.Valid;

//import com.storedprocedures.services.StoredService;

	
	@RestController
	public class Equipo4Controller {
		@Autowired
		@Qualifier("storedservice")
		private ClientService storedService;

		@RequestMapping(value = "/executestored", method = RequestMethod.POST)
		@ResponseBody
		public Cliente_Output alta(@RequestBody Cliente_Insert input) {
			return storedService.execute(input);
		}

}
