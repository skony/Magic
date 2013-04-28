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
    public void AddMatch(Player A, Player B, int a, int b){
        //pierw dopisywanie punktow
        if(a==2 && b==0){
            A.AddToHistory(B, 3);
            B.AddToHistory(A, 0);
        }
        if(a==0 && b==2){
            A.AddToHistory(B, 0);
             B.AddToHistory(A, 3);}
        if(a==2 && b==1){  A.AddToHistory(B, 2); B.AddToHistory(A, 1);  }
        if(a==1 && b==2){  A.AddToHistory(B, 1); B.AddToHistory(A, 2); }
        if(a==1 && b==1){ A.AddToHistory(B, 1);
            B.AddToHistory(A, 1); }
        if(a==1 && b==0) { A.AddToHistory(B, 3);
            B.AddToHistory(A, 0);}
        if(a==0 && b==1) {A.AddToHistory(B, 0);
            B.AddToHistory(A, 3);}
        if(a==0 && b==0){ A.AddToHistory(B, 1);
            B.AddToHistory(A, 1);}
        //teraz aktualizowanie historii
    }
    public void AddBye(Player A){
        A.AddToHistory(null, 2);
    }
    private Player[] main_tab;
    private int players_number;

}
