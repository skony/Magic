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
        //aktualizowanie historii
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
        
    }
    public void AddBye(Player A){
        A.AddToHistory(null, 3);
    }
    public Player[] CreateRank(){ // nie sprzwdzas czy sie nie powtarzaja przeciwnicy !!!
        int x=-1;
        Player[] rank = new Player[players_number];
        Player top = new Player(-1);
        boolean[] used = new boolean[players_number];
        for(int i=0;i<players_number;i++)
            used[i] = false;
        for(int i=0;i<players_number;i++){ top = new Player(-1);
            for(int j=0;j<players_number;j++){
              if(used[j] != true){
                if(main_tab[j].GetPoints() > top.GetPoints() ){ //jeśli gracz ma więcej pkt od gracza top
                    top = main_tab[j];
                    x=j;
                }
                else if(main_tab[j].GetPoints() == top.GetPoints()){ //jeśli gracz ma tyle samo pkt co gracz top zaczyna sie zabawa
                        if((main_tab[j].GetScoreWhithEnemy(top)==-1)||(main_tab[j].GetScoreWhithEnemy(top)==1 && top.GetScoreWhithEnemy(main_tab[j])==1)){
                            //jeśli ze sobą nie grali lub zagrali remis
                            if(main_tab[j].GetWins() > top.GetWins()){ // jeśli wygral wiecej od gracza top - ostatnie kryterium
                                top = main_tab[j];
                                x=j;
                            }
                            else{
                                Random rand = new Random();
                                if(rand.nextInt(2) == 1){
                                    top = main_tab[j];
                                    x=j;
                                }
                            }
                        }
                        else if(main_tab[j].GetScoreWhithEnemy(top)==3 || main_tab[j].GetScoreWhithEnemy(top)==2){
                            top = main_tab[j];
                            x=j;
                        }
                }
              }
            }
            rank[i] = top; used[x] = true;
        }
        return rank;
    }
    private Player[] main_tab;
    private int players_number;

}
