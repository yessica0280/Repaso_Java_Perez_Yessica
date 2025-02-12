package java_pyessica;

/**
 *
 * @author Uniminuto Tibu
 */
public class Ruta {
    int id;
    String trainer;
    String nombre;
    String modulo;
    int capacidad_maxima;
    
    public Ruta(int id, String trainer, String nombre){
        this.id = id;
        this.trainer = "Jholver";
        this.nombre = "Ruta NodeJS";
        this.modulo = "Fundamentos de programacion (introduccion a la algoritmia, Pseint, Python)";
        this.capacidad_maxima = 33;
    }
    
    public Ruta(int id, String trainer, String nombre, String modulo, int capacidad_maxima){
        this.id = id;
        this.trainer = trainer;
        this.nombre = nombre;
        this.modulo = modulo;
        this.capacidad_maxima = capacidad_maxima;
    }
    
    public int getid(){
        return id;
    }
    public String gettra(){
        return trainer;
    }
    public String getnom(){
        return nombre;
    }
    public String getmo(){
        return modulo;
    }
    public int getca(){
        return capacidad_maxima;
    }

    @Override
    public String toString() {
        return "Ruta{" + "id=" + id + ", trainer=" + trainer + ", nombre=" + nombre + ", modulo=" + modulo + ", capacidad_maxima=" + capacidad_maxima + '}';
    }
}
