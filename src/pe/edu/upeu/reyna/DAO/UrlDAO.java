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
import pe.edu.upeu.reyna.modelo.Url;
/**
 *
 * @author USER
 */
public class UrlDAO {
    private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql;
    ArrayList<Url> lista = null;
    public ArrayList<Url> listarUrl(){
    lista = new ArrayList();
    sql = "SELECT *FROM url";
        try {
            cx = Conexion.getConex();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Url url = new Url();
                url.setIdurl(rs.getInt("idurl"));
                url.setIdrol(rs.getInt("idrol"));
                url.setMenu(rs.getString("menu"));
                url.setLink(rs.getString("link"));
                lista.add(url);
            }
        } catch (SQLException e) {
        }
    
    
    return lista;
    }
    public int idUrl(String menu){
    int id=0;
    sql ="SELECT *FROM url WHERE menu='"+menu+"'";
    try {
            cx = Conexion.getConex();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                id = rs.getInt("idurl");
            }
        } catch (SQLException e) {
        }
    return id;
    }
}
