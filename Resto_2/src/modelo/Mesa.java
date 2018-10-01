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
public class Mesa {
    
    private int idMesa = -1;
    private String estadoMesa;
    private boolean tieneReserva;
    private int capacidad;
    private double cuenta;
    
    
    

    public Mesa(int idMesa, String estadoMesa, boolean tieneReserva, int capacidad, double cuenta) {
        this.idMesa = idMesa;
        this.estadoMesa=estadoMesa;
        this.tieneReserva = tieneReserva;
        this.capacidad=capacidad;
        this.cuenta=cuenta;
    }

    public Mesa(String estadoMesa, boolean tieneReserva, int capacidad, double cuenta) {
        idMesa=-1;
        this.estadoMesa=estadoMesa;
        this.tieneReserva = tieneReserva;
        this.capacidad=capacidad;
        this.cuenta=cuenta;
        
    }

    public Mesa() {
        idMesa = -1;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public String getEstadoMesa() {
        return estadoMesa;
    }

    public void setEstadoMesa(String estadoMesa) {
        this.estadoMesa = estadoMesa;
    }

    public boolean isTieneReserva() {
        return tieneReserva;
    }

    public void setTieneReserva(boolean tieneReserva) {
        this.tieneReserva = tieneReserva;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getCuenta() {
        return cuenta;
    }

    public void setCuenta(double cuenta) {
        this.cuenta = cuenta;
    }
    
}
