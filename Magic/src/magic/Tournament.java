/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package magic;

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
    public Player[] void Start(){
        while(present_round < rounds){
            present_round++;

        }
    }
    private int rounds;
    private int present_round;
    private Table table;
}
