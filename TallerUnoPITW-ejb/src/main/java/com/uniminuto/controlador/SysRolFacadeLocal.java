/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uniminuto.controlador;

import com.uniminuto.modelo.SysRol;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Administrador
 */
@Local
public interface SysRolFacadeLocal {

    void create(SysRol sysRol);

    void edit(SysRol sysRol);

    void remove(SysRol sysRol);

    SysRol find(Object id);

    List<SysRol> findAll();

    List<SysRol> findRange(int[] range);

    int count();
    
}
