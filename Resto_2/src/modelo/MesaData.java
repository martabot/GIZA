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
            
            String sql = "INSERT INTO mesa (estado_mesa, capacidad) VALUES ( ? , ? );";

            try (PreparedStatement statment = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                statment.setString(1, mesa.getEstadoMesa());
                statment.setInt(3, mesa.getCapacidad());
                
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
                    mesi.setCapacidad(resultSet.getInt(3));
                    
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
        String sql="SELECT * FROM mesa WHERE id_mesa = ? ;";
        try (PreparedStatement statment = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statment.setInt(1, idM);
            ResultSet resultSet=statment.executeQuery();
            while(resultSet.next()){
            Mesa mesita=new Mesa();
                    mesita.setIdMesa(resultSet.getInt(1));
                    mesita.setEstadoMesa(resultSet.getString(2));
                    mesita.setCapacidad(resultSet.getInt(3));
                    
                    this.mesa=mesita;
            }
            
        }
            
        } catch (SQLException ex) {
            System.out.println("Error al obtener la mesa: " + ex.getMessage());
        }
        
        
        return mesa;
        
    }
    
    
    
}
