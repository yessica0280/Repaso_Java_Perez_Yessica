package persistencia_de_datos.ArchivoSimple;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author Uniminuto Tibu
 */
public class PersistenciaFile {
    private static final String nombre_archivo = "./src/persistencia_de_datos/ArchivoSimple/data.txt";
    
    // Método para guardar.
    public static void guardarDatos(String contenido) {
        try (FileWriter guardar = new FileWriter(nombre_archivo)) { 
            guardar.write(contenido);
            System.out.println("Datos fueron guardados de manera correcta.");
        }
        catch (IOException e) {
            System.out.println("Error al momento de guardar: " + e.getMessage());
        }
    }
    
    // Método para leer.
    public static void LeerDato() {
        try(BufferedReader Lector = new BufferedReader(new FileReader(nombre_archivo))) {
            String Linea;
            System.out.println("Contenido del archivo: ");
            while ((Linea = Lector.readLine()) != null) {
                System.out.println(Linea);
            }
        }
        catch (IOException e) {
            System.out.println("Error al momenot de importar el archivo." + e.getMessage());
        }
    }
}
