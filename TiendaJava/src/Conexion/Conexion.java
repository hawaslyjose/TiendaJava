/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class Conexion {
    static String bd ="reto5";
    static String login ="root";
    static String password="Arturoh23";
    static String url = "jdbc:mysql://localhost:3306/"+bd+"?useTimezone=true&serverTimezone=UTC";
    private String mensaje;
    Connection conn= null;
    /** Constructor de DbConnection */
    public Conexion() {
        try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         conn= DriverManager.getConnection(url,login,password);
         if(conn!=null){
             mensaje= "Conexion a base de datos "+bd+"OK";
             System.out.println(""+mensaje);
         }
        }catch(SQLException e){
            System.out.println(e);
        }catch(ClassNotFoundException e){
             System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }   
    }
    public String  getMensaje(String mensaje){
        return mensaje;
    }
    public void setMensaje(String mensaje){
            this.mensaje=mensaje;
    }
    public Connection getConnection(){
        return conn;
    }
    public void desconectar(){
        conn=null;
    }
}
