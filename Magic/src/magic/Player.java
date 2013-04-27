/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package magic;

/**
 *
 * @author piotrek
 */
public class Player {

    public Player(String nick){
        this.nick = nick;
        points = 0;
    }

    public String GetNick(){
        return this.nick;
    }

    public int GetPoints(){
        return this.points;
    }
    public void AddPoints(int points){
        this.points += points;
    }

    private String nick;
    private int points;
}
