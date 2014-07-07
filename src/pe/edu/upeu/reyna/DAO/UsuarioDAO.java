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
import pe.edu.upeu.reyna.modelo.Usuario;

/**
 *
 * @author USER
 */
public class UsuarioDAO {
    private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql;
    ArrayList<Usuario> lista = null;
    public ArrayList<Usuario> listarUsuario(){
    lista = new ArrayList();
    sql = "SELECT *FROM usuario";
        try {
            cx = Conexion.getConex();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Usuario us = new Usuario();
                us.setIdu(rs.getInt("idusuario"));
                us.setIdp(rs.getInt("idpersona"));
                us.setIdrol(rs.getInt("idrol"));
                us.setUser_2(rs.getString("user_2"));
                us.setPass(rs.getString("pass"));
                us.setEstado(rs.getInt("estado"));
                lista.add(us);
            }
        } catch (SQLException e) {
        }
    
    
    return lista;
    }
    public int idUsuario(String us2){
    int id=0;
    sql ="SELECT *FROM usuario WHERE user_2='"+us2+"'";
    try {
            cx = Conexion.getConex();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                id = rs.getInt("idusuario");
            }
        } catch (SQLException e) {
        }
    return id;
    }
}
