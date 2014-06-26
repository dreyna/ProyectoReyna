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
import pe.edu.upeu.reyna.modelo.Iglesia;


/**
 *
 * @author admin-harold.rojas
 */
public class IglesiaDAO {
    private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql;
    private int op;
    public int registrarIglesia(int idd, int idti, String nom, int cuenta){
        int idp = maxidIglesia() + 1;
    sql = "INSERT INTO iglesia VALUES('"+idp+"','"+idd+"',"
            + "'"+idti+"','"+nom+"','"+cuenta+"')";
        try {
            cx = Conexion.getConex();
            st = cx.createStatement();
            op = st.executeUpdate(sql);
        } catch (SQLException e) {
        }
    return op;
    }
    public int maxidIglesia(){
    int v =0;
    sql = "SELECT MAX(idiglesia) AS id FROM iglesia";
        try {
            cx = Conexion.getConex();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                    v = rs.getInt("id");
                }
        } catch (SQLException e) {
        }
    return v;
    }
    ArrayList<Iglesia> lista = null;
    public ArrayList<Iglesia> listarIglesia(){
    lista = new ArrayList();
    sql = "SELECT *FROM iglesia";
        try {
            cx = Conexion.getConex();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Iglesia d = new Iglesia();
                d.setIdi(rs.getInt("idiglesia"));
                d.setIdd(rs.getInt("iddistrito"));
                d.setIdti(rs.getInt("idtipo_iglesia"));
                d.setNomiglesia(rs.getString("iglesia"));
                 d.setCuenta(rs.getInt("cuenta"));
                lista.add(d);
            }
        } catch (SQLException e) {
        }
    
    
    return lista;
    }
}
