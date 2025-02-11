package java_perezyessica;

/**
 *
 * @author Usuario
 */
public class Ruta {
    String id;
    String trainer;
    String nombre;
    String modulo;
    String capacidad_maxima;
    
    public Ruta(String id, String trainer, String nombre, String modulo, String capacidad_maxima){
        this.id = id;
        this.trainer = trainer;
        this.nombre = nombre;
        this.modulo = modulo;
        this.capacidad_maxima = capacidad_maxima;
    }

    @Override
    public String toString() {
        return "Ruta{" + "id=" + id + ", trainer=" + trainer + ", nombre=" + nombre + ", modulo=" + modulo + ", capacidad_maxima=" + capacidad_maxima + '}';
    }
}
