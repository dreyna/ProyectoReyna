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
import pe.edu.upeu.reyna.modelo.Distrito;

/**
 *
 * @author admin-harold.rojas
 */
public class DistritoDAO {
    private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql;
    ArrayList<Distrito> lista = null;
    public ArrayList<Distrito> listarDistrito(){
    lista = new ArrayList();
    sql = "SELECT *FORM distrito";
        try {
            cx = Conexion.getConex();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Distrito d = new Distrito();
                d.setIdd(rs.getInt("iddistrito"));
                d.setIdr(rs.getInt("idregion"));
                d.setDisc(rs.getString("distrito"));
                d.setEstado(rs.getString("estado"));
                lista.add(d);
            }
        } catch (SQLException e) {
        }
    
    
    return lista;
    }
}
