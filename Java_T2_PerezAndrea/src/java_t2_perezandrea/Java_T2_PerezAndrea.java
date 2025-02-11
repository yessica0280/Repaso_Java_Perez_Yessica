package java_t2_perezandrea;

import java.util.ArrayList;

/**
 *
 * @author Uniminuto Tibu
 */
public class Java_T2_PerezAndrea {
    // P.O.O
    //  Es un paradigma de programación que parte del
    // concepto de "objeto" conteniendo información
    // en forma de campos y código en forma de métodos.
    public static void main(String[] args) {
        Carro carrito1 = new Carro();
        Carro carrito2 = new Carro("Audi", "A4", 2010);
        Carro carrito3 = new Carro("Toyota", "Tundra", 2025, "Diesel", 1000, 2800, 5, 7, "Petroleo negro", 5);
        System.out.println(carrito1);
        System.out.println(carrito2);
        System.out.println(carrito3);
        
        // Asignar valores a un objeto.
        carrito1.modelo ="Twingo";
        carrito1.marca="Renault";
        System.out.println(carrito1);
        System.out.println(carrito1.modelo);
        
        ArrayList<Carro> listaCarro = new ArrayList<>();
        System.out.println(carrito1);
        listaCarro.add(carrito1);
        listaCarro.add(carrito2);
        listaCarro.add(carrito3);
        // [carrito1, carrito2, carrito3].
        System.out.println(listaCarro);
        System.out.println(listaCarro.get(2));
        Carro carroTemporal = new Carro();
        carroTemporal = listaCarro.get(2);
        System.out.println(carroTemporal.marca);
        for (int i = 0; i < listaCarro.size(); i ++){
            System.out.println(listaCarro.get(i).marca);
        }
        
    }
    
}
