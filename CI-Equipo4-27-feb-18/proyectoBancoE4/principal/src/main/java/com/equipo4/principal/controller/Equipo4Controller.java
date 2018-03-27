package com.equipo4.principal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.equipo4.principal.model.Cliente_Insert;
import com.equipo4.principal.model.Cliente_Output;
import com.equipo4.principal.service.ClientService;

	@RestController
	public class Equipo4Controller {
		@Autowired
		@Qualifier("ssp_equipo4")
		private ClientService ssp_equipo4;

		//@RequestMapping(value = "/datos", method = RequestMethod.POST)
		@RequestMapping(value = "/executestored", method = RequestMethod.GET)
		@ResponseBody
		public Cliente_Output alta(@RequestBody Cliente_Insert input) {
			return ssp_equipo4.execute(input);
		}

}
