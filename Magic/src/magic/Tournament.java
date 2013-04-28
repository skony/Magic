/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package magic;
import java.util.Random;

/**
 *
 * @author piotrek
 */
public class Tournament {
    public Tournament(int rounds, Player[] players){
        this.rounds = rounds;
        table = new Table(players);
        present_round = 0;
    }
    public Player[]  ChoosePairs(){
        present_round++;
        Player[] pairs = new Player[table.GetPlayersNumber()];
        int j = 0;
        if(present_round == 1){
            boolean[] used = new boolean[table.GetPlayersNumber()];
            for(int i=0;i<used.length;i++)
                used[i] = false;
            int chosen = 0, shot;
            Random rand = new Random();
            while(chosen < used.length){
                shot = rand.nextInt(used.length);
                if(used[shot] == false){
                    pairs[j] = table.GetPlayerWhithIndex(shot);
                    used[shot] = true;
                    chosen++;
                    j++;
                }
            }
        }
        return pairs;
    }
    public void EnterScores(Player[] pairs, int[] scores){
        int n =pairs.length; int i = 0;
        while(true){
            table.AddMatch(pairs[i], pairs[i+1], scores[i], scores[i+1]);
            if(i+3 == n)
                table.AddBye(pairs[i+2]);
            if(i+2 == n)
                break;
            i+=2;
        }
    }
    private int rounds;
    private int present_round;
    private Table table;
}
