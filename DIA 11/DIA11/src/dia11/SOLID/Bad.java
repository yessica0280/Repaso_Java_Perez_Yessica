package dia11.SOLID;

/**
 *
 * @author Uniminuto Tibu
 */
public class Bad {
    // 1. Single Responsibility Principle (SRP) - Principio de Responsabilidad Única.
    // Una clase debe tener una única razón para cambiar.
    
    class Report {
        public void generateReport(){
            // Genera un informa.
        }
        
        public void saveToFile(String filename){
            // Guarda el informe en un archivo (Violación de SRP).
        }
    }
    
    // ¿Qué está mal? La clase Report tiene dos responsabilidades
    // genera el informe y guarda en un archivo.
}
