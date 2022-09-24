/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import variables.variablesBici;
import Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.TableRowSorter;
import variables.variablesClientes;
import variables.variablesCompras;
import variables.variablesMotocicleta;

/**
 *
 * @author USER
 */
public class metodos {
        public void registrarusuarioBici(variablesBici usu)
    {
            String  mensaje;
            
            Conexion conex = new Conexion();
            try {
                        Statement estatuto = conex.getConnection().createStatement();
                        estatuto.executeUpdate("INSERT INTO bicicletas VALUES "
                                + "('"+usu.getId()+"', '"
                                +usu.getFabricante()+"', '"+usu.getPrecio()+"', '"
                                +usu.getAnno()+"')");
                                    mensaje="Se ha resgistradro Exitosamente";
                                    estatuto.close();
                                    conex.desconectar();
            }catch (SQLException e) {
                mensaje="No se registro";
            }    
        }
        
 public ArrayList buscarUsuario()
   {
       String  mensaje2;
       Conexion conex= new Conexion();
       ArrayList<variablesBici> listausuario;
       listausuario = new ArrayList<>();
       try {
                PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM bicicletas");
               
                ResultSet res = consulta.executeQuery();
                while (res.next()){
                listausuario.add(new variablesBici(res.getInt("id"),res.getNString("fabricante"),
                             res.getInt("precio"), res.getInt("anno")));
                }
                res.close();
                conex.desconectar();
                } catch (SQLException e){
                     mensaje2="No se registro";
                }
       return listausuario;
   }
 
 public void modificarRegistro(variablesBici reg) {
    Conexion conex= new Conexion();
    try{
    String consulta="UPDATE bicicletas SET id= ?, fabricante=? , precio=? , anno=? WHERE id=? ";

    PreparedStatement estatuto =
    conex.getConnection().prepareStatement(consulta);
    estatuto.setInt(1, reg.getId());
    estatuto.setString(2, reg.getFabricante());
    estatuto.setInt(3, reg.getPrecio());
    estatuto.setInt(4, reg.getAnno());
    estatuto.setInt(5, reg.getId());
    estatuto.executeUpdate();

    JOptionPane.showMessageDialog(null, " Se ha Modificado Correctamente ",
            "Confirmación",JOptionPane.INFORMATION_MESSAGE);

    }catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al Modificar",
            "Error",JOptionPane.ERROR_MESSAGE);
            }

}
 
public void eliminarRegistro(Integer reg)
{
    Conexion conex= new Conexion();
    try {
        Statement estatuto = conex.getConnection().createStatement();

        estatuto.executeUpdate("DELETE FROM bicicletas WHERE id='"+reg+"'");
        JOptionPane.showMessageDialog(null, " Se ha Eliminado Correctamente","Información",JOptionPane.INFORMATION_MESSAGE);

        estatuto.close();
        conex.desconectar();
    } catch (SQLException e) {
    System.out.println(e.getMessage());

    JOptionPane.showMessageDialog(null, "No se Elimino");
    }
}
public  ArrayList<variablesBici> buscarRegistro(Integer reg){
Conexion conex= new Conexion();
        ArrayList<variablesBici> listaRegistro;
        listaRegistro = new ArrayList<>();
        try {
         
        PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM bicicletas Where id='"+reg+"'");
        ResultSet res = consulta.executeQuery();
                
       
        
                while (res.next()){
                listaRegistro.add(new variablesBici(res.getInt("id"),res.getNString("fabricante"),
                             res.getInt("precio"), res.getInt("anno")));
                }
                res.close();
                conex.desconectar();
                } catch (SQLException e){
                     
                }
       
       return listaRegistro;
    }
