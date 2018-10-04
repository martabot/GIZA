/*
 * 
 *
 * 
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author Muñeca Brava
 */
public class Reserva {
    
    private int idReserva=-1;
    private String nombreCliente;
    private int dniCliente;
    private LocalDate fechaReserva;
    private Mesa mesa;
    private boolean estaVigente;

    public Reserva(int idReserva, String nombreCliente, int dniCliente, LocalDate fechaReserva, Mesa mesa, boolean estaVigente) {
        this.idReserva = idReserva;
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.fechaReserva = fechaReserva;
        this.mesa = mesa;
        this.estaVigente = estaVigente;
    }

    public Reserva(String nombreCliente, int dniCliente, LocalDate fechaReserva, Mesa mesa, boolean estaVigente) {
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.fechaReserva = fechaReserva;
        this.mesa = mesa;
        this.estaVigente = estaVigente;
    }

    public Reserva() {
        idReserva=-1;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public boolean isEstaVigente() {
        return estaVigente;
    }

    public void setEstaVigente(boolean estaVigente) {
        this.estaVigente = estaVigente;
    }
    
}
