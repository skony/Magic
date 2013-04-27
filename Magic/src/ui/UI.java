/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ui;
import java.util.Scanner;
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

}
