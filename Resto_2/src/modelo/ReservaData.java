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
import java.util.ArrayList;

/**
 *
 * @author Muñeca Brava
 */
public class ReservaData {
    private Connection connection;
    private Conexion connect;
    private MesaData m1;

    public ReservaData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    public void guardarReserva(Reserva reserva){
        try {
            
            String sql = "INSERT INTO reserva (nombre_cliente, dni_cliente, fecha_reserva, id_mesa, esta_vigente) VALUES ( ? , ? , ? , ? , ? );";

            try (PreparedStatement statment = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                statment.setString(1, reserva.getNombreCliente());
                statment.setLong(2, reserva.getDniCliente());
                statment.setTimestamp(3, Timestamp.valueOf(reserva.getFechaReserva()));
                statment.setInt(4, reserva.getMesa().getIdMesa());
                statment.setBoolean(5, reserva.isEstaVigente());
                
                statment.executeUpdate();
                
                ResultSet rs = statment.getGeneratedKeys();//id's
                
                if (rs.next()) {
                    reserva.setIdReserva(rs.getInt(1));
                } else {
                    System.out.println("No se pudo obtener el id luego de insertar una reserva");}
            }
        } catch (SQLException ex) {
            System.out.println("Error al insertar una reserva: " + ex.getMessage());
        }
    }
    
    public ArrayList<Reserva> obtenerReservas() throws ClassNotFoundException {
        ArrayList<Reserva> reservas = new ArrayList<>();
            
        try {
            String sql = "SELECT * FROM reserva;";
            try (PreparedStatement statment = connection.prepareStatement(sql)) {
                ResultSet resultSet = statment.executeQuery();
                Reserva reser;
                while(resultSet.next()){
                    reser = new Reserva();
                    connect=new Conexion();
                    connect.getConexion();
                    m1=new MesaData(connect);
                    reser.setIdReserva(resultSet.getInt(1));
                    reser.setNombreCliente(resultSet.getString(2));
                    reser.setDniCliente(resultSet.getInt(3));
                    reser.setFechaReserva(resultSet.getTimestamp(4).toLocalDateTime());
                    reser.setMesa(m1.deIdAMesa(resultSet.getInt(5)));
                    reser.setEstaVigente(resultSet.getBoolean(6));
                    
                    reservas.add(reser);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al obtener las reservas: " + ex.getMessage());
        }catch(NullPointerException e){
                System.out.println("Error3"+e.getLocalizedMessage());
        }
        
        return reservas;
    }
        
    public void borrarReserva(int idR) throws ClassNotFoundException{
        String sql = "DELETE FROM reserva where id_reserva= ?;";
        try (PreparedStatement statment = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statment.setInt(1, idR);
              
            statment.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Error al borrar la reserva: " + ex.getMessage());
        }
    } 
    
    public void cancelarReserva(String algo,String idM) throws SQLException{
        
       try {
        String sql = "UPDATE reserva SET esta_vigente=0 where "+algo+"="+idM+" ;";
       try (PreparedStatement statment = connection.prepareStatement(sql)) {
             
            statment.executeUpdate();
            
            }  
       } catch (SQLException ex) {
            System.out.println("Error al cancelar la reserva: " + ex.getMessage());
        }
    }
    
    public void autoCancelarReserva(){
        
       try {
        String sql = "UPDATE reserva SET esta_vigente=0 where fecha_reserva=NOW()-INTERVAL 30 MINUTE;";
       try (PreparedStatement statment = connection.prepareStatement(sql)) {
             
            statment.executeUpdate();
            
            }  
       } catch (SQLException ex) {
            System.out.println("Error al cancelar la reserva: " + ex.getMessage());
        }
    }
    
    public ArrayList<Integer> reservasPorMesa(){
        ArrayList<Integer> reservas = new ArrayList<>();
        
        try {
            String sql = "SELECT id_mesa FROM `reserva` WHERE (DATE(fecha_reserva))=CURRENT_DATE AND esta_vigente=1;";
        try (PreparedStatement statment = connection.prepareStatement(sql)) {
            ResultSet resultSet = statment.executeQuery();
            while(resultSet.next()){
                Integer reser=resultSet.getInt(1);    
                reservas.add(reser);
            }
            }
        } catch (SQLException ex) {
            System.out.println("Error al obtener las reservas: " + ex.getMessage());
        }
        return reservas;
    }
}
