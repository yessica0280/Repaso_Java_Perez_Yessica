package Patronesdediseño.Factory;

/**
 *
 * @author Uniminuto Tibu
 */

// factory Method:
// Este patrón define una interfaz para crear objetos, pero permite a las subclases decidir qué
// clase concreta instanciar. Se usa para evitar la creación directa de objetos con new.

interface Producto {
    void usar();
}

class ProductoA implements Producto {
    public void usar(){
        System.out.println("Usando Producto A.");
    }
}

class ProductoB implements Producto {
    public void usar(){
        System.out.println("Usando Producto B.");
    }
}

public class Factorys {
    class Factory {
        public static Producto crearProducto(String tipo){
            if (tipo.equalsIgnoreCase("A")){
                return new ProductoA();
            }
            else if (tipo.equalsIgnoreCase("B")){
                return new ProductoB();
            }
            throw new IllegalArgumentException("Tipo desconocido");      
        } 
    }
    
    // Uso
    public static void main(String[] args){
        try {
            Producto p1 = Factory.crearProducto("A");
            p1.usar();

            Producto p2 = Factory.crearProducto("C");
            p2.usar();
        }
        catch (Exception e ){
            System.out.println(e);
        }
    }
}
