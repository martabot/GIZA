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
public class ProductoData {
    Producto product;
    
    private Connection connection = null;

    public ProductoData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    
    public void guardarProducto(Producto producto){
        try {
            
            String sql = "INSERT INTO producto (nombre_producto, precio) VALUES ( ? , ? );";

            try (PreparedStatement statment = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                statment.setString(1, producto.getNombreProducto());
                statment.setDouble(2, producto.getPrecio());
                
                statment.executeUpdate();
                
                ResultSet rs = statment.getGeneratedKeys();//id's
                
                if (rs.next()) {
                    producto.setIdProducto(rs.getInt(1));
                } else {
                    System.out.println("No se pudo obtener el id luego de insertar un producto");}
            }
        } catch (SQLException ex) {
            System.out.println("Error al insertar un producto: " + ex.getMessage());
        }
    }
    
    public List<Producto> obtenerProductos(){
        List<Producto> productos = new ArrayList<>();
           
        try {
            String sql = "SELECT * FROM producto;";
            try (PreparedStatement statment = connection.prepareStatement(sql)) {
                ResultSet resultSet = statment.executeQuery();
                while(resultSet.next()){
                    Producto product = new Producto();
                    product.setIdProducto(resultSet.getInt(1));
                    product.setNombreProducto(resultSet.getString(2));
                    product.setPrecio(resultSet.getDouble(3));
                    
                    productos.add(product);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al obtener los productos: " + ex.getMessage());
        }
        
        return productos;
    }
    
    public Producto deIdAlProducto(int idP){

        try {
            String sql = "SELECT * FROM pedido where id= ?;";
          try (PreparedStatement statment = connection.prepareStatement(sql)) {
              statment.setInt(1, idP);
              ResultSet resultSet = statment.executeQuery();
              while(resultSet.next()){
              Producto producto = new Producto();
              producto.setIdProducto(resultSet.getInt(1));
              producto.setNombreProducto(resultSet.getString(2));
              producto.setPrecio(resultSet.getDouble(3));
              
              this.product=producto;
            }
          }
        } catch (SQLException ex) {
            System.out.println("Error al obtener el pedido: " + ex.getMessage());
        }
        
        return product;
    }
    
    public void borrarProducto(int idP) throws ClassNotFoundException{

        String sql = "DELETE FROM producto where id_producto= ?;";
        try (PreparedStatement statment = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statment.setInt(1, idP);
              
            statment.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Error al borrar el producto: " + ex.getMessage());
        }
    }  
}
