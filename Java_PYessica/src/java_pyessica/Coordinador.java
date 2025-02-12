package java_pyessica;

/**
 *
 * @author Uniminuto Tibu
 */
public class Coordinador {
    String nombre;
    String apellido;
    String cargo;
    
    public Coordinador(String nombre, String apellido){
        this.nombre = "Stiven";
        this.apellido = "Carvajal";
        this.cargo = "Coordinador";
    }
    
    public Coordinador(String nombre, String apellido, String cargo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
    }
    
    public String getnom(){
        return nombre;
    }
    public String getape(){
        return apellido;
    }
    public String getcar(){
        return cargo;
    }

    @Override
    public String toString() {
        return "Coordinador{" + "nombre=" + nombre + ", apellido=" + apellido + ", cargo=" + cargo + '}';
    }
}
