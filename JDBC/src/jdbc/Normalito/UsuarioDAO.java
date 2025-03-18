package jdbc.Normalito;

/**
 *
 * @author Uniminuto Tibu
 */

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    // Atributos de conexión a la BBDD.
    private String url = "jdbc:mysql://bog4kfhaixynbid5hg1n-mysql.services.clever-cloud.com:3306/bog4kfhaixynbid5hg1n";
    private String usuario = "uaoamehd1sqpji95";
    private String password = "vv5qoNy2O9ADdBzNehpI";
    
    // Método para conectar a la BBDD.
    private Connection conectar() throws SQLException{
        return DriverManager.getConnection(url, usuario, password);
    }
    
    // Crear (Insert).
    public void insertUsuario(String nombre, String email) {
        String sql = "insert into usuarios(nombre,email) values (?,?);";
        try (   Connection conexionInterna = conectar();
                PreparedStatement solicitud = conexionInterna.prepareStatement(sql)){
            
            //Asignación valores a las incógintas.
            solicitud.setString(1,nombre);
            solicitud.setString(2,email);
            
            // Ejecución de la solicitus.
            solicitud.executeUpdate();
            System.out.println("Usuario ingresado de manera exitosa!");
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Leer (select).
    // select * from usuarios;
    public List<String> obtenerUsuarios() {
        String sql = "select * from usuarios";
        List<String> listaUsuarios = new ArrayList<>();
        try (   Connection conexionInterna = conectar();
                PreparedStatement solicitud = conexionInterna.prepareStatement(sql);
                ResultSet resultado = solicitud.executeQuery();) {
            while (resultado.next()) {
                listaUsuarios.add(resultado.getInt("id") + 
                " - " + resultado.getString("nombre")+ " - " + 
                resultado.getString("email"));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return listaUsuarios;
    }
    
    // Actualizar.
    public void actualizarUsuario(int id, String nombre, String email) {
        String sql = "update usuarios set nombre=?, email=? where id=?";
        try (   Connection conexionInterna = conectar();
                PreparedStatement solicitud = conexionInterna.prepareStatement(sql)) {
            solicitud.setString(1, nombre);
            solicitud.setString(2, email);
            solicitud.setInt(3, id);
            int filas = solicitud.executeUpdate();
            if (filas > 0) {
                System.out.println("Usuario actualizado exitosamente!");
            }
            else {
                System.out.println("No se pudo actualizar el usuario con ID" + id);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void EliminarUsuario(int id) {
        String sql = "delete from usuarios where id = ?";
        try (   Connection conexionInterna = conectar();
                PreparedStatement solicitud = conexionInterna.prepareStatement(sql)){
            solicitud.setInt(1, id);
            int filas = solicitud.executeUpdate();
            if (filas > 0) {
                System.out.println(" Uusario con el id eliminado es: " + id);
            }
            else {
                System.out.println("No se pudo encontrar el usuario.");
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    public void buscarUsuarios(){
        String sql = "select id from usuarios order by id asc";
        try (   Connection conexionInterna = conectar();
                PreparedStatement solicitud = conexionInterna.prepareStatement(sql);
                ResultSet resultado = solicitud.executeQuery()
                ){
            while (resultado.next()) {
                int id = resultado.getInt("id");
                System.out.println("id: " + id);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
