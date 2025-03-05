package DIP.DIP;

/**
 *
 * @author Uniminuto Tibu
 */
public class Bad {
    // 5. Dependency Inversion Principle (DIP) - Principio de Inversión de Dependencia.
    // Las clases deben depender de abstracciones en lugar de depender directamente de clases concretas.
    
    class MySQLDatabase {
        public void connect(){
            System.out.println("Conectando a MySQL...");
        }
    }
    
    class DataManager{
        private MySQLDatabase database;
        
        public DataManager(){
            this.database = new MySQLDatabase();
        }
        
        public void connect(){
            database.connect();
        }
    }
}
