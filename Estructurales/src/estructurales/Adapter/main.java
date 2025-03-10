package estructurales.Adapter;

/**
 *
 * @author Uniminuto Tibu
 */

// Adapter:
// Convierte la interfaz de una clase en otra antiguo que usa Volt120 y 
// queremos adaptarlo a un sistema moderno que se usa Volt12.
public class main {
    // Interfaz esperada por e cliente.
    interface Volt12 {
        int getVolt12();
    }
    
    static class Volt120 {
        int getVolt120(){
            return 120;
        }
    }
    
    static class VoltAdapter implements Volt12 {
        private Volt120 volt120;
        
        public VoltAdapter(Volt120 volt120) {
            this.volt120 = volt120; 
        }
        
        @Override
        public int getVolt12() {
            return volt120.getVolt120() / 10;
        }
    }
    
    // Uso del adaptador.
    public static void main(String[] args) {
        Volt120 oldSystem = new Volt120();
        Volt12 adaptedSystem = new VoltAdapter(oldSystem);
        System.out.println("Voltaje adaptado: " + adaptedSystem.getVolt12() + "V");
    }
}
