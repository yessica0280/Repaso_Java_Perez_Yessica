package java_perezyessica;

/**
 *
 * @author Usuario
 */
public class Coordinador {
    String nombre;
    String apellido;
    String cargo;
    
    public Coordinador(String nombre, String apellido, String cargo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Coordinador{" + "nombre=" + nombre + ", apellido=" + apellido + ", cargo=" + cargo + '}';
    }
}
