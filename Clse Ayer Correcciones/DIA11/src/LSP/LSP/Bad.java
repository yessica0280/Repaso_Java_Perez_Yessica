package LSP.LSP;

/**
 *
 * @author Uniminuto Tibu
 */
public class Bad {
    // 3. Liskov Substitution Principle (LSP) - Principio de sustitución de Liskov.
    
    class Bird {
        public void fly(){
            System.out.println("Volando...");
        }
    }
    
    class Penguin extends Bird {
        @Override
        public void fly(){
            throw new UnsupportedOperationException("¡Los pinguinos no pueden volar!");
        }
    }
}
