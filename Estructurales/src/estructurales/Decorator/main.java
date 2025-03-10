package estructurales.Decorator;

/**
 *
 * @author Uniminuto Tibu
 */

// Decorator:
//  Añade funcionalidades a un objeto sin modíficar su estructura.

// Ejemplo:
// Agrega cracterísticas extras a un café.
public class main {
    
    // Componente base.
    interface Coffe {
        String getDescription();
        double cost();
    }
    
    // Implementación base.
    static class SimpleCoffe implements Coffe {
        public String getDescription( ){
            return "Café simple";
        }
        
        public double cost() {
            return 5.0;
        }
    }
    
    // Decoraror abstracto.
    static abstract class CoffeDecorator implements Coffe {
        protected Coffe coffe;
        
        public CoffeDecorator(Coffe coffe) {
            this.coffe = coffe;
        }
        
        public String getDescription() {
            return coffe.getDescription();
        }
        
        public double cost() {
            return coffe.cost();
        }
    }
    
    // Decorador concreto.
    static class MilkDecorator extends CoffeDecorator {
        public MilkDecorator(Coffe coffe) {super(coffe);}
        
        public String getDescription() {return coffe.getDescription() + ", con leche";}
        
        public double cost() {return coffe.cost() + 1.5;}
    }
    
    // Uso del patrón Decorador.
    public static void main(String[] args) {
        Coffe myCoffe = new SimpleCoffe();
        System.out.println(myCoffe.getDescription() + myCoffe.cost());
        
        myCoffe = new MilkDecorator(myCoffe);
        System.out.println(myCoffe.getDescription() + " $ " + myCoffe.cost());
    }
}
