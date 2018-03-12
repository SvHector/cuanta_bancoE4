package proyecto_equipo4.model;

import java.util.Map;

public class Cliente_Output {
	
	public String numCuenta;
	public String numCliente;
	public Double saldo;
	
	
	public Cliente_Output(String numCuenta, String numCliente, Double saldo) {
		super();
		this.numCuenta = numCuenta;
		this.numCliente = numCliente;
		this.saldo = saldo;
	}
	
	public Cliente_Output(){}
	
	public Cliente_Output (Map<String, Object> out) {
		super();
		this.numCliente = out.get("idClienteOut").toString(); //Checar raiz de idClienteOut y idCuentaOut
        this.numCuenta = out.get("idCuentaOut").toString();
        this.saldo = Double.parseDouble(out.get("saldoOut").toString());
	}
	

}
