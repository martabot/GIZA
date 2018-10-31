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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Muñeca Brava
 */
public class ComandaData {
    private Connection connection = null;
    private Conexion connect;
    private PedidoData pedido;
    private ProductoData producto;
    private Comanda comanda;

    public ComandaData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    
    public void guardarComanda(Comanda comanda){
        try {
            
            String sql = "INSERT INTO comanda (id_pedido, id_producto, cantidad) VALUES ( ? , ? , ? );";

            try (PreparedStatement statment = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                
                statment.setInt(1, comanda.getPedido().getIdPedido());
                statment.setInt(2, comanda.getProducto().getIdProducto());
                statment.setInt(3, comanda.getCantidad());
                
                statment.executeUpdate();
                
                ResultSet rs = statment.getGeneratedKeys();//id's
                
                if (rs.next()) {
                    comanda.setIdComanda(rs.getInt(1));
                } else {
                    System.out.println("No se pudo obtener el id luego de insertar una comanda");
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al insertar una comanda: " + ex.getMessage());
        }
    }
    
    
    public ArrayList<Comanda> obtenerComandas() throws ClassNotFoundException{
        ArrayList<Comanda> comandas = new ArrayList<>();
            

        try {
            String sql = "SELECT * FROM comanda;";
            try (PreparedStatement statment = connection.prepareStatement(sql)) {
                ResultSet resultSet = statment.executeQuery();
                while(resultSet.next()){
                    Comanda crystal= new Comanda();
                    connect=new Conexion();
                    connect.getConexion();
                    pedido=new PedidoData(connect);
                    producto=new ProductoData(connect);
                    crystal.setIdComanda(resultSet.getInt(1));
                    crystal.setPedido(pedido.deIdAPedido(resultSet.getInt(2)));
                    crystal.setProducto(producto.deIdAlProducto(resultSet.getInt(3)));
                    crystal.setCantidad(resultSet.getInt(4));
                    
                    comandas.add(crystal);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al obtener las comandas: " + ex.getMessage());
        }
        return comandas;
    }
    
    public void borrarComanda(int idC){
        String sql = "DELETE FROM comanda where id_comanda= ?;";
        try (PreparedStatement statment = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statment.setInt(1, idC);
              
            statment.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Error al borrar la comanda: " + ex.getMessage());
        }
    }
    
    public ArrayList<Comanda> selccionarComandasPorPedido(int i) throws ClassNotFoundException{
            ArrayList<Comanda> x=new ArrayList<>();
            
        try {
            String sql = "SELECT * FROM comanda where id_pedido = ?;";
          try (PreparedStatement statment = connection.prepareStatement(sql)) {
              statment.setInt(1, i);
              ResultSet resultSet = statment.executeQuery();
              while(resultSet.next()){
                    Comanda c= new Comanda();
                    connect=new Conexion();
                    connect.getConexion();
                    pedido=new PedidoData(connect);
                    producto=new ProductoData(connect);
                    c.setIdComanda(resultSet.getInt(1));
                    c.setPedido(pedido.deIdAPedido(resultSet.getInt(2)));
                    c.setProducto(producto.deIdAlProducto(resultSet.getInt(3)));
                    c.setCantidad(resultSet.getInt(4));
                    
                    x.add(c);   
            }
          }
        } catch (SQLException ex) {
            System.out.println("Error al obtener las comandas: " + ex.getMessage());
        } 
    return x;
    }
   
    public void borrarComandaPorPrdocuto(int idc){
        String sql = "DELETE FROM comanda where id_producto= ?;";
        try (PreparedStatement statment = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statment.setInt(1, idc);
              
            statment.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Error al borrar la comanda: " + ex.getMessage());
        }
    }
}
