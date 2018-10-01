/*
 * 
 * 
 * 
 */
package accesoabasededatos;

import modelo.PedidoData;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Pedido;
import java.sql.ResultSet;
import modelo.Conexion;
import modelo.Mesero;
import modelo.MeseroData;

/**
 *
 * @author sarah
 */
public class Test {
    
    
    
    public static void main(String []args){
        
        String url="jdbc:mysql://localhost/GIZA";
        String usuario="root";
        String password="esTaesLacontrasenia";
        Connection conexion;
        PreparedStatement ps;
        MeseroData meseroData;
        
        
        /*
        Pedido pedido1 = new Pedido();
        Mesero mesero;
        pedido1.setMesero(mesero=new Mesero());
        pedido1.setCostoTotal(565);
        
        try {
            Conexion conexion1 = new Conexion(url,usuario,password);
        pedidoData = new PedidoData(conexion1);
        pedidoData.guardarPedido(pedido1);
        pedidoData.obtenerPedido().forEach(pedido -> {System.out.println("Identificador: "+pedido.getIdPedido());});
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        */
    
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            
            conexion = DriverManager.getConnection(url,usuario,password);
            
            
            
            //Crear:
            ps=conexion.prepareStatement("INSERT INTO mesero (nombre_mesero) VALUES ( ? );");
            ps.setString(1, "Juan Dos");
            ps.executeUpdate();
            ps.close();
            
            //Actualizar:
            /*ps=conexion.prepareStatement("UPDATE alumno SET activo=0");
            ps.executeUpdate();
            ps.close();*/
            
            //Borrar:
            /*ps=conexion.prepareStatement("DELETE FROM alumno WHERE nombre LIKE ?;");
            ps.setString(1, "Gonzales,Miguel");
            ps.executeUpdate();
            ps.close();*/
            
            //Consultar:
            ps=conexion.prepareStatement("SELECT * FROM mesero");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                
                System.out.println("- Identificador: "+rs.getInt(1)+" - Nombre: "+rs.getString(2));
            }
            ps.close();
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
}
    
}