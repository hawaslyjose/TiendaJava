/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variables;

/**
 *
 * @author Arturo Hawasly
 */
public class variablesMotocicleta {
 private int id;
 private String  fabricante;
 private int   precio;
 private int   autonomia; 
 private int id_prov;

    public variablesMotocicleta(int id, String fabricante, int precio, int autonomia, int id_prov) {
        this.id = id;
        this.fabricante = fabricante;
        this.precio = precio;
        this.autonomia = autonomia;
        this.id_prov = id_prov;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public int getId_prov() {
        return id_prov;
    }

    public void setId_prov(int id_prov) {
        this.id_prov = id_prov;
    }

}
