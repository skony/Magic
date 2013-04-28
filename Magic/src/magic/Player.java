/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package magic;
import java.util.ArrayList;

/**
 *
 * @author piotrek
 */
public class Player {

    public Player(String nick){
        this.nick = nick;
        points = 0;
        history = new ArrayList();
    }

    public String GetName(){
        return this.nick;
    }

    public int GetPoints(){
        return this.points;
    }
    public void AddPoints(int points){
        this.points += points;
    }
    public void AddToHistory(Player enemy, int score){
        points += score;
        history.add(new Match(enemy, score));
    }

    private String nick;
    private int points;
    private ArrayList history;
}
