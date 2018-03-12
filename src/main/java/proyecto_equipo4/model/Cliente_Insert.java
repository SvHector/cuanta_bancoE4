package proyecto_equipo4.model;

public class Cliente_Insert {
	
	private String nombre;
	private String telefono;
	private String direccion;
	private String email;
	private String ejecutivo;
	private float saldo;
	

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEjecutivo() {
		return ejecutivo;
	}

	public void setEjecutivo(String ejecutivo) {
		this.ejecutivo = ejecutivo;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cliente_Insert [NOMBRE=" + nombre + ", TELEFONO=" + telefono + ", DIRECCION=" + direccion + ", EMAIL=" + email
				+ ", EJECUTIVO=" + ejecutivo + ", SALDO=" + saldo + "]";
	}
	
	public Cliente_Insert(String nombre, String telefono, String direccion, String email, String ejecutivo, float saldo) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.email = email;
		this.ejecutivo = ejecutivo;
		this.saldo = saldo;
	}
	
	public Cliente_Insert() {}

}
