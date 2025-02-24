package java_empleado;

import java.util.Scanner;

/**
 *
 * @author Uniminuto Tibu
 */
public class Java_Empleado {
    public static void main(String[] args) {
        Empleado em = new Empleado("Yessica", 1, 1000);
        
        Scanner scan = new Scanner (System.in);
        
        em.setNombre("Yessica");
        em.setSalario(1000);
        
        System.out.println(em.getSalario());
        em.MostrarInformacion();
    }
    
}
