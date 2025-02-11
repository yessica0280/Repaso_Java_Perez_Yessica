import java.util.*;
import java.io.*;

class programa {

    // Clase que representa a los campers
    static class Camper {
        String id;
        String usuario;
        String contraseña;
        String nombre;
        String apellido;
        String direccion;
        String acudiente;
        String numeroCelular;
        String numeroFijo;
        String estado;
        String riesgo;

        public Camper(String id, String usuario, String contraseña, String nombre, String apellido, String direccion,
                      String acudiente, String numeroCelular, String numeroFijo, String estado, String riesgo) {
            this.id = id;
            this.usuario = usuario;
            this.contraseña = contraseña;
            this.nombre = nombre;
            this.apellido = apellido;
            this.direccion = direccion;
            this.acudiente = acudiente;
            this.numeroCelular = numeroCelular;
            this.numeroFijo = numeroFijo;
            this.estado = estado;
            this.riesgo = riesgo;
        }

        public String toString() {
            return "Nombre: " + nombre + " " + apellido + " - Estado: " + estado;
        }
    }

    // Clase que representa a los trainers
    static class Trainer {
        String id;
        String nombre;
        String rutaEntrenamiento;
        String horario;

        public Trainer(String id, String nombre, String rutaEntrenamiento, String horario) {
            this.id = id;
            this.nombre = nombre;
            this.rutaEntrenamiento = rutaEntrenamiento;
            this.horario = horario;
        }
    }

    // Clase que representa una ruta de entrenamiento
    static class Ruta {
        String nombre;
        String modulo;
        List<Camper> campers;

        public Ruta(String nombre, String modulo) {
            this.nombre = nombre;
            this.modulo = modulo;
            this.campers = new ArrayList<>();
        }

        public boolean agregarCamper(Camper camper) {
            if (this.campers.size() < 33) {
                this.campers.add(camper);
                return true;
            }
            return false;
        }
    }

    // Clase que representa al coordinador
    static class Coordinador {
        String id;
        String nombre;
        String apellido;
        String cargo;
        List<Camper> campers;
        List<Ruta> rutasEntrenamiento;

        public Coordinador(String id, String nombre, String apellido, String cargo) {
            this.id = id;
            this.nombre = nombre;
            this.apellido = apellido;
            this.cargo = cargo;
            this.campers = new ArrayList<>();
            this.rutasEntrenamiento = new ArrayList<>();
        }

        // Método para subir la nota de los campers y cambiar su estado a aprobado si su promedio es mayor o igual a 60
        public void subirNota(Camper camper, double notaTeorica, double notaPractica) {
            double promedio = (notaTeorica * 0.3) + (notaPractica * 0.6);
            if (promedio >= 60) {
                camper.estado = "Aprobado";
            }
        }

        // Método para imprimir el estado de los campers
        public void estadoCampers() {
            System.out.println("Estado de los campers: ");
            for (Camper camper : campers) {
                System.out.println(camper);
            }
        }

        // Método para imprimir un reporte de los campers inscritos
        public void reporteCampersInscritos() {
            System.out.println("Campers inscritos: ");
            for (Camper camper : campers) {
                if ("Inscrito".equals(camper.estado)) {
                    System.out.println(camper);
                }
            }
        }

        // Método para imprimir un reporte de los campers aprobados
        public void reporteCampersAprobados() {
            System.out.println("Campers aprobados: ");
            for (Camper camper : campers) {
                if ("Aprobado".equals(camper.estado)) {
                    System.out.println(camper);
                }
            }
        }

        // Método para imprimir un reporte de los trainers trabajando en las rutas de entrenamiento
        public void reporteTrainerTrabajando() {
            System.out.println("Trainers trabajando: ");
            for (Ruta ruta : rutasEntrenamiento) {
                System.out.println("Ruta: " + ruta.nombre);
            }
        }

        // Método para eliminar un camper de la lista de campers
        public void eliminarCamper(List<Camper> listaCampers) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el id del camper que desea eliminar: ");
            String idCamper = scanner.nextLine();

            boolean encontrado = false;
            Iterator<Camper> iterator = listaCampers.iterator();
            while (iterator.hasNext()) {
                Camper camper = iterator.next();
                if (camper.id.equals(idCamper)) {
                    iterator.remove();
                    System.out.println("Camper eliminado exitosamente.");
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("No se encontró ningún camper con ese id.");
            }
        }
    }

    // Menú principal
    public static void mostrarMenu() {
        System.out.println("Bienvenido al sistema de gestión del campus");
        System.out.println("1. Ver estado de los campers");
        System.out.println("2. Subir nota de los campers");
        System.out.println("3. Ver reporte de campers inscritos");
        System.out.println("4. Ver reporte de campers aprobados");
        System.out.println("5. Ver reporte de trainers trabajando");
        System.out.println("6. Eliminar camper");
        System.out.println("7. Salir");
    }

    // Método principal para interactuar con el usuario
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Coordinador coordinador = new Coordinador("1", "Juan", "Perez", "Coordinador");
        
        // Crear algunos campers para probar el sistema
        Camper camper1 = new Camper("C1", "usuario1", "pass1", "Pedro", "Lopez", "Direccion 1", "Acudiente 1", "123456789", "987654321", "Inscrito", "Bajo");
        Camper camper2 = new Camper("C2", "usuario2", "pass2", "Maria", "Gomez", "Direccion 2", "Acudiente 2", "234567890", "876543210", "Aprobado", "Medio");
        coordinador.campers.add(camper1);
        coordinador.campers.add(camper2);

        while (true) {
            mostrarMenu();
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    coordinador.estadoCampers();
                    break;
                case 2:
                    System.out.print("Ingrese el id del camper: ");
                    String id = scanner.nextLine();
                    System.out.print("Ingrese la nota teórica: ");
                    double teoria = scanner.nextDouble();
                    System.out.print("Ingrese la nota práctica: ");
                    double practica = scanner.nextDouble();
                    scanner.nextLine();  // Consumir la nueva línea
                    // Encontrar el camper por id
                    for (Camper camper : coordinador.campers) {
                        if (camper.id.equals(id)) {
                            coordinador.subirNota(camper, teoria, practica);
                            break;
                        }
                    }
                    break;
                case 3:
                    coordinador.reporteCampersInscritos();
                    break;
                case 4:
                    coordinador.reporteCampersAprobados();
                    break;
                case 5:
                    coordinador.reporteTrainerTrabajando();
                    break;
                case 6:
                    coordinador.eliminarCamper(coordinador.campers);
                    break;
                case 7:
                    System.out.println("Saliendo del sistema...");
                    return;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
            }
        }
    
    }
}


