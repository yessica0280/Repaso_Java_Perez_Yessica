package ejemplos_pedro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Uniminuto Tibu
 */
public class CrudTXT {
    private static String archivo = "./src/ejemplos_pedro/info.txt";
    private static List<Persona> personas = new ArrayList<>();
    private static List<Producto> productos = new ArrayList<>();
    
    // Cargar los datos persístentes.
    public static void cargarDatos() {
        personas.clear();
        productos.clear();
        try(BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while((linea = reader.readLine()) != null) {
                if (linea.startsWith("P,")) {
                    personas.add(Persona.fromString(linea));
                }
                else if (linea.startsWith("PR,")) {
                    productos.add(Producto.fromString(linea));
                }
            }
        }
        catch(Exception e) {
            System.out.println("No se puede cargar el archivo. Se procede a crear una nueva.");
        }
    }
    
    public static void listarProductos() {
        if(productos.isEmpty()) {
            System.out.println("No se pueden listar personas porque no existen");
        } else {
            for (Producto p : productos) {
                System.out.println(p);
            }
        }
    }
    
    public static void listarPersonas() {
        if(personas.isEmpty()) {
            System.out.println("No se pueden listar personas porque no existen");
        } else {
            for (Persona pr : personas) {
                System.out.println(pr);
            }
        }
    }
}
