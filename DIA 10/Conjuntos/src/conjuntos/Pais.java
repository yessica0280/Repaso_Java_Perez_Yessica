package conjuntos;

/**
 *
 * @author Uniminuto Tibu
 */
public enum Pais {
    // Enumerador 
    // Un enumerador es una clase especial que restringe la creación de objetos
    // a los valores especificamente definidor en su implementación.
    ESPANA("España", "Madrid"),
    FRANCIA("Francía", "París"),
    ITALIA("Italia", "Roma"),
    ALEMANIA("Alemania", "Berlín"),
    REINO_UNIDO("Reíno Unido", "Londres");
    
    private String nombre;
    private String capital;
    
    private Pais (String nombre, String capital){
        this.nombre = nombre;
        this.capital = capital;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getCapital(){
        return capital;
    }
}
