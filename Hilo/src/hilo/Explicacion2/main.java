package hilo.Explicacion2;

/**
 *
 * @author Uniminuto Tibu
 */
public class main {
    public static void main(String[] args) {
        Counter counter1 = new Counter(); 
        Counter counter2 = new Counter(); 
        
        counter1.start();
        counter2.start();
        
        System.out.println("Valor del contador final 1: " + counter1.value());
        System.out.println("Valor del contador final 2: " + counter2.value());
    }
}
