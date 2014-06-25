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
public class TipoIgleisa {
    private int idti;
    private String nomtipo;

    public TipoIgleisa(String nomtipo) {
        this.nomtipo = nomtipo;
    }

    public TipoIgleisa() {
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
