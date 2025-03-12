package hilo.Explicacion3;

/**
 *
 * @author Uniminuto Tibu
 */
public class main {
    public static void main(String[] args) {
        PingPongSincronizado p1 = new PingPongSincronizado("P");
        PingPongSincronizado p2 = new PingPongSincronizado("S");
        
        p1.start();
        p2.start();
    }
}
