/*
 * 
 * 
 * 
 */
package accesoabasededatos;

import modelo.Conexion;
import java.text.ParseException;
import java.time.LocalDate;
import static java.time.LocalDate.now;
import java.util.stream.Collectors;
import modelo.Mesa;
import modelo.MesaData;
import modelo.Mesero;
import modelo.MeseroData;
import modelo.Pedido;
import modelo.PedidoData;
import modelo.Producto;
import modelo.ProductoData;
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
            conexion.getConexion();
            /*/Nuevo:
            MeseroData mesero=new MeseroData(conexion);
            Mesero mesero1=new Mesero("pedrito1");
            mesero.guardarMeseros(mesero1);
            System.out.println("El id del mesero es: " + mesero1.getIdMesero());
            */
            //Consulta:
           //MesaData mesa=new MesaData(conexion);
           //Mesa mesita=new Mesa(19,"Reservada",3);
           // System.out.println("la mesa "+mesita.getIdMesa()+" está "+mesita.getEstadoMesa());
           /*
            MeseroData mes=new MeseroData(conexion);
            mes.borrarMesero("usuario2");
            mes.obtenerMesero().forEach(mese-> System.out.println("el mesero " +mese.getNombreMesero()));
            
            
            //PRODUCTO
            
            ProductoData p=new ProductoData(conexion);
            Producto p1=new Producto("Jamon",4);
            p.guardarProducto(p1);
            p.borrarProducto(1);
            p.obtenerProductos().forEach(pr-> {
                System.out.println(pr.getNombreProducto());
            });
            */
            

        } catch (Exception e) {
            System.out.println("Error al instanciar la clase conexion: " + e.getMessage());
        }
       
   
        
    }
    
}
