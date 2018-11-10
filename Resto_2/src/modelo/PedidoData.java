/*
 * 
 * 
 * 
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Muñeca Brava
 */
public class PedidoData {
    
        
    private Connection connection = null;
    private Conexion connect;
    private Pedido pedido;
    private MesaData mesa;
    private MeseroData mesero;
    private int totales;

    public PedidoData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    public void guardarPedido(Pedido pedido){
        try {
            
            String sql = "INSERT INTO `pedido`(`id_mesa`, `id_mesero`, `fecha_pedido`, `cuenta`, `estado_pedido`) VALUES ( ? , ? , ? , ? , ?);";

            try (PreparedStatement statment = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                statment.setInt(1, pedido.getMesa().getIdMesa());
                statment.setInt(2, pedido.getMesero().getIdMesero());
                statment.setTimestamp(3, Timestamp.valueOf(pedido.getFechaPedido()));
                statment.setDouble(4, pedido.getCuenta());
                statment.setBoolean(5, pedido.getCobrada());
                
                statment.executeUpdate();
                
                ResultSet rs = statment.getGeneratedKeys();//id's
                
                if (rs.next()) {
                    pedido.setIdPedido(rs.getInt(1));
                } else {
                    System.out.println("No se pudo obtener el id luego de insertar un pedido");}
            }
        } catch (SQLException ex) {
            System.out.println("Error al insertar un pedido: " + ex.getMessage());
        }
    }
    
