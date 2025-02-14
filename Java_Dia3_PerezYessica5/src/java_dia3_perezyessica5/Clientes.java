package java_dia3_perezyessica5;

/**
 *
 * @author Uniminuto Tibu
 */
public class Clientes {
    int id;
    String nombre;
    String apellido;
    String correo;
    long telefono;
    
    public Clientes(int id, String nombre, String apellido, String correo, long telefono){
        this.id = 1;
        this.nombre = "Yessica";
        this.apellido = "Perez";
        this.correo = "perez@gmail.com";
        this.telefono = 257525614;
    }
    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public long getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Clientes{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", telefono=" + telefono + '}';
    }
    
    
}
