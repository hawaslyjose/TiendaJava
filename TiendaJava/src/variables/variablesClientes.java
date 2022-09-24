/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variables;

import java.sql.Date;

/**
 *
 * @author Arturo Hawasly
 */
public class variablesClientes {
    private String alias;
    private String nombre;
    private String apellidos;
    private String email;
    private String celular;
    private int contrasena;
    private Date f_nacimiento;

    public variablesClientes(String alias, String nombre, String apellidos, String email, String celular, int contrasena, Date f_nacimiento) {
        this.alias = alias;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.celular = celular;
        this.contrasena = contrasena;
        this.f_nacimiento = f_nacimiento;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getContrasena() {
        return contrasena;
    }

    public void setContrasena(int contrasena) {
        this.contrasena = contrasena;
    }

    public Date getF_nacimiento() {
        return f_nacimiento;
    }

    public void setF_nacimiento(Date f_nacimiento) {
        this.f_nacimiento = f_nacimiento;
    }
    
}
