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
        int n = table.GetPlayersNumber();
        Player[] pairs = new Player[n];
        int j = 0;
        if(present_round == 1){
            boolean[] used = new boolean[n];
            for(int i=0;i<n;i++)
                used[i] = false;
            int chosen = 0, shot;
            Random rand = new Random();
            while(chosen < n){
                shot = rand.nextInt(n);
                if(used[shot] == false){
                    pairs[j] = table.GetPlayerWhithIndex(shot);
                    used[shot] = true;
                    chosen++;
                    j++;
                }
            }
        }
        else{
            Player[] rank = table.CreateRank();
            for(int i=0;i<n;i++)
                for(int j=0;j<n;j++)
        }
        return pairs;
    }
    public void EnterScores(Player[] pairs, int[] scores){
        int n =pairs.length; int i = 0;
        while(true){
            table.AddMatch(pairs[i], pairs[i+1], scores[i], scores[i+1]);
            if(i+3 == n){
                table.AddBye(pairs[i+2]);
                break;
            }
            if(i+2 == n)
                break;
            i+=2;
        }
    }
    private int rounds;
    private int present_round;
    private Table table;
}
