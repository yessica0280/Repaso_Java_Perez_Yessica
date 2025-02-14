package encapsulamiento;

/**
 *
 * @author Uniminuto Tibu
 */
public class principal {
    public static void main(String[]args){
        empleado  empleado = new empleado();
        empleado.nombre = "Andrea";
        System.out.println("El nombre del empleado es: " + empleado.nombre);
        
        empleado.setApellido("Vargas");
        System.out.println("El apellido es: " + empleado.getApellido());
    }
}
