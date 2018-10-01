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
public class Mesero {
    
    private int idMesero=-1;
    private String nombreMesero;

    public Mesero(int idMesero, String nombreMesero) {
        this.idMesero = idMesero;
        this.nombreMesero = nombreMesero;
    }
    
    public Mesero(String nombreMesero) {
        idMesero=-1;
        this.nombreMesero = nombreMesero;
    }

    public Mesero() {
        idMesero=-1;
    }

    public int getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
    }

    public String getNombreMesero() {
        return nombreMesero;
    }

    public void setNombreMesero(String nombreMesero) {
        this.nombreMesero = nombreMesero;
    }
    
}
