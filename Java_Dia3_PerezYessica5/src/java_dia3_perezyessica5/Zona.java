package java_dia3_perezyessica5;

/**
 *
 * @author Usuario
 */
public class Zona {
    int id;
    String nombreZona;
    int capacidad;
    int precioAdicional;
    
    public Zona(int id, String nombreZona, int capacidad, int precioAudicional){
        this.id = 1;
        this.nombreZona = "Bogotá center";
        this.capacidad = 500;
        this.precioAdicional = 25000;
    }
    
    public int getId(){
        return id;
    }
    
    public String getNombreZona(){
        return nombreZona;
    }
    
    public int getCapacidad(){
        return capacidad;
    }
    
    public int getPrecioAdicional(){
        return precioAdicional;
    }

    @Override
    public String toString() {
        return "Zona{" + "id=" + id + ", nombreZona=" + nombreZona + ", capacidad=" + capacidad + ", precioAudicional=" + precioAdicional + '}';
    }
    
    
}
