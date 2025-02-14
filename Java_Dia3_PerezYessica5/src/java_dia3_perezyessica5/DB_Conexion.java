package java_dia3_perezyessica5;
import java.sql.*;

/**
 *
 * @author Uniminuto Tibu
 */
public class DB_Conexion {
    String url = "jdbc:mysql://localhost:3306/Vibrantes";
    String user = "root";
    String pass = "campus2023";
    
    // Método para conectar
    public Connection conectar(){
        Connection con = null;
        try {
            // Establecemos la conexión a la base de datos
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión exitosa.");
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}

