package Ejercicio7.EJ7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Uniminuto Tibu
 */
public class Game {
    private List<Enemy> enemis;
    private boolean endGame = false;
    
    public void init(){
        enemis = new ArrayList<>();
        enemis.add(new KnifeEnemy);
        enemis.add(new GunEnemy);
    }
    
    void run(){
        while (!endGame){
            for (Enemy enemy : enemis){
                enemy.doAction();
            }
            endGame = true;
        }
    }
    
    public static void {
        Game game = new Game();
        game.init();
        game.run();
    }
}
