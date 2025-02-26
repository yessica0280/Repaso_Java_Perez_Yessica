package sistemaliga;

/**
 *
 * @author Uniminuto Tibu
 */
public class PartidoLiga extends Partido {
    int jornada;
    
    public PartidoLiga(String equipoLocal, String equipoVisitante, int cestasLocal, int cestasVisitantes, String fecha, int jornada){
        super(equipoLocal, equipoVisitante, cestasLocal, cestasVisitantes, fecha);
        this.jornada = jornada;
    }
    
    @Override
    public String obtenerResu(){
        return "Resultado: " + equipoLocal + " " + cestasLocal + "  " + equipoVisitante + " " + cestasVisitantes;
    }
    
    @Override
    public void registrarPuntosLOcal(){
        this.cestasLocal += puntos;
    }
    
    @Override
    public void registrarPuntosVisi(int puntos){
        this.cestasVisitantes += puntos;
    }
    
    @Override
    public String obtenerGanador(){
        if (cestasLocal > cestasVisitantes){
            return equipoLocal;
        }
        else if (cestasLocal < cestasVisitantes) {
            return equipoVisitante;
        }
        else {
            return "Empate";
        }
    }
}
