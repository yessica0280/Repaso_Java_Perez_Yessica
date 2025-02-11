package java_perezyessica;

/**
 *
 * @author Usuario
 */
public class Reporte {
    String id;
    String nombre;
    String apellido;
    String estado;
    
    public Reporte(String id, String nombre, String apellido, String estado){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Reporte{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", estado=" + estado + '}';
    }
}
