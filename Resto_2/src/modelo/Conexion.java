/*
 * 
 * 
 * 
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Muñeca Brava
 */
public class Conexion {
    private final String url="jdbc:mysql://localhost/giza";
    private final String usuario="root";
    private final String password="";
    private Connection conexion;
    
    public Conexion() throws ClassNotFoundException {
        
        //Cargamos las clases de mariadb que implementan JDBC
        Class.forName("org.mariadb.jdbc.Driver");
    }
    
    public Connection getConexion() throws SQLException{
        if(conexion == null){
            conexion = DriverManager
                .getConnection(url,usuario,password);
        }
        return conexion;
    }
}