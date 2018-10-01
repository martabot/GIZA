/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author sarah
 */
public class Pedido {
    
    private int idPedido=-1;
    private Mesa mesa;
    private Mesero mesero;
    private Producto producto;
    private double subTotal;
    private LocalDate fechaPedido;
    

    public Pedido(int idPedido, Mesa mesa, Mesero mesero, Producto producto, double subTotal, LocalDate fechaPedido) {
        this.idPedido = idPedido;
        this.mesa=mesa;
        this.mesero = mesero;
        this.producto=producto;
        this.subTotal=subTotal;
        this.fechaPedido=fechaPedido;
    }

    public Pedido(Mesa mesa, Mesero mesero, Producto producto, double subTotal, LocalDate fechaPedido) {
        idPedido=-1;
        this.mesa=mesa;
        this.mesero = mesero;
        this.producto=producto;
        this.subTotal=subTotal;
        this.fechaPedido=fechaPedido;
    }

    public Pedido() {
        idPedido=-1;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }
    
    
}
