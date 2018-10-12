/*
 * 
 * 
 * 
 */
package modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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

    public PedidoData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    
    public void guardarPedido(Pedido pedido){
        try {
            
            String sql = "INSERT INTO pedido (id_mesa, id_mesero, fecha_pedido, cuenta) VALUES ( ? , ? , ? , ? );";

            try (PreparedStatement statment = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                statment.setInt(1, pedido.getMesa().getIdMesa());
                statment.setInt(2, pedido.getMesero().getIdMesero());
                statment.setDate(3, Date.valueOf(pedido.getFechaPedido()));
                statment.setDouble(4, pedido.getCuenta());
                
                statment.executeUpdate();
                
                ResultSet rs = statment.getGeneratedKeys();//id's
                
                if (rs.next()) {
                    pedido.setIdPedido(rs.getInt(1));
                } else {
                    System.out.println("No se pudo obtener el id luego de insertar un pedido");
                }
            }
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un pedido: " + ex.getMessage());
        }
    }
    
    public List<Pedido> obtenerPedidos() throws ClassNotFoundException{
        List<Pedido> pedidos = new ArrayList<>();
            

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
                    pedi.setFechaPedido(resultSet.getDate(4).toLocalDate());
                    pedi.setCuenta(resultSet.getDouble(5));
                    
                    pedidos.add(pedi);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al obtener los pedidos: " + ex.getMessage());
        }
        
        
        return pedidos;
    }
    
    public Pedido deIdAPedido(int idP) throws ClassNotFoundException{

        
        try {
            String sql = "SELECT * FROM pedido where id= ?;";
          try (PreparedStatement statment = connection.prepareStatement(sql)) {
              statment.setInt(1, idP);
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
                    pedi.setFechaPedido(resultSet.getDate(4).toLocalDate());
                    pedi.setCuenta(resultSet.getDouble(5));
              
              this.pedido=pedi;
          }}
        } catch (SQLException ex) {
            System.out.println("Error al obtener los meseros: " + ex.getMessage());
        }
        
        
        return pedido;
    }
    
    
        
}
