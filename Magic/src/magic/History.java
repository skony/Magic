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
public class History {
    public History(int rounds){
        this.rounds = rounds;
        match_history = new ArrayList(rounds);
    }
    public AddRound(){

    }

    private ArrayList match_history ;
    private rounds;
}
