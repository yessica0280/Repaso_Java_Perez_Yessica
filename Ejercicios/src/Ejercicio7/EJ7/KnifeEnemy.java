package Ejercicio7.EJ7;

/**
 *
 * @author Uniminuto Tibu
 */
public class KnifeEnemy {
    public void doActionStab(){
        System.out.println("Apañalando.");
    }
    
    @Override
    public void doAction(){
        doActionStab();
    }
}
