/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ui;
import java.util.Scanner;
//import System.out.println;
import magic.Player;

/**
 *
 * @author piotrek
 */
public  class UI {
    public static Player[] GetPlayers(){
        System.out.println("Podaj ilosc graczy");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Player[] players = new Player[n];
        System.out.println("Wpisz nazwy graczy");
        for(int i=0; i<n; i++)
            players[i] = new Player(sc.nextLine());
        return players;
    }
    public static int GetRounds(){
        System.out.println("Podaj liczbe rund");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }
    public static void PrintPairs(Player[] players){
        int n = players.length;
        int i = 0;
        while(true){
            System.out.println("**************");
            System.out.println(players[i].GetName());
            i++;
            System.out.println(players[i].GetName());
            System.out.println("**************");
            if(i+2 == n){
                System.out.println(players[i+1].GetName() + " ma bye");
                System.out.println("**************");
                break;
            }
            if(i+1 == n)
                break;
            i++;
        }
    }

}
