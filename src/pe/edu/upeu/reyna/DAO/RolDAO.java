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
import pe.edu.upeu.reyna.modelo.Rol;

/**
 *
 * @author USER
 */
public class RolDAO {private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql;
    ArrayList<Rol> lista = null;
    public ArrayList<Rol> listarRol(){
    lista = new ArrayList();
    sql = "SELECT *FROM rol";
        try {
            cx = Conexion.getConex();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Rol rol = new Rol();
                rol.setIdrol(rs.getInt("idrol"));
                rol.setNomb_rol(rs.getString("nam_rol"));
                lista.add(rol);
            }
        } catch (SQLException e) {
        }    
    return lista;
    }
    public int idRol(String nam){
    int idr=0;
    sql ="SELECT *FROM tipo_iglesia WHERE nam_rol='"+nam+"'";
    try {
            cx = Conexion.getConex();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                idr = rs.getInt("idrol");
            }
        } catch (SQLException e) {
        }
    return idr;    
    }
}
