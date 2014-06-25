/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.reyna.modelo;

/**
 *
 * @author admin-harold.rojas
 */
public class TipoIglesia {
    private int idti;
    private String nomtipo;

    public TipoIglesia(String nomtipo) {
        this.nomtipo = nomtipo;
    }

    public TipoIglesia() {
    }

    public int getIdti() {
        return idti;
    }

    public void setIdti(int idti) {
        this.idti = idti;
    }

    public String getNomtipo() {
        return nomtipo;
    }

    public void setNomtipo(String nomtipo) {
        this.nomtipo = nomtipo;
    }
    
}
