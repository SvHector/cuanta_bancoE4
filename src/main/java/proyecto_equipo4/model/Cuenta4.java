package proyecto_equipo4.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cuentaE4", catalog = "info_banco2", schema = "")
public class Cuenta4 implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "ID_CUENTA")
	private int idCuenta;
	@Column(name = "ID_CTE")
	private int idCliente;
	@Column(name = "EJECUTIVO")
	private String ejecutivo;
	@Column(name = "SALDO")
	private float saldo;
	
	@JoinColumn(name = "ClienteE4_ID_CUENTA", referencedColumnName = "ID_CUENTA")
	@ManyToOne(optional = false)
	private Cliente4 Cliente4Idcliente;
	
	public Cuenta4() {
	}

	public int getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
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

	public Cliente4 getCliente4Idcliente() {
		return Cliente4Idcliente;
	}

	public void setCliente4Idcliente(Cliente4 cliente4Idcliente) {
		Cliente4Idcliente = cliente4Idcliente;
	}
	
	/*
	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idCuenta2 != null ? idCuenta2.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Cuenta2)) {
			return false;
		}
		Cuenta2 other = (Cuenta2) object;
		if ((this.idCuenta2 == null && other.idCuenta2 != null)
				|| (this.idCuenta2 != null && !this.idCuenta2.equals(other.idCuenta2))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "recursosdom.Cuenta2[ idCuenta2=" + idCuenta2 + " ]";
	}
	 */
	
	
	

}// Fin class Account
