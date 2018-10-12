/*
 * 
 * 
 * 
 */
package accesoabasededatos;

import modelo.Conexion;
import java.text.ParseException;
import java.util.stream.Collectors;
import modelo.Mesa;
import modelo.MesaData;
import modelo.Mesero;
import modelo.MeseroData;
import modelo.ReservaData;

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
      
            /*/Nuevo:
            MeseroData mesero=new MeseroData(conexion);
            Mesero mesero1=new Mesero("pedrito1");
            mesero.guardarMeseros(mesero1);
            System.out.println("El id del mesero es: " + mesero1.getIdMesero());
            */
            //Consulta:
           MesaData mesa=new MesaData(conexion);
           Mesa mesita=new Mesa(19,"Reservada",3);
            System.out.println("la mesa "+mesita.getIdMesa()+" está "+mesita.getEstadoMesa());
           

        } catch (Exception e) {
            System.out.println("Error al instanciar la clase conexion: " + e.getMessage());
        }
       
   
        
    }
    
}
