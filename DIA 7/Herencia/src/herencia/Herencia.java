package herencia;

/**
 *
 * @author Uniminuto Tibu
 */
public class Herencia {
    public static void main(String[] args) {
        // Herencia
        // La herencia es un mecanismo que permite crear nuevas clases apartir 
        // de clases existentes, la clase que se hereda se demonima superclase
        // o clase base, donde la nueva clase se conoce como subcalse o calse derivada.
        
        // Cracterísticas
        // 1. Reutilización de códigos: Las subclases heredan atributos y 
        // métodos de la superclase, evitando así la duplicación de código.
        
        // 2. Jerarquía de clases: Permite organizar y estructurar el código en
        // una jerarquía lógica.
        
        // 3. Extensibilidad: Se pueden agregar o modificar funcionalidades en la 
        // subclase sin afectar la superclase.
        
        Perro p1 = new Perro("Lucas");
        p1.hacerSonido();
        p1.moverCola();
        
        // Polimorfismo.
        // El polimosfismo permite que un objeto se comporte de
        // diferentes maneras según el contexto. En Java, esto se traduce
        // en que una variable de un tipo de referencia (por ejemplo, las superclases)
        // pueda referenciar a objetos de cualquier subclase.
        
        // Creamos una variable llamada "miAnimal" de tipo Animal, pero se le asigna
        // un objeto de la subclase "Perro".
        Animal miAnimal = new Perro("firulais"); // Tiempo de ejecución.
        // En Java una subclase es un tipo de la superclase. Dicho eso, "Perro" es un "Animal".
        
        // Aunque la variable es de tipo "Animal", se invoca el método sobrescrito en "Perro".
        // Al momento de llamar "miAnimal.hacerSonido" el método que se ejecuta es el de la clase 
        // "Perro", no el de "Animal". Esto se debe a que a pesar que la variable es de tipo "Animal",
        // el método sobrescrito en Perro se invoca en tiempo de ejecución. Esto se conoce 
        // como "Despache dinámico" o "vinculación tardía".
        miAnimal.hacerSonido(); 
        miAnimal.dormir();
        
        // Para acceder a métodos específicos de Perro, es necesario realizar un casting.
        // 
        if (miAnimal instanceof Perro){
            Perro miPerro = (Perro) miAnimal;
            miPerro.moverCola();
        }
    }
    
}
