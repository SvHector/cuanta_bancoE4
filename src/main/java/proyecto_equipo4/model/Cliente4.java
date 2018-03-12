package proyecto_equipo4.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "clienteE4", catalog = "info_banco2", schema = "") // Se define la tabla y la base de datos a utilizar
public class Cliente4 implements Serializable {
	
	private static final long serialVersionUID = 1L;
	/* Declaro las variables der los campos que seran ingresados en la 
	BD con sus respectivos nombres de columnas y tipo de dato */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Indicamos que el ID se autoincrementara
	@Basic(optional = false)
	@Column(name = "ID_CTE") //@Column indica la columna de refrencia
	private int idcliente;
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "TELEFONO")
	private String telefono;
	@Column(name = "DIRECCION")
	private String direccion;
	
	// Construimos el Mapeo  de uno a muchos para el id cliente
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "Cliente4Idcliente") 
	private List<Cuenta4> cuenta4List;
	
	public Cliente4() {
	}
	
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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

	/*	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Cliente2)) {
			return false;
		}
		Cliente2 other = (Cliente2) object;
		if ((this.idCliente2 == null && other.idCliente2 != null)
				|| (this.idCliente2 != null && !this.idCliente2.equals(other.idCliente2))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "recursosdom.Cliente2[ idCliente2=" + idCliente2 + " ]";
	}*/
	
	
	

}// Fin class Client4
