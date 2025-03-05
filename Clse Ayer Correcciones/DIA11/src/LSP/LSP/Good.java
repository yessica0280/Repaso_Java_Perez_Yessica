package LSP.LSP;

/**
 *
 * @author Uniminuto Tibu
 */

abstract class Bird{}
public class Good {
    class FlyingBird extends Bird {
        public void fly(){
            System.out.println("Volando...");
        }
    }
    
    class Penguin extends Bird {
        public void swin(){
            System.out.println("Nadando...");
        }
    }
}
