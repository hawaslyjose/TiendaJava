/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variables;

import java.sql.Timestamp;

/**
 *
 * @author Arturo Hawasly
 */
public class variablesCompras {
    private int id;
    private String alias;
    private String fabricante;
    private Timestamp fecha_hora;

    public variablesCompras(int id, String alias, String fabricante, Timestamp fecha_hora) {
        this.id = id;
        this.alias = alias;
        this.fabricante = fabricante;
        this.fecha_hora = fecha_hora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabircante(String fabircante) {
        this.fabricante = fabircante;
    }

    public Timestamp getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(Timestamp fecha_hora) {
        this.fecha_hora = fecha_hora;
    }
    
}
