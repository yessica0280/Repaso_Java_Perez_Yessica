package main;

import java.util.Scanner;

/**
 *
 * @author Uniminuto Tibu
 */
public class Main {
    // ENCAPSULAMIENTO.
    // Se refiere a la restricción del acceso a algunos
    // de los componentes de un objeto, especialmente los atributos, con el fin
    // de prevenir modificaciones no autorizadas.
    
    public static void main(String[] args) {
        Persona p1 = new Persona();
        
        Scanner sacn = new Scanner(System.in);
        
        p1.setNombre("Valentina");
        p1.setEdad(21);
        
        System.out.println(p1.getNombre());
        
        CuentaBancaria cl = new CuentaBancaria("AERT8NB7VDE", 10000000);
        
        System.out.println(cl.getSaldo());
        
        cl.depositar(2500000);
        System.out.println(cl.getSaldo());
        
        cl.retirar(9000000);
        System.out.println(cl.getSaldo());
    }
}
