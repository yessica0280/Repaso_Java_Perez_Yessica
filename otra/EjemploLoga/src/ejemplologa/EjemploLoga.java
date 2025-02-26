package ejemplologa;

/**
 *
 * @author Usuario
 */
public class EjemploLoga {
    public static void main(String[] args) {
         Partido p1 = new PartidoLiga("Equipo A", "Equipo F", 75, 55, "2025-03-16", 1);
         Partido p2 = new PartidoPlayOff("Equipo J", "Equipo B", 55, 45, "2025-03-16", "Octavos");
         
         System.out.println(p1.obtenerResu());
         System.out.println(p2.obtenerResu());
         System.out.println("");
         
         p1.puntosLocal(10);
         p1.puntosVisitantes(6);
         p2.puntosLocal(10);
         p2.puntosVisitantes(12);
         
         System.out.println(p1.obtenerResu());
         System.out.println(p2.obtenerResu());
         System.out.println("");
         
         System.out.println(p1.finalPartido());
         System.out.println(p2.finalpartido());
         p2.puntosLocal(20);
         System.out.println(p2.finalPartido);
         System.out.println("");
    }
    
}
