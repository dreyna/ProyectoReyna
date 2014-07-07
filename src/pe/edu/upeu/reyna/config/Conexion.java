/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.reyna.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author admin-harold.rojas
 */
public class Conexion {
    private static Connection conex = null;
    private static String url = "jdbc:mysql://localhost/visitas";
    private static String usuario = "root";
    private static String clave = "root";
    
    public static Connection getConex(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
             conex = DriverManager.getConnection(url, usuario, clave);             
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
    return conex;
    }
}
