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

    public ComandaData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    
    public void guardarComanda(Comanda comanda){
        try {
            
            String sql = "INSERT INTO comanada (id_pedido, id_producto, cantidad) VALUES ( ? , ? , ? );";

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
    
    
    public List<Comanda> obtenerComanda() throws ClassNotFoundException{
        List<Comanda> comandas = new ArrayList<>();
            

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
}
