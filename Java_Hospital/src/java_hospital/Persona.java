package java_hospital;

/**
 *
 * @author Uniminuto Tibu
 */
public class Persona {
    String nombre;
    String direccion;
    
    public Persona(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public void setDireccion(){
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", direccion=" + direccion + '}';
    }
    
    
}
