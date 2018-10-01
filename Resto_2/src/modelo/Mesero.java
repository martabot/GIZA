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
    private int dniMesero;

    public Mesero(int idMesero, String nombreMesero, int dniMesero) {
        this.idMesero = idMesero;
        this.nombreMesero = nombreMesero;
        this.dniMesero=dniMesero;
    }
    
    public Mesero(String nombreMesero,  int dniMesero) {
        idMesero=-1;
        this.nombreMesero = nombreMesero;
        this.dniMesero=dniMesero;
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

    public int getDniMesero() {
        return dniMesero;
    }

    public void setDniMesero(int dniMesero) {
        this.dniMesero = dniMesero;
    }
    
}
