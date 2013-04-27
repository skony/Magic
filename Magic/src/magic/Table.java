/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package magic;

/**
 *
 * @author piotrek
 */
public class Table {
    public Table(Player[] players){
        main_tab = players;
        players_number = players.length;
    }

    public int GetPlayersNumber(){
        return this.players_number;
    }
    public Player GetPlayerWhithIndex(int index){
        return main_tab[index];
    }
    private Player[] main_tab;
    private int players_number;

}
