package com.equipo4.principal.model;

import java.io.Serializable;
import java.math.BigDecimal;

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
@Table(name = "cuentae4", catalog = "info_banco2", schema = "")
public class Cuenta4 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_CUENTA")
    private Integer idCuenta;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "SALDO")
    private BigDecimal saldo;
    @Column(name = "EJECUTIVO")
    private String ejecutivo;
    @JoinColumn(name = "ID_CTE", referencedColumnName = "ID_CTE")
    @ManyToOne(optional = false)
    private Cliente4 idCte;

    public Cuenta4() {
    }

    public Cuenta4(Integer idCuenta) {
        this.idCuenta = idCuenta;
    }

    public Cuenta4(Integer idCuenta, BigDecimal saldo) {
        this.idCuenta = idCuenta;
        this.saldo = saldo;
    }

    public Integer getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(Integer idCuenta) {
        this.idCuenta = idCuenta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public String getEjecutivo() {
        return ejecutivo;
    }

    public void setEjecutivo(String ejecutivo) {
        this.ejecutivo = ejecutivo;
    }

    public Cliente4 getIdCte() {
        return idCte;
    }

    public void setIdCte(Cliente4 idCte) {
        this.idCte = idCte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCuenta != null ? idCuenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuenta4)) {
            return false;
        }
        Cuenta4 other = (Cuenta4) object;
        if ((this.idCuenta == null && other.idCuenta != null) || (this.idCuenta != null && !this.idCuenta.equals(other.idCuenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pruebas.entidades.Cuenta4[ idCuenta=" + idCuenta + " ]";
    }
    
}
