package jdbc;

/**
 *
 * @author Uniminuto Tibu
 */
import java.util.List;
import jdbc.Normalito.UsuarioDAO;

public class main {
    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        // Insertar un usuario.
        /*usuarioDAO.insertUsuario("Pedrito","pedrogomez.campuslands@gmail.com");
        usuarioDAO.insertUsuario("Valentina","valentina.campuslands@gmail.com");
        usuarioDAO.insertUsuario("Zully","zully.campuslands@gmail.com");*/
       
        // Obtener y mostrar los usuarios.
       List<String> listaUsuarios = usuarioDAO.obtenerUsuarios();
       for (String usuario : listaUsuarios) {
           System.out.println(usuario);
       }
       
       // Actualizar datos con el id del usuario.
       usuarioDAO.actualizarUsuario(3, "Jaime", "jaim@campuslands.com");
       listaUsuarios = usuarioDAO.obtenerUsuarios();
        System.out.println("Usuario actualizados con exito");
       for (String usuario : listaUsuarios) {
           System.out.println(usuario);
       }
       
       // Mostrar usuarios depués de actualizados.
        System.out.println("-----------------");
        for (String usuario :  listaUsuarios) {
            System.out.println(usuario);
        }
        
        // Eliminar por id.
        System.out.println("---------------");
        usuarioDAO.EliminarUsuario(2);
        System.out.println(usuarioDAO.obtenerUsuarios());
        
        // Mostrar los usuarios por id.
        System.out.println("------------");
        System.out.println("Usuarios por id: ");
        usuarioDAO.buscarUsuarios();
    }
}
