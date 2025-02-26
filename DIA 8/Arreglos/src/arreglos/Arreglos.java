package arreglos;

/**
 *
 * @author Uniminuto Tibu
 */
public class Arreglos {    
    // Estructuras de datos: Una estructura de datos es una forma organizada de 
    // almacenar, gestionar y manipular datos para que puedan ser utilizada
    // de manera eficiente.
    
    public static void main(String[] args) {
        // Arreglos.
        // Un arreglo es una estructura de datos que posibilita
        // la agrupacion de elementos del mismo tipo en una sola variable.      
        int [] arreglito;
        
        // Un arreglo se debe inicializar para que tenga un espacio de memoria.
        int[] arreglito2 = new int[5];
        arreglito2[0] = 8;
        System.out.println(arreglito2[0]);
        System.out.println(arreglito2.length);
        
        for (int i = 0; i < arreglito2.length; i ++){
            System.out.println(arreglito2[i]);
        }
        System.out.println("##################");
        
        // Matrices.
        // Las matrices son arreglos multidimensionales, donde el Java se
        // crea comúnmente las dos dimensiones.
        int cantidadFilas = 3;
        int cantidadCol = 2;
        int[][] matriz = new int[cantidadFilas][cantidadCol];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[1][0] = 3;
        matriz[1][1] = 4;
        matriz[2][0] = 5;
        matriz[2][1] = 6;
        
        // Ciclo anidado.
        for (int i = 0; i < matriz.length; i ++){
            for (int q = 0; q < cantidadCol; q ++){
                System.out.println(matriz[i][q]);
            }
        }
    }
    
}
