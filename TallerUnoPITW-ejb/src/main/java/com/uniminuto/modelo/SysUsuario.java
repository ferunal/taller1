/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uniminuto.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "sys_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SysUsuario.findAll", query = "SELECT s FROM SysUsuario s"),
    @NamedQuery(name = "SysUsuario.findByUsrId", query = "SELECT s FROM SysUsuario s WHERE s.usrId = :usrId"),
    @NamedQuery(name = "SysUsuario.findByUsrNombre1", query = "SELECT s FROM SysUsuario s WHERE s.usrNombre1 = :usrNombre1"),
    @NamedQuery(name = "SysUsuario.findByUsrNombre2", query = "SELECT s FROM SysUsuario s WHERE s.usrNombre2 = :usrNombre2"),
    @NamedQuery(name = "SysUsuario.findByUsrApellido1", query = "SELECT s FROM SysUsuario s WHERE s.usrApellido1 = :usrApellido1"),
    @NamedQuery(name = "SysUsuario.findByUsrApellido2", query = "SELECT s FROM SysUsuario s WHERE s.usrApellido2 = :usrApellido2"),
    @NamedQuery(name = "SysUsuario.findByUsrUsuario", query = "SELECT s FROM SysUsuario s WHERE s.usrUsuario = :usrUsuario"),
    @NamedQuery(name = "SysUsuario.findByUsrClave", query = "SELECT s FROM SysUsuario s WHERE s.usrClave = :usrClave"),
    @NamedQuery(name = "SysUsuario.findByUsrEst", query = "SELECT s FROM SysUsuario s WHERE s.usrEst = :usrEst")})
public class SysUsuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "usr_id")
    private String usrId;
    @Size(max = 150)
    @Column(name = "usr_nombre1")
    private String usrNombre1;
    @Size(max = 150)
    @Column(name = "usr_nombre2")
    private String usrNombre2;
    @Size(max = 150)
    @Column(name = "usr_apellido1")
    private String usrApellido1;
    @Size(max = 150)
    @Column(name = "usr_apellido2")
    private String usrApellido2;
    @Size(max = 100)
    @Column(name = "usr_usuario")
    private String usrUsuario;
    @Size(max = 1000)
    @Column(name = "usr_clave")
    private String usrClave;
    @Column(name = "usr_est")
    private Boolean usrEst;
    @JoinColumn(name = "rol_id", referencedColumnName = "rol_id")
    @ManyToOne
    private SysRol rolId;

    public SysUsuario() {
    }

    public SysUsuario(String usrId) {
        this.usrId = usrId;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getUsrNombre1() {
        return usrNombre1;
    }

    public void setUsrNombre1(String usrNombre1) {
        this.usrNombre1 = usrNombre1;
    }

    public String getUsrNombre2() {
        return usrNombre2;
    }

    public void setUsrNombre2(String usrNombre2) {
        this.usrNombre2 = usrNombre2;
    }

    public String getUsrApellido1() {
        return usrApellido1;
    }

    public void setUsrApellido1(String usrApellido1) {
        this.usrApellido1 = usrApellido1;
    }

    public String getUsrApellido2() {
        return usrApellido2;
    }

    public void setUsrApellido2(String usrApellido2) {
        this.usrApellido2 = usrApellido2;
    }

    public String getUsrUsuario() {
        return usrUsuario;
    }

    public void setUsrUsuario(String usrUsuario) {
        this.usrUsuario = usrUsuario;
    }

    public String getUsrClave() {
        return usrClave;
    }

    public void setUsrClave(String usrClave) {
        this.usrClave = usrClave;
    }

    public Boolean getUsrEst() {
        return usrEst;
    }

    public void setUsrEst(Boolean usrEst) {
        this.usrEst = usrEst;
    }

    public SysRol getRolId() {
        return rolId;
    }

    public void setRolId(SysRol rolId) {
        this.rolId = rolId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrId != null ? usrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SysUsuario)) {
            return false;
        }
        SysUsuario other = (SysUsuario) object;
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.uniminuto.modelo.SysUsuario[ usrId=" + usrId + " ]";
    }
    
}
