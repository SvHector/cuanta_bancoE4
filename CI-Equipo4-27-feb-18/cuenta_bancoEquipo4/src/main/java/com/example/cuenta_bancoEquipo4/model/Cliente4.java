package com.example.cuenta_bancoEquipo4.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "cliente4", catalog = "info_banco2", schema = "")
public class Cliente4 implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "CTE_ID")
	private Integer CTE_ID;
	@Column(name = "CTE_NAME")
	private String CTE_NAME;
	@Column(name = "EMAIL")
	private String EMAIL;
	@Column(name = "PHONE")
	private String PHONE;
	@Column(name = "ADDRESS")
	private String ADDRESS;
	@Column(name = "BALANCE")
	private String BALANCE;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente4CTE_ID")
	private List<Cuenta4> cuenta2List;

	public Cliente4() {
	}

	public Cliente4(Integer CTE_ID) {
		this.CTE_ID = CTE_ID;
	}

	public Integer getCTE_ID() {
		return CTE_ID;
	}

	public void setCTE_ID(Integer CTE_ID) {
		this.CTE_ID = CTE_ID;
	}

	public String getCTE_NAME() {
		return CTE_NAME;
	}

	public void setCTE_NAME(String CTE_NAME) {
		this.CTE_NAME = CTE_NAME;
	}

	public String getADDRESS() {
		return ADDRESS;
	}

	public void setAddress(String ADDRESS) {
		this.ADDRESS = ADDRESS;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String EMAIL) {
		this.EMAIL = EMAIL;
	}

	public String getPHONE() {
		return PHONE;
	}

	public void setPhone(String PHONE) {
		this.PHONE = PHONE;
	}

	@XmlTransient
	public List<Cuenta4> getCuenta4List() {
		return cuenta4List;
	}

	public void setCuenta2List(List<Cuenta4> cuenta4List) {
		this.cuenta4List = cuenta4List;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (CTE_ID != null ? CTE_ID.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Cliente4)) {
			return false;
		}
		Cliente4 other = (Cliente4) object;
		if ((this.CTE_ID == null && other.CTE_ID != null)
				|| (this.CTE_ID != null && !this.CTE_ID.equals(other.CTE_ID))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "recursosdom.Cliente2[ idCliente2=" + CTE_ID + " ]";
	}

}
