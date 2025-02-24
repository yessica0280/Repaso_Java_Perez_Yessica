package java_empleado;

/**
 *
 * @author Uniminuto Tibu
 */
public class Empleado {
    private String nombre;
    private int id;
    private double salario;
    
    public Empleado(){}
    
    public Empleado(String nombre, int id, double salario){
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getId(){
        return id;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setSalario(double salario){
        if (salario > 0){
            this.salario = salario;
        }
        else {
            System.out.println("El salario no puede ser negativo.");
        }
    }
    
    public void MostrarInformacion(){
        System.out.println("Nombre: " + nombre + " Id: " + id + " Salario: " + salario);
    }
}
