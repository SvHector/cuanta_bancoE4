package com.equipo4.principal.model;

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
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "clientee4", catalog = "info_banco2", schema = "") // Se define la tabla y la base de datos a utilizar
public class Cliente4 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_CTE")
    private Integer idCte;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "DIRECCION")
    private String direccion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCte")
    private List<Cuenta4> cuentae4List;

    public Cliente4() {
    }

    public Cliente4(Integer idCte) {
        this.idCte = idCte;
    }

    public Cliente4(Integer idCte, String nombre, String email, String telefono) {
        this.idCte = idCte;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public Integer getIdCte() {
        return idCte;
    }

    public void setIdCte(Integer idCte) {
        this.idCte = idCte;
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

    @XmlTransient
    public List<Cuenta4> getCuentae4List() {
        return cuentae4List;
    }

    public void setCuentae4List(List<Cuenta4> cuentae4List) {
        this.cuentae4List = cuentae4List;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCte != null ? idCte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Cliente4)) {
            return false;
        }
        Cliente4 other = (Cliente4) object;
        if ((this.idCte == null && other.idCte != null) || (this.idCte != null && !this.idCte.equals(other.idCte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pruebas.entidades.Clientee4[ idCte=" + idCte + " ]";
    }
    
}
