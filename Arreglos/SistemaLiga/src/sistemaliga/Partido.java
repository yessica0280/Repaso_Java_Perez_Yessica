package sistemaliga;

/**
 *
 * @author Uniminuto Tibu
 */
public class Partido {
    String equipoLocal;
    String equipoVisitante;
    int cestasLocal;
    int cestasVisitantes;
    String fecha;
    boolean finalizado;
    
    public Partido(String equipoLocal, String equipoVisitante, int cestasLocal, int cestasVisitantes, String fecha){
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.cestasLocal = cestasLocal;
        this.cestasVisitantes = cestasVisitantes;
        this.fecha = fecha;
        this.finalizado = false;
    }  
}
