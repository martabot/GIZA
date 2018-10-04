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
public class Comanda {
    private int idComanda=-1;
    private Pedido pedido;
    private Producto producto;
    private int cantidad;

    public Comanda(int idComanda, Pedido pedido, Producto producto, int cantidad) {
        this.idComanda = idComanda;
        this.pedido = pedido;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Comanda(Pedido pedido, Producto producto, int cantidad) {
        idComanda=-1;
        this.pedido = pedido;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Comanda() {
        idComanda=-1;
    }

    public int getIdComanda() {
        return idComanda;
    }

    public void setIdComanda(int idComanda) {
        this.idComanda = idComanda;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
