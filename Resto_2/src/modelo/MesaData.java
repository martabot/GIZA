/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 * @author sarah
 */
public class MesaData {
    
    
    private Connection connection;
    private Mesa mesa;

    public MesaData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }

    public void guardarMesa(Mesa mesa){
        try {
            
            String sql = "INSERT INTO mesa (estado_mesa, tiene_reserva, capacidad, cuenta) VALUES ( ? , ? , ? , ? );";

            try (PreparedStatement statment = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                statment.setString(1, mesa.getEstadoMesa());
                statment.setBoolean(2, mesa.isTieneReserva());
                statment.setInt(3, mesa.getCapacidad());
                statment.setDouble(4, mesa.getCuenta());
                
                statment.executeUpdate();
                
                ResultSet rs = statment.getGeneratedKeys();//id's
                
                if (rs.next()) {
                    mesa.setIdMesa(rs.getInt(1));
                } else {
                    System.out.println("No se pudo obtener el id luego de insertar una mesa");
                }
            }
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una mesa: " + ex.getMessage());
        }
    }
    
    public List<Mesa> obtenerMesas(){
        List<Mesa> mesas = new ArrayList<>();
            

        try {
            String sql = "SELECT * FROM mesa;";
            try (PreparedStatement statment = connection.prepareStatement(sql)) {
                ResultSet resultSet = statment.executeQuery();
                Mesa mesi;
                while(resultSet.next()){
                    mesi = new Mesa();
                    mesi.setIdMesa(resultSet.getInt(1));
                    mesi.setEstadoMesa(resultSet.getString(2));
                    mesi.setTieneReserva(resultSet.getBoolean(3));
                    mesi.setCapacidad(resultSet.getInt(4));
                    mesi.setCuenta(resultSet.getDouble(5));
                    
                    mesas.add(mesi);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al obtener las mesas: " + ex.getMessage());
        }
        
        
        return mesas;
    }
    
    public Mesa deIdAMesa(int idM){
        
        try {
        String sql="SELECT * FROM mesa WHERE id_mesa =( ? );";
        try (PreparedStatement statment=connection.prepareStatement(sql)){
            statment.setInt(1, idM);
            ResultSet resultSet=statment.executeQuery();
            Mesa mesita=new Mesa();
            mesita.setIdMesa(resultSet.getInt(1));
            mesita.setEstadoMesa(resultSet.getString(2));
            mesita.setTieneReserva(resultSet.getBoolean(3));
            mesita.setCapacidad(resultSet.getInt(4));
            mesita.setCuenta(resultSet.getDouble(5));
            
            this.mesa=mesita;
        }
            
        } catch (SQLException ex) {
            System.out.println("Error al obtener la mesa: " + ex.getMessage());
        }
        
        
        return mesa;
        
    }
    
    
    
}
