/*
 * 
 * 
 * 
 */
package modelo;

/**
 *
 * @author Muñeca Brava
 */
public class Producto {
    
    private int idProducto=-1;
    private String nombreProducto;
    private double precio;

    public Producto(int idProducto, String nombreProducto, double precio) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precio=precio;
    }

    public Producto(String nombreProducto, double precio) {
        idProducto=-1;
        this.nombreProducto = nombreProducto;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
