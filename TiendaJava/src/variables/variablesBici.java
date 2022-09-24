/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

/**
 *
 * @author USER
 */
public class variablesBici {
 
 private int id;
 private String  fabricante;
 private int   precio;
 private int   anno;  

  
 public variablesBici(int id, String fabricante, int precio, int anno
         ){
     this.id= id;
     this.fabricante=  fabricante;
     this.precio=precio;
     this.anno= anno;
     
 }
 public int getId(){
 return id;
 }
 public void setId(int id) {
this.id = id;
}
 public String getFabricante(){
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
public int getAnno() {
return anno;
}
public void setAnno(int ano) {
this.anno = ano;
}

}
