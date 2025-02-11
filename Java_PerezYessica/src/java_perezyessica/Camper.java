package java_perezyessica;

/**
 *
 * @author Usuario
 */
public class Camper {
    String id;
    String fecha;
    String usuario;
    String contraseña;
    String nombre;
    String apellido;
    String direccion;
    String acudiente;
    String numero_celular;
    String numero_fijo;
    String estado;
    String riesgo;
    String grupo;
    
    public Camper (String id, String fecha, String usuario, String contraseña, String nombre, String apellido,
            String direccion, String acudiente, String numero_celular, String numero_fijo, String estado, String riesgo, String grupo){
        this.id = id;
        this.fecha = fecha;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.acudiente = acudiente;
        this.numero_celular = numero_celular;
        this.numero_fijo = numero_fijo;
        this.estado = estado;
        this.riesgo = riesgo;
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "Camper{" + "id=" + id + ", fecha=" + fecha + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", acudiente=" + acudiente + ", numero_celular=" + numero_celular + ", numero_fijo=" + numero_fijo + ", estado=" + estado + ", riesgo=" + riesgo + ", grupo=" + grupo + '}';
    }
}


