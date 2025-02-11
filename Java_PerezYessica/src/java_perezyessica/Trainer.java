package java_perezyessica;

/**
 *
 * @author Usuario
 */
public class Trainer {
    String id;
    String nombre;
    String ruta;
    String horario;
    
    public Trainer (String id, String nombre, String ruta, String horario){
        this.id = id;
        this.nombre = nombre;
        this.ruta = ruta;
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Trainer{" + "id=" + id + ", nombre=" + nombre + ", ruta=" + ruta + ", horario=" + horario + '}';
    }
}
