package java_dia3_perezyessica5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Uniminuto Tibu
 */
public class Java_Dia3_PerezYessica5 {
    public static void main(String[] args) {
        /*DB_Conexion dbc = new DB_Conexion(); 
        dbc.conectar();*/

        ArrayList<Clientes> listaClientes = new ArrayList<>();
        ArrayList<Concierto> listaConcierto = new ArrayList<>();
        ArrayList<Ticket> listaTicket = new ArrayList<>();
        ArrayList<Zona> listaZona = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        Clientes cliente1 = new Clientes(1, "Yessica", "Perez", "perez@gmail.com", 257525614);
        
        Concierto concierto1 = new Concierto(1, "Mega Concierto", "Paulo Londra", "12-02-2025", "Estadio Nemesio Camacho El Campín", 50000);
        listaConcierto.add(concierto1);
        
        Ticket ticket1 = new Ticket(1, 1, 1, "Bogotá", 55000);
        
        Zona zona1 = new Zona(1, "Bogotá Center", 500, 25000);
        
        boolean salir = false;
        
        while (salir == false){
            System.out.println("---- Menú Principal ----");
            System.out.println("1: Ver conciertos disponibles.");
            System.out.println("2: Registrar cliente.");
            System.out.println("3: Comprar ticket.");
            System.out.println("4: Ver tickets por cliente.");
            System.out.println("5: Cancelar ticket.");
            System.out.println("6: Listar los tickets vendidos para un concierto especifico.");
            System.out.println("7: Conciertos por cliente.");
            System.out.println("8: Ingresos totales.");
            System.out.println("9: Salir.");
            int opcion = scan.nextInt();
            scan.nextLine();
            switch(opcion){
                case 1:
                    System.out.println("Los conciertos disponibles son los siguientes: ");
                    for (int i = 0; i < listaConcierto.size(); i ++){
                       System.out.println("Id: " + listaConcierto.get(i).id);
                       System.out.println("Nombre: " + listaConcierto.get(i).nombre);
                       System.out.println("Artista: " + listaConcierto.get(i).artista);
                       System.out.println("Fecha: " + listaConcierto.get(i).fecha);
                       System.out.println("lugar: " + listaConcierto.get(i).lugar);
                       System.out.println("Precio de base: " + listaConcierto.get(i).precioBase);
                    }
                    break; 
                case 2: 
                    System.out.println("Por favor ingrese los datos del cliente: ");
                    System.out.println("Id: ");
                    int id = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Nombre: ");
                    String nombre = scan.nextLine();
                    System.out.println("Apellido: ");
                    String apellido = scan.nextLine();
                    System.out.println("Correo: ");
                    String correo = scan.nextLine();
                    System.out.println("Telefono: ");
                    long telefono = scan.nextLong();
                    Clientes nuevoC = new Clientes(id, nombre, apellido, correo, telefono);
                    listaClientes.add(nuevoC);
                    System.out.println("El cliente fue registrado con exito.");
                    System.out.println("Id: " + nuevoC.getId());
                    System.out.println("Nombre: " + nuevoC.getNombre());
                    System.out.println("Apellido: " + nuevoC.getApellido());
                    System.out.println("Correo: " + nuevoC.getCorreo());
                    System.out.println("Telefono: " + nuevoC.getTelefono());
                    break;
                    
                case 3:
                    System.out.println("Comprar ticket");
                    System.out.println("Personas: ");
                    for (Clientes i: listaClientes){
                        System.out.println(i);
                    }
                    System.out.println("Ingrese el id de la persona: ");
                    int nuevoId = scan.nextInt();
                    for (Concierto c: listaConcierto){
                        System.out.println(c);
                    }
                    int cantPrecioBase = 0;
                    System.out.println("Ingrese el id del concierto: ");
                    int nuevoIdCon = scan.nextInt();
                    for (Concierto c: listaConcierto){
                        if (nuevoIdCon == c.id){
                            cantPrecioBase = c.precioBase;
                        }
                    }
                    for (Zona i: listaZona){
                        System.out.println(i);
                    }
                    int cantPrecioZona = 0;
                    String cantNombreZona = "";
                    System.out.println("Ingrese el id de la zona: ");
                    int nuevaZonas = scan.nextInt();
                    for (Zona z: listaZona){
                        if (nuevaZonas == z.id){
                            cantNombreZona = z.nombreZona;
                            cantPrecioZona = z.precioAdicional;
                        
                        }
                    }
                    int nuevoPrecioFinal = cantPrecioBase + cantPrecioZona;
                    listaTicket.add(new Ticket(2, nuevoId, nuevoIdCon, cantNombreZona, nuevoPrecioFinal));
                    for (Ticket t: listaTicket){
                        System.out.println(t);
                    }
                    break;

                case 4:
                    System.out.println("Clientes registrados: ");
                    for (int i = 0; i < listaClientes.size(); i ++){
                        Clientes cliente =listaClientes.get(i);
                        System.out.println((i + 1) + ": " + cliente.getNombre());
                    }
                    System.out.println("Por favor ingrese el id del cliente para ver el ticket: ");
                    int clienteId = scan.nextInt();
                    if (clienteId < 1 || clienteId > listaClientes.size()){
                        System.out.println("El id del cliente no existe.");
                    }else {
                        Clientes cliente = listaClientes.get(clienteId - 1);
                        boolean TicketsExistente = false;
                        System.out.println("Tickets de: " + cliente.getNombre() + ":");
                        for (int i = 0; i < listaTicket.size(); i ++){
                            Ticket ticket = listaTicket.get(i);
                            if (ticket.getId_cliente() == cliente.getId());
                            System.out.println(ticket);
                            TicketsExistente = true;
                        }
                    }
                    break;

                case 5: 
                    System.out.println("-- Tickets comprado --");
                    if (listaTicket.isEmpty()){
                        System.out.println("No encontramos algún ticket comprado.");
                    } 
                    else {
                        for (int i = 0; i < listaTicket.size(); i ++){
                            Ticket ticket = listaTicket.get(i);
                            System.out.println((i + 1) + ": " + ticket);
                        }
                        System.out.println("Por favor ingresa el ticket que deseas cancelar: ");
                        int ticketId = scan.nextInt();
                        System.out.println("Ticket cancelado.");
                        
                        if (ticketId < 1 || ticketId > listaTicket.size()){
                            System.out.println("El id del ticket no es válido.");
                        }
                        else {
                            Ticket ticketCancelado = listaTicket.get(ticketId - 1);
                            listaTicket.remove(ticketId - 1);
                        }
                    }
                    break;
                case 6:
                    System.out.println("--- Tickets vendidos ---");
                    if (listaConcierto.isEmpty()){
                        System.out.println("No encontramos conciertos disponibles.");
                    }
                    else {
                        System.out.println("Conciertos disponibles: ");
                        for (int i = 0; i < listaConcierto.size(); i ++){
                            Concierto concierto = listaConcierto.get(i);
                            System.out.println((i + 1) + ": " + concierto.getNombre());
                        }
                        System.out.println("Por favor ingresa el id del concierto para ver los tickets vendidos: ");
                        int conciertoId = scan.nextInt();
                        if (conciertoId < 1 || conciertoId > listaConcierto.size()){
                            System.out.println("El id no fue encontrado: ");
                        }
                        else {
                            Concierto concierto = listaConcierto.get(conciertoId - 1);
                            boolean TicketsE = false;
                            System.out.println("Tickets vendidos para el concierto: " + concierto.getNombre());
                            for (Ticket t : listaTicket){
                                System.out.println(t);
                                TicketsE = true;
                            }
                        }
                    }
                    break;
                case 7:
                    System.out.println("Conciertos a los que asistira un cliente: ");
                    System.out.println("Ingresa el id del cliente: ");
                    int idCli = scan.nextInt();
                    for (Ticket t: listaTicket){
                        if (idCli == t.id_cliente){
                            for (Concierto c: listaConcierto){
                                if (t.id_concierto == c.id){
                                    System.out.println(c);
                                    System.out.println("");
                                }
                                
                        }
                        }
                    }
                    break;
                case 8:
                    System.out.println("--- Ingresos totales ---");
                    int ingresosTotales = 0;
                    if (listaTicket.isEmpty()){
                        System.out.println("No se han vendidos tickets.");
                    }
                    else {
                        for (Ticket t : listaTicket){
                            ingresosTotales += t.getPrecioFinal();
                        }
                        System.out.println("Los ingresos totales son de: " + ingresosTotales);
                    }
                    break;

                case 9: 
                    System.out.println("Gracias por usar el sistema");
                    salir = true;
                    break;

            }   
        }
    }
    
}
