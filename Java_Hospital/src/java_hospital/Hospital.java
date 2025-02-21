package java_hospital;

/**
 *
 * @author Uniminuto Tibu
 */
public class Hospital {
    String nombre_hospital;
    String departamento;
    
    public Hospital(String nombre_hospital, String departamento){
        this.nombre_hospital = nombre_hospital;
        this.departamento = departamento;
    }
    

    @Override
    public String toString() {
        return "Hospital{" + "nombre_hospital=" + nombre_hospital + ", departamento=" + departamento + '}';
    }
    
    
}
