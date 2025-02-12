package java_pyessica;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Uniminuto Tibu
 */
public class Java_PYessica {
    public static void main(String[] args) {
        ArrayList<String> listaCampers = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        
        Campers camper1 = new Campers(1, "12-0812", "luis", "luism", "luis", "caicedo", "av 12 calle 13", "esperanza", 25498379, 52167894, "Inscrito", "Bajo", "t2");
        
        Trainer trainer1 = new Trainer(1, "Johlver", "Ruta NodeJS", "6am a 10am");
        
        Ruta ruta1 = new Ruta(1, "Jholver", "Ruta NodeJS", "Fundamentos de programacion (introduccion a la algoritmia, Pseint, Python)", 33);
        
        Coordinador coor = new Coordinador("Steven", "Cravajal", "Coordinador");
        
        Reporte re = new Reporte(1, "luis", "Caicedo", "Aprobado");
        
        boolean salir = false;
        
        while (salir == false){
            System.out.println("---- Menu principal ----");
            System.out.println("1: Campers.");
            System.out.println("2: Trainers.");
            System.out.println("3: Rutas.");
            System.out.println("4: Coordinador.");
            System.out.println("5: Reportes.");
            System.out.println("6: Salir.");
            int opcion = scan.nextInt();
            
            if (opcion == 1){
                System.out.println("---- Camper ----");
                System.out.println("1: Ver información.");
                System.out.println("2: Actualizar información.");
                System.out.println("3: Salir.");
                int opcion1 = scan.nextInt();
                
                switch (opcion1){
                    case 1:
                        System.out.println(camper1);
                        break;
                        
                    case 2: 
                        System.out.println("Que deseas actualizar: ");
                        System.out.println("1: Nombre");
                        System.out.println("2: Apellido");
                        System.out.println("3: Acudiente");
                        System.out.println("4: Dirección");
                        int opcion2 = scan.nextInt();
                        
                        switch (opcion2){
                            case 1:
                                System.out.println("ingresa el nuevo nombre: ");
                                String nombre = scan.nextLine();
                                camper1.getnom(nombre);
                                System.out.println("El nombre fue actualizado con exito" + nombre);
                                break;
                            case 2:
                                System.out.println("Ingresa el nuevo apellido: ");
                                String apellido = scan.nextLine();
                                camper1.getape(apellido);
                                System.out.println("El nombre fue actualizado con exito" + apellido);
                                break;
                            case 3: 
                                System.out.println("Ingresa el nuevo acudiente: ");
                                String acudiente = scan.nextLine();
                                camper1.getacu(acudiente);
                                System.out.println("El acudiente fue actualizado con exito" + acudiente);
                                break;
                            case 4: 
                                System.out.println("Ingresa la nuevo dirección: ");
                                String direccion = scan.nextLine();
                                camper1.getdi(direccion);
                                System.out.println("La dirección fue actualizado con exito" + direccion);
                                break;
                        }
                   
                    case 6:
                        salir = true;
                        break;
            }    
                }
        }
    }
    
}
