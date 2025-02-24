package main;

/**
 *
 * @author Uniminuto Tibu
 */
public class Persona {
    private String nombre;
    private int edad;
    
    public Persona(){}
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Getters y Setters: Son métodos que permiten obtener o modificar atributos
    // privados de una clase.
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int gerEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        if (edad > 0){
            this.edad = edad;
        }
        else {
            System.out.println("La edad no es válida. Pues debe ser mayor a 0.");
        }
    }
}
