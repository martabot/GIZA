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
public class MeseroData {
    private String usuario;
    private Connection connection = null;
    private Mesero mesero;

    public MeseroData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    
    public void guardarMeseros(Mesero mesero){
        try {
            
            String sql = "INSERT INTO mesero (nombre_mesero) VALUES ( ? );";

            try (PreparedStatement statment = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                statment.setString(1, mesero.getNombreMesero());
                
                statment.executeUpdate();
                
                ResultSet rs = statment.getGeneratedKeys();//id's
                
                if (rs.next()) {
                    mesero.setIdMesero(rs.getInt(1));
                } else {
                    System.out.println("No se pudo obtener el id luego de insertar un mesero");}
            }
        } catch (SQLException ex) {
            System.out.println("Error al insertar un mesero: " + ex.getMessage());
        }
    }
    
    public List<Mesero> obtenerMeseros(){
        List<Mesero> meseros = new ArrayList<>();
            
        try {
            String sql = "SELECT * FROM mesero;";
            try (PreparedStatement statment = connection.prepareStatement(sql)) {
                ResultSet resultSet = statment.executeQuery();
                while(resultSet.next()){
                    Mesero mese= new Mesero();
                    mese.setIdMesero(resultSet.getInt(1));
                    mese.setNombreMesero(resultSet.getString(2));
                    
                    meseros.add(mese);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al obtener los meseros: " + ex.getMessage());
        }
        
        return meseros;
    }
    
    public Mesero deIdAMesero(int idM){

        try {
            String sql = "SELECT * FROM mesero where id_mesero= ?;";
          try (PreparedStatement statment = connection.prepareStatement(sql)) {
              statment.setInt(1, idM);
              ResultSet resultSet = statment.executeQuery();
              while(resultSet.next()){
                Mesero mese = new Mesero();
                mese.setIdMesero(resultSet.getInt(1));
                mese.setNombreMesero(resultSet.getString(2));
              
              this.mesero=mese;
            }
          }
        } catch (SQLException ex) {
            System.out.println("Error al obtener los meseros: " + ex.getMessage());
        }
        
        return mesero;
    }
    
    public void borrarMesero(String nombre){
        String sql = "DELETE FROM mesero where nombre_mesero LIKE ?;";
        try (PreparedStatement statment = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statment.setString(1, nombre);
              
            statment.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Error al borrar el mesero: " + ex.getMessage());
        }
    }
    
    public void cambiarNombre(String old,String nu){
        String sql = "UPDATE `mesero` SET `nombre_mesero`= ? WHERE `nombre_mesero`= ?;";
        try (PreparedStatement statment = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statment.setString(1, nu);
            statment.setString(2, old);
              
            statment.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Error al actualizar el nombre de mesero: " + ex.getMessage());
        }
    }
   
    ////////////
    public void almacenarUsuario(String usuario){
        this.usuario=usuario;
    }
    
    public String usuarioRegistrado(){
        return usuario;
    }
    
    public Mesero deUsuarioAMesero(String u){

        try {
            String sql = "SELECT * FROM mesero where nombre_mesero= ?;";
          try (PreparedStatement statment = connection.prepareStatement(sql)) {
              statment.setString(1, u);
              ResultSet resultSet = statment.executeQuery();
              while(resultSet.next()){
                Mesero mese = new Mesero();
                mese.setIdMesero(resultSet.getInt(1));
                mese.setNombreMesero(resultSet.getString(2));
              
              this.mesero=mese;
            }
          }
        } catch (SQLException ex) {
            System.out.println("Error al obtener el mesero: " + ex.getMessage());
        }
        
        return mesero;
    }
}
