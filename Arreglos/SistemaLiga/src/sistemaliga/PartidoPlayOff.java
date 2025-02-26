package sistemaliga;

/**
 *
 * @author Uniminuto Tibu
 */
public class PartidoPlayOff extends Partido{
    String ronda;
    
    public PartidoPlayOff(String equipoLocal, String equipoVisitante, int cestasLocal, int cestasVisitantes, String fecha, String ronda){
        super(equipoLocal, equipoVisitante, cestasLocal, cestasVisitantes, fecha);
        this.ronda = ronda;
    }
}
