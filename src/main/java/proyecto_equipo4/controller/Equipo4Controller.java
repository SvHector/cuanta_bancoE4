package proyecto_equipo4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import proyecto_equipo4.model.Cliente_Insert;
import proyecto_equipo4.model.Cliente_Output;
import proyecto_equipo4.service.ClientService;

	@RestController
	public class Equipo4Controller {
		@Autowired
		@Qualifier("ssp_equipo4")
		private ClientService ssp_equipo4;

		@RequestMapping(value = "/executestored", method = RequestMethod.POST)
		@ResponseBody
		public Cliente_Output alta(@RequestBody Cliente_Insert input) {
			return ssp_equipo4.execute(input);
		}

}
