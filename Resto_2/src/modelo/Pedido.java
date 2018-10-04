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
    private LocalDate fechaPedido;
    private double cuenta;
    

    public Pedido(int idPedido, Mesa mesa, Mesero mesero, LocalDate fechaPedido, double cuenta) {
        this.idPedido = idPedido;
        this.mesa=mesa;
        this.mesero = mesero;
        this.fechaPedido=fechaPedido;
        this.cuenta=cuenta;
    }

    public Pedido(Mesa mesa, Mesero mesero, LocalDate fechaPedido, double cuenta) {
        idPedido=-1;
        this.mesa=mesa;
        this.mesero = mesero;
        this.fechaPedido=fechaPedido;
        this.cuenta=cuenta;
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

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public double getCuenta() {
        return cuenta;
    }

    public void setCuenta(double cuenta) {
        this.cuenta = cuenta;
    }
    
}
