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
public class Mesa {
    
    private int idMesa =-1;
    private String estadoMesa;
    private int capacidad;
    
    

    public Mesa(int idMesa, String estadoMesa, int capacidad) {
        this.idMesa = idMesa;
        this.estadoMesa=estadoMesa;
        this.capacidad=capacidad;
    }

    public Mesa(String estadoMesa, boolean tieneReserva, int capacidad, double cuenta) {
        idMesa=-1;
        this.estadoMesa=estadoMesa;
        this.capacidad=capacidad;
        
    }

    public Mesa() {
        idMesa =-1;
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

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

}
