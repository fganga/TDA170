/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author fredy
 */
public class Operacion {
     Conexion conexion = new Conexion();
    public ResultSet Listar(String operacion){
        
        
        try{
            Class.forName(conexion.getDriver()).newInstance();
        Connection cn=DriverManager.getConnection(conexion.getUrl(),conexion.getUser(),conexion.getPwd());
        PreparedStatement da = cn.prepareStatement(operacion);
        ResultSet tbl = da.executeQuery();
        return tbl;
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null,e.getMessage());
            return null;
        }
    }
    public void ejecutar(String operacion){
        try{
             Class.forName(conexion.getDriver()).newInstance();
                    Connection cn=DriverManager.getConnection(conexion.getUrl(),conexion.getUser(),conexion.getPwd());
            PreparedStatement da = cn.prepareStatement(operacion);
            int r=da.executeUpdate();
              javax.swing.JOptionPane.showMessageDialog(null,"Se afectaron " + r + " filas");
           
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null,"Error "+e.getMessage());
           
        }
    }
    
}
