/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.reyna.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import pe.edu.upeu.reyna.config.Conexion;
import pe.edu.upeu.reyna.modelo.Region;

/**
 *
 * @author USER
 */
public class RegionDAO {
    private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql;
    ArrayList<Region> lista = null;
    public ArrayList<Region> listarRegion(){
    lista = new ArrayList();
    sql = "SELECT *FROM region";
        try {
            cx = Conexion.getConex();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Region r = new Region();
                r.setIdr(rs.getInt("idregion"));
                r.setRegion(rs.getString("region"));
                lista.add(r);
            }
        } catch (SQLException e) {
        }
    
    
    return lista;
    }
    public int idRegion(String reg){
    int idr=0;
    sql ="SELECT *FROM region WHERE region='"+reg+"'";
    try {
            cx = Conexion.getConex();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                idr = rs.getInt("idregion");
            }
        } catch (SQLException e) {
        }
    return idr;
    }
}
