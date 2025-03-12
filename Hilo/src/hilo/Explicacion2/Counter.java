package hilo.Explicacion2;

/**
 *
 * @author Uniminuto Tibu
 */
public class Counter extends Thread{
    private int c = 0;
    public synchronized void increment() {c++;}
    public synchronized void decrement() {c--;}
    
    public void run() {
        for (int i = 0; i < 10000; i ++) {
                increment();
                decrement();// En este hilo lo que se hace es llamar al contador sumar 100 veces.
        }
    }
    
    public int value() {return c;}
}
