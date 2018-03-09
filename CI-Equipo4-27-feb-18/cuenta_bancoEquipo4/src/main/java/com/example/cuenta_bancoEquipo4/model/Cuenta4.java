package com.example.cuenta_bancoEquipo4.model;


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
@Table(name = "cuenta4", catalog = "info_banco2", schema = "")
public class Cuenta4 implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "ACCOUNT_ID")
	private Integer ACCOUNT_ID;
	@Column(name = "EXECUTIVE")
	private String EXECUTIVE;
	
	@ManyToOne
	@JoinColumn(name = "cliente4_CTE_ID_BALANCE", referencedColumnName = "CTE_ID_BALANCE")
	

	private Cliente4 cliente4CTE_ID;

	public Cuenta4() {
	}

	public Cuenta4(Integer ACCOUNT_ID) {
		this.ACCOUNT_ID = ACCOUNT_ID;
	}

	public Integer getACCOUNT_ID() {
		return ACCOUNT_ID;
	}

	public void setACCOUNT_ID(Integer ACCOUNT_ID) {
		this.ACCOUNT_ID = ACCOUNT_ID;
	}

	public String getEXECUTIVE() {
		return EXECUTIVE;
	}

	public void setEXECUTIVE(String EXECUTIVE) {
		this.EXECUTIVE = EXECUTIVE;
	}

	public Cliente4 getCliente4CTE_ID() {
		return cliente4CTE_ID;
	}

	public void setCliente4CTE_ID(Cliente4 cliente4CTE_ID) {
		this.cliente4CTE_ID = cliente4CTE_ID;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (ACCOUNT_ID != null ? ACCOUNT_ID.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Cuenta4)) {
			return false;
		}
		Cuenta4 other = (Cuenta4) object;
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

}

