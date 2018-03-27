package com.equipo4.principal.service;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.stereotype.Service;

import com.equipo4.principal.model.Cliente_Insert;
import com.equipo4.principal.model.Cliente_Output;

@Service("ssp_equipo4")
public class ClientService extends StoredProcedure {
	
	private static final String STORED_PRO = "SPINSETARDATATABLES";
	
	@Autowired
	ClientService(DataSource dataSource) {
		super(dataSource, STORED_PRO);
		declareParameter(new SqlParameter("NOMBRE", Types.VARCHAR));
		declareParameter(new SqlParameter("EMAIL", Types.VARCHAR));
		declareParameter(new SqlParameter("TELEFONO", Types.VARCHAR));
		declareParameter(new SqlParameter("DIRECCION", Types.VARCHAR));		
		declareParameter(new SqlParameter("SALDO", Types.FLOAT));
		declareParameter(new SqlParameter("EJECUTIVO", Types.VARCHAR));
		
		
		declareParameter(new SqlOutParameter("ID_CTE_OUT", Types.INTEGER));
		declareParameter(new SqlOutParameter("EJECUTIVO", Types.INTEGER));
	    declareParameter(new SqlOutParameter("SALDO_OUT", Types.FLOAT));
	    compile();
	}
	
	public Cliente_Output execute(Cliente_Insert input) {
		Map<String, Object> inParams = new HashMap<String, Object>();
		inParams.put("NOMBRE", input.getNombre());
		inParams.put("DIRECCION", input.getDireccion());
		inParams.put("EMAIL", input.getEmail());
		inParams.put("TELEFONO", input.getTelefono());
		inParams.put("SALDO", input.getSaldo());
		inParams.put("EJECUTIVO", input.getEjecutivo());

		Map<String, Object> out = super.execute(inParams);
		out.put("ID_CTE_OUT", String.format("%08d", out.get("ID_CTE_OUT")));
		
		return new Cliente_Output(out);
	}	
}

