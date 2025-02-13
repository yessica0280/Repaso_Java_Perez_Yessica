package java_dia3_perezyessica5;

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
    String fechaCompra;
    
    public Ticket(int id, int id_cliente, int id_concierto, String zona, int precioFinal, String fechaCompra){
        this.id = 1;
        this.id_cliente = 1;
        this.id_concierto = 1;
        this.zona = "Bogotá";
        this.precioFinal = 55000;
        this.fechaCompra = "12-04-2025";
    }

    @Override
    public String toString() {
        return "Ticket{" + "id=" + id + ", id_cliente=" + id_cliente + ", id_concierto=" + id_concierto + ", zona=" + zona + ", precioFinal=" + precioFinal + ", fechaCompra=" + fechaCompra + '}';
    }
    
    
}
