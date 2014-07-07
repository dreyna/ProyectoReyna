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
public class Region {
    private int idr;
    private String region;

    public Region() {
    }

    public Region(String region) {
        this.region = region;
    }

    public int getIdr() {
        return idr;
    }

    public void setIdr(int idr) {
        this.idr = idr;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
}
