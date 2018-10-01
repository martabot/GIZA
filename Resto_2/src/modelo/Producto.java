/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author sarah
 */
public class Producto {
    
    private int idProducto=-1;
    private String nombreProducto;
    private int cantidadProducto;
    private double precio;

    public Producto(int idProducto, String nombreProducto, int cantidadProducto, double precio) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
        this.precio=precio;
    }

    public Producto(String nombreProducto, int cantidadProducto, double precio) {
        idProducto=-1;
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
        this.precio=precio;
    }

    public Producto() {
        idProducto=-1;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
