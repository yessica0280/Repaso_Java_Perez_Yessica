package java_dia3_perezyessica5;

import java.time.LocalDate;

/**
 *
 * @author Uniminuto Tibu
 */
public class Ticket {
    int id;
    int id_cliente;
    int id_concierto;
    String zona;
    int precioFinal;
    LocalDate fechaCompra;
    
    
    public Ticket(int id, int id_cliente, int id_concierto, String zona, int precioFinal){
        this.id = 1;
        this.id_cliente = 1;
        this.id_concierto = 1;
        this.zona = "Bogotá";
        this.precioFinal = 55000;
        this.fechaCompra = LocalDate.now();
    }
    
    public int getId(){
        return id;
    }
    
    public int getId_cliente(){
        return id_cliente;
    }
    
    public int getId_concierto(){
        return id_concierto;
    }
    
    public String getZona(){
        return zona;
    }
    
    public int getPrecioFinal(){
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Ticket{" + "id=" + id + ", id_cliente=" + id_cliente + ", id_concierto=" + id_concierto + ", zona=" + zona + ", precioFinal=" + precioFinal + ", fechaCompra=" + fechaCompra + '}';
    }
    
    
}
