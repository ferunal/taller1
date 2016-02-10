/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uniminuto.controlador;

import com.uniminuto.modelo.SysUsuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Administrador
 */
@Local
public interface SysUsuarioFacadeLocal {

    void create(SysUsuario sysUsuario);

    void edit(SysUsuario sysUsuario);

    void remove(SysUsuario sysUsuario);

    SysUsuario find(Object id);

    List<SysUsuario> findAll();

    List<SysUsuario> findRange(int[] range);

    int count();
    
}
