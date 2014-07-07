/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.reyna.modelo;

import java.sql.Date;

/**
 *
 * @author USER
 */
public class Visita {
    private int idv;
    private int idp;
    private String nombre;
    private Date fecha_date;
    private String direcc;
    private String telf;
    private String detalle;
    private Date hora;
    private int n_visitas;
    private String bautisado;

    public Visita() {
    }
    public Visita(int idp, String nombre, Date fecha_date, String direcc, String telf, String detalle, Date hora, int n_visitas, String bautisado) {
        this.idp = idp;
        this.nombre = nombre;
        this.fecha_date = fecha_date;
        this.direcc = direcc;
        this.telf = telf;
        this.detalle = detalle;
        this.hora = hora;
        this.n_visitas = n_visitas;
        this.bautisado = bautisado;
    }

    public int getIdv() {
        return idv;
    }

    public void setIdv(int idv) {
        this.idv = idv;
    }

    public int getIdp() {
        return idp;
    }

    public void setIdp(int idp) {
        this.idp = idp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_date() {
        return fecha_date;
    }

    public void setFecha_date(Date fecha_date) {
        this.fecha_date = fecha_date;
    }

    public String getDirecc() {
        return direcc;
    }

    public void setDirecc(String direcc) {
        this.direcc = direcc;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public int getN_visitas() {
        return n_visitas;
    }

    public void setN_visitas(int n_visitas) {
        this.n_visitas = n_visitas;
    }

    public String getBautisado() {
        return bautisado;
    }

    public void setBautisado(String bautisado) {
        this.bautisado = bautisado;
    }
    
}
