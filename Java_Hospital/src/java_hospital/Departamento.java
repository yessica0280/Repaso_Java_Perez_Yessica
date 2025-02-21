package java_hospital;

/**
 *
 * @author Uniminuto Tibu
 */
public class Departamento {
    String nombre_d;
    String personal;
    
    public Departamento(String nombre_d, String personal){
        this.nombre_d = nombre_d;
        this.personal = personal;
    }
    
    public String getNombre_d(){
        return nombre_d;
    }
    
    public void setNombre_d(String personal){
        this.personal = personal;
    }
    
    public String getPersonal(){
        return personal;
    }
    
    public void setPersonal(String personal){
        this.personal = personal;
    }

    @Override
    public String toString() {
        return "Departamento{" + "nombre_d=" + nombre_d + ", personal=" + personal + '}';
    }
    
    
}
