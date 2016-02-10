/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uniminuto.web.adm;

import com.uniminuto.modelo.SysUsuario;

/**
 *
 * @author Administrador
 */
public class TablaUsuario {

    private SysUsuario sysUsuario = new SysUsuario();

    public TablaUsuario() {
    }

    public TablaUsuario(SysUsuario pSysUsuario) {
        this.sysUsuario = pSysUsuario;
    }

    /**
     * @return the sysUsuario
     */
    public SysUsuario getSysUsuario() {
        return sysUsuario;
    }

    /**
     * @param sysUsuario the sysUsuario to set
     */
    public void setSysUsuario(SysUsuario sysUsuario) {
        this.sysUsuario = sysUsuario;
    }
}
