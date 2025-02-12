package java_pyessica;

/**
 *
 * @author Uniminuto Tibu
 */
public class Trainer {
    int id;
    String nombre;
    String ruta;
    String horario;
    
    public Trainer (int id, String nombre){
        this.id = id;
        this.nombre = "Johlver";
        this.ruta = "Ruta NodeJS";
        this.horario = "6am a 10am";
    }
    
    public Trainer (int id, String nombre, String ruta, String horario){
        this.id = id;
        this.nombre = nombre;
        this.ruta = ruta;
        this.horario = horario;
    }
    
    public int getid() {
        return id;
    }

    @Override
    public String toString() {
        return "Trainer{" + "id=" + id + ", nombre=" + nombre + ", ruta=" + ruta + ", horario=" + horario + '}';
    }
    public String getnom(){
        return nombre;
    }
    public String getru(){
        return ruta;
    }
    public String getho(){
        return horario;
    }
}
