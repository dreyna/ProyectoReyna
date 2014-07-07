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
import pe.edu.upeu.reyna.modelo.Persona;

/**
 *
 * @author admin-harold.rojas
 */
public class PersonaDAO {
    private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql;
    ArrayList<Persona> lista = null;
    public ArrayList<Persona> listarPersona(){
    lista = new ArrayList();
    sql = "SELECT *FROM persona";
        try {
            cx = Conexion.getConex();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Persona p = new Persona();
                p.setIdp(rs.getInt("idpersona"));
                p.setNombres(rs.getString("nombres_apellidos"));
                p.setDir(rs.getString("direccion"));
                p.setTel(rs.getString("telefono"));
                p.setEst(rs.getString("estado"));
                p.setIdd(rs.getInt("iddistrito"));
                lista.add(p);
            }
        } catch (SQLException e) {
        }
    
    
    return lista;
    }
}
