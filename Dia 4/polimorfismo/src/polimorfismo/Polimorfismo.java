package polimorfismo;

/**
 *
 * @author Uniminuto Tibu
 */
public class Polimorfismo {
    public static void main(String[] args) {
        persona vector[] = new persona[5];
        vector[0] = new persona();
        vector[1] = new empleado();
        vector[2] = new consultor();
        vector[3] = new jefe();
    }
    
}
