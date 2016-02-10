/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uniminuto.web.adm;

import com.uniminuto.controlador.SysUsuarioFacadeLocal;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Administrador
 */
@SessionScoped
@Named(value = "administracionJSFBean")
public class AdministracionJSFBean implements Serializable {

    private TablaUsuario tablaUsuarioSel = new TablaUsuario();
    private List<TablaUsuario> lstTablaUsuarios = new ArrayList<>();

    private void cargarUsuarios() {
        lstTablaUsuarios = sysUsuarioFL.findAll().
                stream().map(e -> new TablaUsuario(e)).
                collect(Collectors.toList());
    }

    public void cargarTabla_AE() {
        cargarUsuarios();

    }
    @EJB
    SysUsuarioFacadeLocal sysUsuarioFL;

//    @PostConstruct
//    public void init() {
//        cargarUsuarios();
//    }
    /**
     * @return the tablaUsuarioSel
     */
    public TablaUsuario getTablaUsuarioSel() {
        return tablaUsuarioSel;
    }

    /**
     * @param tablaUsuarioSel the tablaUsuarioSel to set
     */
    public void setTablaUsuarioSel(TablaUsuario tablaUsuarioSel) {
        this.tablaUsuarioSel = tablaUsuarioSel;
    }

    /**
     * @return the lstTablaUsuarios
     */
    public List<TablaUsuario> getLstTablaUsuarios() {
        return lstTablaUsuarios;
    }

    /**
     * @param lstTablaUsuarios the lstTablaUsuarios to set
     */
    public void setLstTablaUsuarios(List<TablaUsuario> lstTablaUsuarios) {
        this.lstTablaUsuarios = lstTablaUsuarios;
    }

}
