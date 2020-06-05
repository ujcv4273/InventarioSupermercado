/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import javax.swing.JOptionPane;

public class Registro {


    public String marcas;
    String codigo;
    String marca;
    int invertido;
    int precio;
    int c;
    int vendido;
    int ganancias;
    int cv;


Registro (String codigo, String marca, int invertido, int precio, int c) {

this.codigo = codigo;
this.marca = marca;
this.invertido = invertido;
this.precio = precio;
this.c = c;




}

public void setCodigo(String codigo) {

    this.codigo = codigo;
}
public void setmarca(String marca) {

    this.marca = marca;
}
public void setInvertido(int invertido) {

    this.invertido = invertido;
}
public void setPrecio(int precio) {

    this.precio = precio;
}

public void setC(int c) {

    this.c = c;
}

public void setVendido(int vendido) {

    this.vendido = vendido;
}

public void setGanancias(int ganancias) {

    this.ganancias = ganancias;
}  
}