//Empieza codigo para motocicletas
        public void registrarusuarioMoto(variablesMotocicleta usu)
    {
            String  mensaje;
            
            Conexion conex = new Conexion();
            try {
                        Statement estatuto = conex.getConnection().createStatement();
                        estatuto.executeUpdate("INSERT INTO motocicletas VALUES "
                                + "('"+usu.getId()+"', '"
                                +usu.getFabricante()+"', '"+usu.getPrecio()+"', '"
                                +usu.getAutonomia()+"', '"+usu.getId_prov()+"')");
                                    mensaje="Se ha resgistradro Exitosamente";
                                    estatuto.close();
                                    conex.desconectar();
            }catch (SQLException e) {
                mensaje="No se registro";
            }    
        }
        
         public ArrayList buscarUsuarioMoto()
   {
       String  mensaje2;
       Conexion conex= new Conexion();
       ArrayList<variablesMotocicleta> listausuario;
       listausuario = new ArrayList<>();
       try {
                PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM motocicletas");
               
                ResultSet res = consulta.executeQuery();
                while (res.next()){
                listausuario.add(new variablesMotocicleta(res.getInt("id"),res.getNString("fabricante"),
                             res.getInt("precio"), res.getInt("autonomia"), res.getInt("id_prov")));
                }
                res.close();
                conex.desconectar();
                } catch (SQLException e){
                     mensaje2="No se registro";
                }
       return listausuario;
   }
         
    public void modificarRegistroMoto(variablesMotocicleta reg) {
    Conexion conex= new Conexion();
    try{
    String consulta="UPDATE motocicletas SET id= ?, fabricante=? , precio=? , autonomia=? , id_prov=? WHERE id=? ";

    PreparedStatement estatuto =
    conex.getConnection().prepareStatement(consulta);
    estatuto.setInt(1, reg.getId());
    estatuto.setString(2, reg.getFabricante());
    estatuto.setInt(3, reg.getPrecio());
    estatuto.setInt(4, reg.getAutonomia());
    estatuto.setInt(5, reg.getId_prov());
    estatuto.setInt(6, reg.getId());
    estatuto.executeUpdate();

    JOptionPane.showMessageDialog(null, " Se ha Modificado Correctamente ",
            "Confirmación",JOptionPane.INFORMATION_MESSAGE);

    }catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al Modificar",
            "Error",JOptionPane.ERROR_MESSAGE);
            }

}
    
    public void eliminarRegistroMoto(Integer reg)
{
    Conexion conex= new Conexion();
    try {
        Statement estatuto = conex.getConnection().createStatement();

        estatuto.executeUpdate("DELETE FROM motocicletas WHERE id='"+reg+"'");
        JOptionPane.showMessageDialog(null, " Se ha Eliminado Correctamente","Información",JOptionPane.INFORMATION_MESSAGE);

        estatuto.close();
        conex.desconectar();
    } catch (SQLException e) {
    System.out.println(e.getMessage());

    JOptionPane.showMessageDialog(null, "No se Elimino");
    }
}
    
    public  ArrayList<variablesMotocicleta> buscarRegistroMoto(Integer reg){
Conexion conex= new Conexion();
        ArrayList<variablesMotocicleta> listaRegistro;
        listaRegistro = new ArrayList<>();
        try {
         
        PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM motocicletas Where id='"+reg+"'");
        ResultSet res = consulta.executeQuery();
                
       
        
                while (res.next()){
                listaRegistro.add(new variablesMotocicleta(res.getInt("id"),res.getNString("fabricante"),
                             res.getInt("precio"), res.getInt("autonomia"), res.getInt("id_prov")));
                }
                res.close();
                conex.desconectar();
                } catch (SQLException e){
                     
                }
       
       return listaRegistro;
    }
    
    ///// Metodos de compras
    
    public void registrarusuarioCompras(variablesCompras usu)
    {
            String  mensaje;
            
            Conexion conex = new Conexion();
            try {
                        Statement estatuto = conex.getConnection().createStatement();
                        estatuto.executeUpdate("INSERT INTO compras VALUES "
                                + "('"+usu.getId()+"', '"
                                +usu.getAlias()+"', '"+usu.getFabricante()+"', '"
                                +usu.getFecha_hora()+"')");
                                    mensaje="Se ha resgistradro Exitosamente";
                                    estatuto.close();
                                    conex.desconectar();
            }catch (SQLException e) {
                mensaje="No se registro";
            }    
        }
         
    public ArrayList buscarUsuarioCompras()
   {
       String  mensaje2;
       Conexion conex= new Conexion();
       ArrayList<variablesCompras> listausuario;
       listausuario = new ArrayList<>();
       try {
                PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM compras");
               
                ResultSet res = consulta.executeQuery();
                while (res.next()){
                listausuario.add(new variablesCompras(res.getInt("id"),res.getNString("alias"),
                             res.getNString("fabricante"), res.getTimestamp("fecha_hora")));
                }
                res.close();
                conex.desconectar();
                } catch (SQLException e){
                     mensaje2="No se registro";
                }
       return listausuario;
   }
          
    public void modificarRegistroCompras(variablesCompras reg) {
    Conexion conex= new Conexion();
    try{
    String consulta="UPDATE compras SET id= ?, alias=? , fabricante=? , fecha_hora=? WHERE id=? ";

    PreparedStatement estatuto =
    conex.getConnection().prepareStatement(consulta);
    estatuto.setInt(1, reg.getId());
    estatuto.setString(2, reg.getAlias());
    estatuto.setString(3, reg.getFabricante());
    estatuto.setTimestamp(4, reg.getFecha_hora());
    estatuto.setInt(5, reg.getId());
    estatuto.executeUpdate();

    JOptionPane.showMessageDialog(null, " Se ha Modificado Correctamente ",
            "Confirmación",JOptionPane.INFORMATION_MESSAGE);

    }catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al Modificar",
            "Error",JOptionPane.ERROR_MESSAGE);
            }

}
           
    public void eliminarRegistroCompras(Integer reg)
{
           Conexion conex= new Conexion();
                try {
                        Statement estatuto = conex.getConnection().createStatement();

                        estatuto.executeUpdate("DELETE FROM compras WHERE id='"+reg+"'");
                        JOptionPane.showMessageDialog(null, " Se ha Eliminado Correctamente","Información",JOptionPane.INFORMATION_MESSAGE);

                        estatuto.close();
                        conex.desconectar();
                        } catch (SQLException e) {
                                System.out.println(e.getMessage());

                                JOptionPane.showMessageDialog(null, "No se Elimino");
    }
}
           
    public  ArrayList<variablesCompras> buscarRegistroCompras(Integer reg){
        Conexion conex= new Conexion();
        ArrayList<variablesCompras> listaRegistro;
        listaRegistro = new ArrayList<>();
        try {
         
        PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM compras Where id='"+reg+"'");
        ResultSet res = consulta.executeQuery();
                
                
        
                while (res.next()){
                listaRegistro.add(new variablesCompras(res.getInt("id"),res.getNString("alias"),
                             res.getNString("fabricante"), res.getTimestamp("fecha_hora")));
                             
                }
                
                res.close();
                conex.desconectar();
                } catch (SQLException e){
                     
                }
       
       return listaRegistro;
 }
               
               
               /// metodos para clientes
               
                public void registrarusuarioClientes(variablesClientes usu)
    {
            String  mensaje;
            
            Conexion conex = new Conexion();
            try {
                        Statement estatuto = conex.getConnection().createStatement();
                        estatuto.executeUpdate("INSERT INTO clientes VALUES "
                                + "('"+usu.getAlias()+"', '"
                                +usu.getNombre()+"', '"+usu.getApellidos()+"', '"
                                +usu.getEmail()+"', '"+usu.getCelular()+"', '"+usu.getContrasena()+"', '"+usu.getF_nacimiento()+"')");
                                    mensaje="Se ha resgistradro Exitosamente";
                                    estatuto.close();
                                    conex.desconectar();
            }catch (SQLException e) {
                mensaje="No se registro";
            }    
        }
                        
          public ArrayList buscarUsuarioClientes()
   {
       String  mensaje2;
       Conexion conex= new Conexion();
       ArrayList<variablesClientes> listausuario;
       listausuario = new ArrayList<>();
       try {
                PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM clientes");
               
                ResultSet res = consulta.executeQuery();
                while (res.next()){
                listausuario.add(new variablesClientes(res.getNString("alias"),res.getNString("nombre"), res.getNString("apellidos"),
                             res.getNString("email"),res.getNString("celular"), res.getInt("contraseña"), res.getDate("f_nacimiento")));
                }
                res.close();
                conex.desconectar();
                } catch (SQLException e){
                     mensaje2="No se registro";
                }
       return listausuario;
   }     

    public void modificarRegistroClientes(variablesClientes b2) {
        
        Conexion conex= new Conexion();
        try{
            String consulta="UPDATE clientes SET alias=? , nombre=? , apellidos=? , email=? , celular=? ,contraseña=? , f_nacimiento=? WHERE alias=? ";

            PreparedStatement estatuto =
            conex.getConnection().prepareStatement(consulta);
            estatuto.setString(1, b2.getAlias());
            estatuto.setString(2, b2.getNombre());
            estatuto.setString(3, b2.getApellidos());
            estatuto.setString(4, b2.getEmail());
            estatuto.setString(5, b2.getCelular());
            estatuto.setInt(6, b2.getContrasena());
            estatuto.setDate(7, b2.getF_nacimiento());
            estatuto.setString(8, b2.getAlias());
            estatuto.executeUpdate();

            JOptionPane.showMessageDialog(null, " Se ha Modificado Correctamente ",
                    "Confirmación",JOptionPane.INFORMATION_MESSAGE);

            }catch(SQLException e){
                    System.out.println(e);
                    JOptionPane.showMessageDialog(null, "Error al Modificar",
                    "Error",JOptionPane.ERROR_MESSAGE);
                    }
            }

    public void eliminarRegistroClientes(String reg) {
        Conexion conex= new Conexion();
                try {
                        Statement estatuto = conex.getConnection().createStatement();

                        estatuto.executeUpdate("DELETE FROM clientes WHERE alias='"+reg+"'");
                        JOptionPane.showMessageDialog(null, " Se ha Eliminado Correctamente","Información",JOptionPane.INFORMATION_MESSAGE);

                        estatuto.close();
                        conex.desconectar();
                        } catch (SQLException e) {
                                System.out.println(e.getMessage());

                                JOptionPane.showMessageDialog(null, "No se Elimino");
    }  
    }

    public ArrayList<variablesClientes> buscarRegistroClientes(String reg10) {
            Conexion conex= new Conexion();
        ArrayList<variablesClientes> listaRegistro;
        listaRegistro = new ArrayList<>();
        try {
         
        PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM clientes Where alias='"+reg10+"'");
        ResultSet res = consulta.executeQuery();
                
                
        
                while (res.next()){
                listaRegistro.add(new variablesClientes(res.getNString("alias"),res.getNString("nombre"),
                             res.getNString("apellidos"),  res.getNString("email"),  res.getNString("celular"),
                         res.getInt("contraseña") , res.getDate("f_nacimiento")));
                             
                }
                
                res.close();
                conex.desconectar();
                } catch (SQLException e){
                     
                }
       
       return listaRegistro;
    }
    
    
    
    
           

    }
           
           
 
        
