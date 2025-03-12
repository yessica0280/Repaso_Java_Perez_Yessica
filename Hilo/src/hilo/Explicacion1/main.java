package hilo.Explicacion1;

/**
 *
 * @author Uniminuto Tibu
 */
public class main { 
    public static void main(String[] args) {
        // Ejemplo de PingPong
        Thread t1 = new PingPong("P");
        Thread t2 = new PingPong("S");
        
        t1.start();
        t2.start();
    }
}
