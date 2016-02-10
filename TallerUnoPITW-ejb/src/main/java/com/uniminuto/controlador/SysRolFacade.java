/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uniminuto.controlador;

import com.uniminuto.modelo.SysRol;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Administrador
 */
@Stateless

public class SysRolFacade extends AbstractFacade<SysRol> implements SysRolFacadeLocal {
    @PersistenceContext(unitName = "com.uniminuto_TallerUnoPITW-ejb_ejb_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SysRolFacade() {
        super(SysRol.class);
    }
    
}
