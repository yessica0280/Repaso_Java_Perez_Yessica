package jtable.config;

/**
 *
 * @author Usuario
 */
import java.sql.DriverManager;
import java.sql.Connection;

public class Conexion {
    Connection con;
    
    public Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://bog4kfhaixynbid5hg1n-mysql.services.clever-cloud.com:3306/bog4kfhaixynbid5hg1n", "uaoamehd1sqpji95", "vv5qoNy2O9ADdBzNehpI");
        }
        catch (Exception e) {
            System.out.println("No se pudo conectar la base de datos.");
        }
    }
    
    public Connection getConnection() {
        return con;
    }
}
