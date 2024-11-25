package Blatt_4.Aufgabe_2;

import java.util.Arrays;
import java.util.List;

public class Player {
    private static int players = 1;
    private  int playerNumber;
    private Status playerSymbol;
    List<Status> symbols = Arrays.asList(Status.values());

    public Player () {
        if(players > symbols.size()-1) {
            System.out.println("too many players");
            return;
        }

       this.playerNumber = players;
       playerSymbol = symbols.get(players);
       players++;
    }

    public Status getPlayerSymbol() {
        return playerSymbol;
    }
    public int getPlayerNumber() {
        return playerNumber;
    }
    public static void resetPlayerCounter() {
        players = 1;
    }
}
