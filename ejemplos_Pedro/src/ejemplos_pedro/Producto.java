package ejemplos_pedro;

/**
 *
 * @author Uniminuto Tibu
 */
public class Producto {
    private int id;
    private String nombre;
    private double precio;

    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setEdad(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return id + "," + nombre + "," + precio;
    }
    
    public static Producto fromString(String string) {
        String[] ListaNueva = string.split(",");
        return new Producto(Integer.parseInt(ListaNueva[1]), ListaNueva[2], (int) Double.parseDouble(ListaNueva[3]));
    }
}
