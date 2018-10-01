/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sarah
 */
public class Conexion {
    private final String url="jdbc:mysql://localhost/GIZA";
    private final String usuario="root";
    private final String password="esTaesLacontrasenia";

    private Connection conexion;
    
    public Conexion() throws ClassNotFoundException {
        
        //Cargamos las clases de mariadb que implementan JDBC
        Class.forName("org.mariadb.jdbc.Driver");

    }
    
    public Connection getConexion() throws SQLException{
        if(conexion == null){
                    // Setup the connection with the DB
            conexion = DriverManager
                .getConnection(url,usuario,password);
        }
        return conexion;
    }
}
