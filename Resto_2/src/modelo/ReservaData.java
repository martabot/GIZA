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
public class ReservaData {
    private Connection connection;
    private Conexion connect;
    private MesaData mesa;

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
                statment.setDate(3, Date.valueOf(reserva.getFechaReserva()));
                statment.setInt(4, reserva.getMesa().getIdMesa());
                statment.setBoolean(5, reserva.isEstaVigente());
                
                statment.executeUpdate();
                
                ResultSet rs = statment.getGeneratedKeys();//id's
                
                if (rs.next()) {
                    reserva.setIdReserva(rs.getInt(1));
                } else {
                    System.out.println("No se pudo obtener el id luego de insertar una reserva");
                }
            }
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una reserva: " + ex.getMessage());
        }
    }
    
    public List<Reserva> obtenerReservas() throws ClassNotFoundException {
        List<Reserva> reservas = new ArrayList<>();
            

        try {
            String sql = "SELECT * FROM reserva;";
            try (PreparedStatement statment = connection.prepareStatement(sql)) {
                ResultSet resultSet = statment.executeQuery();
                Reserva reser;
                while(resultSet.next()){
                    reser = new Reserva();
                    connect=new Conexion();
                    connect.getConexion();
                    mesa=new MesaData(connect);
                    reser.setIdReserva(resultSet.getInt(1));
                    reser.setNombreCliente(resultSet.getString(2));
                    reser.setDniCliente(resultSet.getInt(3));
                    reser.setFechaReserva(resultSet.getDate(4).toLocalDate());
                    reser.setMesa(mesa.deIdAMesa(resultSet.getInt(5)));
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
    
}
