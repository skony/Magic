/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package magic;

/**
 *
 * @author piotrek
 */
public class Match {
    public Match(Player enemy, int score){
        this.enemy = enemy;
        this.score = score;
    }
    public Player GetEnemyInMatch(){
        return enemy;
    }
    public int GetScoreInMatch(){
        return score;
    }
    private Player enemy;
    private int score;

}
