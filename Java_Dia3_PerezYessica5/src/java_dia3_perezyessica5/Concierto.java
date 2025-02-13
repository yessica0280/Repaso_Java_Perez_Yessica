package java_dia3_perezyessica5;

/**
 *
 * @author Uniminuto Tibu
 */
public class Concierto {
    int id;
    String nombre;
    String artista;
    String fecha;
    String lugar;
    int precioBase;
    
    public Concierto(int id, String nombre, String artista, String fecha, String lugar, int precioBase){
        this.id = 1;
        this.nombre = "Mega Concierto";
        this.artista = "Paulo Londra";
        this.fecha = "12-02-2025";
        this.lugar = "Estadio Nemesio Camacho El Campín";
        this.precioBase = 50000;
    }

    @Override
    public String toString() {
        return "Concierto{" + "id=" + id + ", nombre=" + nombre + ", artista=" + artista + ", fecha=" + fecha + ", lugar=" + lugar + ", precioBase=" + precioBase + '}';
    }
    
    
}
