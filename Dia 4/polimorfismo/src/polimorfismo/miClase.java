package polimorfismo;

/**
 *
 * @author Uniminuto Tibu
 */
public class miClase {
    private int tipo;
        public void setTipo(int t){
            tipo = t;
        }
    public int getTipo(){
        return tipo;
    }
}

class accesoIndirecto{
    public static void main(String[] args){
        miClase mc = new miClase();
        mc.setTipo(5);
        System.out.println("El tipo es: " + mc.getTipo());
    }
}
