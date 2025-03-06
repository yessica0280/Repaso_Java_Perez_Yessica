package Ejercicio7.EJ7;

/**
 *
 * @author Uniminuto Tibu
 */
public class GunEnemy implements Enemy{
    public void doActionShoot(){
        System.out.println("Disparar.");
    }
    
    @Override
    public void doAction(){
        doActionShoot();
    }
}