    public ArrayList<Pedido> obtenerPedidos() throws ClassNotFoundException{
        ArrayList<Pedido> pedidos = new ArrayList<>();
            

        try {
            String sql = "SELECT * FROM pedido;";
            try (PreparedStatement statment = connection.prepareStatement(sql)) {
                ResultSet resultSet = statment.executeQuery();
                Pedido pedi;
                while(resultSet.next()){
                    pedi=new Pedido();
                    connect=new Conexion();
                    connect.getConexion();
                    mesa=new MesaData(connect);
                    mesero=new MeseroData(connect);
                    pedi.setIdPedido(resultSet.getInt(1));
                    pedi.setMesa(mesa.deIdAMesa(resultSet.getInt(2)));
                    pedi.setMesero(mesero.deIdAMesero(resultSet.getInt(3)));
                    pedi.setFechaPedido(resultSet.getTimestamp(4).toLocalDateTime());
                    pedi.setCuenta(resultSet.getDouble(5));
                    pedi.setCobrada(resultSet.getBoolean(6));
                    
                    pedidos.add(pedi);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al obtener los pedidos: " + ex.getMessage());
        }
        return pedidos;
    }
    
    public void borrarPedido(int idP) throws ClassNotFoundException{

        String sql = "DELETE FROM pedido where id_pedido= ?;";
        try (PreparedStatement statment = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statment.setInt(1, idP);
              
            statment.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Error al borrar el pedido: " + ex.getMessage());
        }
    }  
       
    public Pedido seleccionarPedidoPor(String a,int b) throws ClassNotFoundException{
        
        try {
            String sql = "SELECT * FROM pedido where "+a+" = ?;";
          try (PreparedStatement statment = connection.prepareStatement(sql)) {
              statment.setInt(1, b);
              ResultSet resultSet = statment.executeQuery();
              while(resultSet.next()){
              Pedido pedi = new Pedido();
              connect=new Conexion();
              connect.getConexion();
              mesa=new MesaData(connect);
              mesero=new MeseroData(connect);
                    pedi.setIdPedido(resultSet.getInt(1));
                    pedi.setMesa(mesa.deIdAMesa(resultSet.getInt(2)));
                    pedi.setMesero(mesero.deIdAMesero(resultSet.getInt(3)));
                    pedi.setFechaPedido(resultSet.getTimestamp(4).toLocalDateTime());
                    pedi.setCuenta(resultSet.getDouble(5));
                    pedi.setCobrada(resultSet.getBoolean(6));
              
              this.pedido=pedi;
            }
          }
        } catch (SQLException ex) {
            System.out.println("Error al obtener el pedido: " + ex.getMessage());
        }
    return pedido;
    }  
    
    public ArrayList<Pedido> seleccionarPedidosPor(String a,int b) throws ClassNotFoundException{
        ArrayList<Pedido> este=new ArrayList<>();
        try {
            String sql = "SELECT * FROM pedido where "+a+" = ?;";
          try (PreparedStatement statment = connection.prepareStatement(sql)) {
              statment.setInt(1, b);
              ResultSet resultSet = statment.executeQuery();
              while(resultSet.next()){
              Pedido pedi = new Pedido();
              connect=new Conexion();
              connect.getConexion();
              mesa=new MesaData(connect);
              mesero=new MeseroData(connect);
                    pedi.setIdPedido(resultSet.getInt(1));
                    pedi.setMesa(mesa.deIdAMesa(resultSet.getInt(2)));
                    pedi.setMesero(mesero.deIdAMesero(resultSet.getInt(3)));
                    pedi.setFechaPedido(resultSet.getTimestamp(4).toLocalDateTime());
                    pedi.setCuenta(resultSet.getDouble(5));
                    pedi.setCobrada(resultSet.getBoolean(6));
              
              este.add(pedi);
            }
          }
        } catch (SQLException ex) {
            System.out.println("Error al obtener el pedido: " + ex.getMessage());
        }
    return este;
    }
    
    public ArrayList<Pedido> selccionarPedidosConFecha(String a,int b,boolean e,LocalDateTime c,LocalDateTime d) throws ClassNotFoundException{
        ArrayList<Pedido> este=new ArrayList<>();
        try {
            String sql = "SELECT * FROM pedido where "+a+" = ? AND estado_pedido=? AND fecha_pedido BETWEEN ? AND ? ;";
          try (PreparedStatement statment = connection.prepareStatement(sql)) {
              statment.setInt(1, b);
              statment.setBoolean(2, e);
              statment.setTimestamp(3, Timestamp.valueOf(c));
              statment.setTimestamp(4, Timestamp.valueOf(d));
              ResultSet resultSet = statment.executeQuery();
              while(resultSet.next()){
              Pedido pedi = new Pedido();
              connect=new Conexion();
              connect.getConexion();
              mesa=new MesaData(connect);
              mesero=new MeseroData(connect);
                    pedi.setIdPedido(resultSet.getInt(1));
                    pedi.setMesa(mesa.deIdAMesa(resultSet.getInt(2)));
                    pedi.setMesero(mesero.deIdAMesero(resultSet.getInt(3)));
                    pedi.setFechaPedido(resultSet.getTimestamp(4).toLocalDateTime());
                    pedi.setCuenta(resultSet.getDouble(5));
                    pedi.setCobrada(resultSet.getBoolean(6));
              
              este.add(pedi);
            }
          }
        } catch (SQLException ex) {
            System.out.println("Error al obtener el pedido: " + ex.getMessage());
        }
    return este;
    }
    
    public ArrayList<Integer> selccionarPedidoPorMesero(String idM) throws ClassNotFoundException{
        ArrayList<Integer> idMesas=new ArrayList<>();
        
        try {
            String sql = "SELECT DISTINCT id_mesa FROM `pedido`,mesero WHERE pedido.id_mesero=mesero.id_mesero AND mesero.nombre_mesero=? AND estado_pedido=0;";
          try (PreparedStatement statment = connection.prepareStatement(sql)) {
              statment.setString(1, idM);
              ResultSet resultSet = statment.executeQuery();
              while(resultSet.next()){
              int me=resultSet.getInt(1);
              
              idMesas.add(me);
            }
          }
        } catch (SQLException ex) {
            System.out.println("Error al obtener el pedido: " + ex.getMessage());
        }
    return idMesas;
    }
    
    public void actualizarCuentaDePedido(int x,double b){
        try {
            String sql = "UPDATE `pedido` SET `cuenta`=?  WHERE id_pedido= ?;";
            try (PreparedStatement statment = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                statment.setDouble(1, b);
                statment.setInt(2, x);
                
                statment.executeUpdate();
            }
        } catch (SQLException ex) {
            System.out.println("Error al actualizar la cuenta: " + ex.getMessage());
        }
    }
    
    public void actualizarEstadoYfecha(int x){

        try {
            String sql = "UPDATE `pedido` SET `estado_pedido`=1,`fecha_pedido`=CURRENT_TIMESTAMP WHERE id_pedido= ?;";
            try (PreparedStatement statment = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                statment.setInt(1, x);
                
                statment.executeUpdate();
            }
        } catch (SQLException ex) {
            System.out.println("Error al actualizar el estado: " + ex.getMessage());
        }
    }
}
