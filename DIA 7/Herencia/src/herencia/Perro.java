package herencia;

/**
 *
 * @author Uniminuto Tibu
 */
public class Perro extends Animal {
    // Atributos
    private String raza;
    private int edad;
    private String sexo;
    
    public Perro(){}
    
    public Perro(String nombreCientifico){
        super(nombreCientifico);
    }
    
    public Perro(String nombreCientifico, String especie, String habitat, boolean tienePelo, int cantPatas){
        super(nombreCientifico, especie, habitat, tienePelo, cantPatas);
    }
    
    public Perro(String raza, int edad, String sexo){
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    public Perro(String raza, int edad, String sexo, String nombreCientifico, String especie, String habitat, boolean tienePelo, int cantPatas){
        super(nombreCientifico, especie, habitat, tienePelo, cantPatas);
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
    }

    @Override // Anotaciones: Solo afectan a las líneas siguientes a el hasta que cierre.
    public void hacerSonido(){
        System.out.println("El perro " + nombreCientifico + " dice ¡guauuu!");
    }
    
    public void moverCola(){
        System.out.println("El perrito " + nombreCientifico + " mueve la colita");
    }
}
