/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.reyna.modelo;

/**
 *
 * @author USER
 */
public class Rol {
    private int idrol;
    private String nomb_rol;

    public Rol() {
    }

    public Rol(String nomb_rol) {
        this.nomb_rol = nomb_rol;
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idr) {
        this.idrol = idrol;
    }

    public String getNomb_rol() {
        return nomb_rol;
    }

    public void setNomb_rol(String nomb_rol) {
        this.nomb_rol = nomb_rol;
    }
    
}
