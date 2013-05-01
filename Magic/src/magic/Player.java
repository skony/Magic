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
        wins = 0;
        history = new ArrayList();
        bye = false;
    }
    public Player(int fake_points){
        points = fake_points;
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
        if(score == 2 || score == 3)
            ++wins;
        history.add(new Match(enemy, score));
        if(enemy == null)
            bye = true;
    }
    public int GetScoreWhithEnemy(Player E){
        for(int i=0;i<history.size();i++){
            Match match = (Match)history.get(i);
            if(match.GetEnemyInMatch() == E)
                return match.GetScoreInMatch();
        }
        return -1;
    }
    public int GetWins(){
        return wins;
    }
    public boolean CheckBye(){
        return bye;
    }

    private String nick;
    private int points;
    private int wins;
    private ArrayList history;
    private boolean bye;
}
