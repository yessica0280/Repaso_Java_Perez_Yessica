package encapsulamiento;

/**
 *
 * @author Uniminuto Tibu
 */
public class empleado {
    public String nombre;
    
    private String apellido;
    
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
            
}
