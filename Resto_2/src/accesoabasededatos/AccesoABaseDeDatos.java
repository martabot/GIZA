/*
 * 
 * 
 * 
 */
package accesoabasededatos;

import modelo.Conexion;
import java.text.ParseException;
import modelo.Mesero;
import modelo.MeseroData;

/**
 *
 * @author sarah
 */
public class AccesoABaseDeDatos {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        
        Conexion conexion;
 
        try {
            conexion = new Conexion();
      
            //Nuevo:
            MeseroData mesero=new MeseroData(conexion);
            Mesero mesero1=new Mesero("Pedrito",333);
            mesero.guardarMeseros(mesero1);
            System.out.println("El id del mesero es: " + mesero1.getIdMesero());
            
            //Consulta:
            mesero.obtenerMesero().forEach(meser-> {
                System.out.println("Nombre: "+meser.getNombreMesero());
            });

        } catch (Exception e) {
            System.out.println("Error al instanciar la clase conexion: " + e.getMessage());
        }
   
        
    }
    
}
