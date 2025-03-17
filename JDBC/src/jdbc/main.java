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
       
       List<String> listaUsuarios = usuarioDAO.obtenerUsuarios();
       for (String usuario : listaUsuarios) {
           System.out.println(usuario);
       }
       
       usuarioDAO.actualizarUsuario(3, "Jaime", "jaim@campuslands.com");
       listaUsuarios = usuarioDAO.obtenerUsuarios();
       for (String usuario : listaUsuarios) {
           System.out.println(usuario);
       }
    }
}
