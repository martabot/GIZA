/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 * @author sarah
 */
public class PedidoData {
    
        
    private Connection connection = null;
    private MesaData mesa;
    private MeseroData mesero;
    private ProductoData producto;

    public PedidoData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    
    public void guardarPedido(Pedido pedido){
        try {
            
            String sql = "INSERT INTO pedido (id_mesa, id_mesero, id_producto, sub_total, fecha_pedido) VALUES ( ? , ? , ? , ? , ? );";

            try (PreparedStatement statment = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                statment.setInt(1, pedido.getMesa().getIdMesa());
                statment.setInt(2, pedido.getMesero().getIdMesero());
                statment.setInt(3, pedido.getProducto().getIdProducto());
                statment.setDouble(4, pedido.getSubTotal());
                statment.setDate(5, Date.valueOf(pedido.getFechaPedido()));
                
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
    
    public List<Pedido> obtenerPedidos(){
        List<Pedido> pedidos = new ArrayList<>();
            

        try {
            String sql = "SELECT * FROM pedido;";
            try (PreparedStatement statment = connection.prepareStatement(sql)) {
                ResultSet resultSet = statment.executeQuery();
                Pedido pedi;
                while(resultSet.next()){
                    pedi = new Pedido();
                    pedi.setIdPedido(resultSet.getInt(1));
                    pedi.setMesa(mesa.deIdAMesa(resultSet.getInt(2)));
                    pedi.setMesero(mesero.deIdAMesero(resultSet.getInt(3)));
                    pedi.setProducto(producto.deIdAlProducto(resultSet.getInt(4)));
                    pedi.setSubTotal(resultSet.getDouble(5));
                    pedi.setFechaPedido(resultSet.getDate(6).toLocalDate());
                    
                    pedidos.add(pedi);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al obtener los pedidos: " + ex.getMessage());
        }
        
        
        return pedidos;
    }
        
}
