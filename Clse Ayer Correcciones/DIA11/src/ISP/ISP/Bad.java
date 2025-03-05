package ISP.ISP;

/**
 *
 * @author Uniminuto Tibu
 */
public class Bad {
    // 4. Interface Segregation Principle (ISP) - Principio de Segregación de Interfaz.
    // Las interfaces deben ser específicos y no forzar a una clase a implementar métodos que no necesita.
    
    interface Worker {
        void work();
        void eat();
    }
    
    class Robot implements Worker {
        public void work(){
            System.out.println("Trabajando...");
        }
        
        public void eat(){
            throw new UnsupportedOperationException("¡Un robot no come!");
        }
    }
}
