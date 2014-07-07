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
public class Url {
    private int idurl;
    private int idrol;
    private String menu;
    private String link;

    public Url() {
    }

    public Url(int idrol, String menu, String link) {
        this.idrol = idrol;
        this.menu = menu;
        this.link = link;
    }

    public int getIdurl() {
        return idurl;
    }

    public void setIdurl(int idurl) {
        this.idurl = idurl;
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    
    
}
