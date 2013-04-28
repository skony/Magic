/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package magic;
import ui.UI;

/**
 *
 * @author piotrek
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Player[] players = UI.GetPlayers();
        int rounds = UI.GetRounds();
        Tournament tournament = new Tournament(rounds, players);
        while(true){
        Player[] pairs = tournament.ChoosePairs();
        UI.PrintPairs(pairs);
        tournament.EnterScores(pairs, UI.EnterScores(pairs));}
    }

}
