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
        ArrayList<String> listaTrainer = new ArrayList<>();
        ArrayList<String> listaCoordinador = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        Campers camper1 = new Campers(1, "12-0812", "luis", "luism", "luis", "caicedo", "av 12 calle 13", "esperanza", 25498379, 52167894, "Inscrito", "Bajo", "t2");
        
        Trainer trainer1 = new Trainer(1, "Johlver", "Ruta NodeJS", "6am a 10am");
        
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
            scan.nextLine();
            
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
                        scan.nextLine();
                        
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
            else if (opcion == 2){
                System.out.println("---- Trainer ----");
                System.out.println("1: Ver estado de los campers.");
                System.out.println("2: Ver ruta de los trainers.");
                System.out.println("3: Actualizar informacion de los trainers.");
                int opcion3 = scan.nextInt();
                
                switch (opcion3){
                    case 1:
                        System.out.println("estado de los campers: ");
                        System.out.println("Estudienate: " + camper1.getnom() + " ");
                        System.out.println("Estado: " + camper1.getes());
                        break;
                    case 2:
                        System.out.println("Ruta de los trainers: ");
                        System.out.println("Trainer: " + trainer1.getnom());
                        System.out.println("Ruta: " + trainer1.getru());
                        break;
                    case 3:
                        System.out.println("Que deseas actualizar: ");
                        System.out.println("1: Nombre.");
                        System.out.println("2: Ruta.");
                        int opcion4 = scan.nextInt();
                        scan.nextLine();
                        switch (opcion4){
                            case 1:
                                System.out.println("Por favor ingresa el nuevo nombre: ");
                                String nuevoNom = scan.nextLine();
                                trainer1.getnom(nuevoNom);
                                System.out.println("El nombre fue actualizado con exito: " + trainer1.getnom());
                                break;
                            case 2:
                                System.out.println("Por favor ingresa la nueva ruta: ");
                                String nuevaRut = scan.nextLine();
                                trainer1.getru(nuevaRut);
                                System.out.println("La nueva ruta fue actualizada con exito: " + trainer1.getru());
                                break;
                        }
                        break;
                }
            }
            else if (opcion == 3){
                System.out.println("---- Coordinador ----");
                System.out.println("1: ver campers.");
                System.out.println("2: Añadir camper.");
                System.out.println("3: Actualizar datos del camper.");
                System.out.println("4: Eliminar camper.");
                System.out.println("5: Ver trainers.");
                System.out.println("6: Registrar treiners.");
                System.out.println("7: Actualizar datos del trainer.");
                System.out.println("8: Eliminar trainer.");
                System.out.println("9: Ver coordinador.");
                System.out.println("10: Añadir coordinador.");
                System.out.println("11: Actualizar información del coordinador.");
                System.out.println("12: Eliminar coordinador.");
                int opcion4 = scan.nextInt();
                scan.nextLine();
                
                switch (opcion4){
                    case 1: 
                        System.out.println("Campers estudiando: ");
                        System.out.println(camper1);
                        break;
                    case 2:
                        System.out.println("Por favor ingresa los datos del nuevo camper: ");
                        System.out.println("id: ");
                        int id = scan.nextInt();
                        scan.nextInt();
                        System.out.println("Fecha: ");
                        String fecha = scan.nextLine();
                        System.out.println("Usuario: ");
                        String usuario = scan.nextLine();
                        System.out.println("Contraseña: ");
                        String contraseña = scan.nextLine();
                        System.out.println("Nombre: ");
                        String nombre = scan.nextLine();
                        System.out.println("Apellido: ");
                        String apellido = scan.nextLine();
                        System.out.println("Dirección: ");
                        String direccion = scan.nextLine();
                        System.out.println("Acudiente: ");
                        String acudiente = scan.nextLine();
                        System.out.println("Numero de telefono: ");
                        int numero_celular = scan.nextInt();
                        System.out.println("Numero fijo: ");
                        int numero_fijo = scan.nextInt();
                        System.out.println("Estado: ");
                        String estado = scan.nextLine();
                        System.out.println("Riesgo: ");
                        String riesgo = scan.nextLine();
                        System.out.println("Grupo: ");
                        String grupo = scan.nextLine();
                        
                        Campers CamperNuevo = new Campers(id, fecha, usuario, contraseña, nombre, apellido, direccion, acudiente, numero_celular, numero_fijo, estado, riesgo, grupo);
                        listaCampers.add(CamperNuevo);
                        break;
                    case 3:
                        System.out.println("Que deseas actualizar: ");
                        System.out.println("1: Nombre.");
                        System.out.println("2: Apellido.");
                        System.out.println("3: Dirección.");
                        System.out.println("4: Estado.");
                        System.out.println("5: Riesgo.");
                        int opcion5 = scan.nextInt();
                        
                        switch (opcion5){
                            case 1: 
                                System.out.println("Por favor ingrese el nuevo nombre: ");
                                String nuevoN = scan.nextLine();
                                camper1.getnom();
                                System.out.println("El nuevo nombre fue actualizado con exito: " + camper1.getnom());
                                break;
                            case 2:
                                System.out.println("Por favor ingresa el nuevo apellido: ");
                                String nuevoA = scan.nextLine();
                                camper1.getape();
                                System.out.println("El nuevo apellido fue actualizado con exito: " + camper1.getape());
                                break;
                            case 3:
                                System.out.println("Por favor ingresa la nueva dirección: ");
                                String nuevaD = scan.nextLine();
                                camper1.getdi();
                                System.out.println("La nueva dirección fue actualizada con exito: "+ camper1.getdi());
                                break;
                            case 4:
                                System.out.println("Por favor ingresa el nuevo estado: ");
                                String nuevoE = scan.nextLine();
                                camper1.getes();
                                System.out.println("El nuevo estado fue actualizado con exito: " + camper1.getes());
                                break;
                            case 5:
                                System.out.println("Por favor ingresa el nuevo riesgo: ");
                                String nuevoR = scan.nextLine();
                                camper1.getri();
                                System.out.println("El nuevo riesgo fue actualizado con exito: " + camper1.getri());      
                        }
                    case 4: 
                        System.out.println("Que camper deseas eliminar: ");
                        System.out.println("Camper: " + camper1.nombre);
                        System.out.println("Riesgo: " + camper1.riesgo);
                        break;
                    case 5:
                        System.out.println("Trainer que estan trabajando en Campus: ");
                        System.out.println(trainer1);
                        break;
                    case 6:
                        System.out.println("Por favor ingresa los datos del nuevo trainer: ");
                        System.out.println("id: ");
                        int idt = scan.nextInt();
                        System.out.println("Nombre: ");
                        String nombren = scan.nextLine();
                        System.out.println("Ruta: ");
                        String rut = scan.nextLine();
                        System.out.println("Horario: ");
                        String horariot = scan.nextLine();
                        Trainer TrainerNuevo = new Trainer(idt, nombren, rut, horariot);
                        listaTrainer.add(TrainerNuevo);
                        break; 
                    case 7: 
                        System.out.println("Que deseas actualizar de los trainers: ");
                        System.out.println("1: Nombre.");
                        System.out.println("2: Ruta.");
                        System.out.println("3: Horario.");
                        int opcion6 = scan.nextInt();
                        if (opcion6 == 1){
                            System.out.println("Por favor ingresa el nuevo nombre: ");
                            String nuevonom = scan.nextLine();
                            trainer1.getnom(nuevonom);
                            System.out.println("El nombre del nuevo trainer fue actualizado con exuto: " + trainer1.getnom());
                        }
                        else if (opcion6 == 2){
                            System.out.println("Por favor ingresa la nueva ruta: ");
                            String nuevaru = scan.nextLine();
                            trainer1.getru(nuevaru);
                            System.out.println("La nueva ruta fue actualizada con exito: " + trainer1.getru());
                        }
                        else if (opcion6 == 3){
                            System.out.println("Por favor ingresa el nuevo horario: ");
                            String nuevoho = scan.nextLine();
                            trainer1.getho(nuevoho);
                            System.out.println("El nuevo horario fue actualizado con exito: " + trainer1.getho());
                        }
                        break;
                    case 8:
                        System.out.println("Por favor ingresa el id del treiner que deseas eliminar: ");
                        break;
                    case 9:
                        System.out.println("Coordinadores laborando en campus: ");
                        System.out.println(coor);
                        break;
                    case 10:
                        System.out.println("Por favor ingresa los datos del nuevo coordinador: ");
                        System.out.println("Nombre: ");
                        String nombreCor = scan.nextLine();
                        System.out.println("Apellido: ");
                        String apellidoCor = scan.nextLine();
                        System.out.println("Cargo: ");
                        String cargoCor = scan.nextLine();
                        Coordinador nuevoCord = new Coordinador(nombreCor, apellidoCor, cargoCor);
                        listaCoordinador.add(nuevoCord);
                        break;
                    case 11:
                        System.out.println("Que deseas actualizar: ");
                        System.out.println("1: Nombre.");
                        System.out.println("2: Apellido.");
                        System.out.println("3: Cargo.");
                        int opcion7 = scan.nextInt();
                        if (opcion7 == 1){
                            System.out.println("Por favor ingresa el nombre del coordinador: ");
                            String nombreC = scan.nextLine();
                            coor.getnom(nombreC);
                        }
                        else if (opcion7 == 2){
                            System.out.println("Por favor ingresa el apellido del coordinador: ");
                            String apellidoC = scan.nextLine();
                            coor.getape(apellidoC);
                        }
                        else if (opcion7 == 3){
                            System.out.println("Por favor ingresa el cargo del coordinador: ");
                            String cargoC = scan.nextLine();
                            coor.getcar(cargoC);
                        }
                        break;
                    case 12:
                        System.out.println("Por favor ingresa el id del coordinador que deseas eliminar: ");
                        break;
                }
            }
        }
    }
    
}
