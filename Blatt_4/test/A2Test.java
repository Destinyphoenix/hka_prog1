package Blatt_4.Aufgabe_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static Blatt_4.Aufgabe_2.main.*;

public class A2Test {

    public Player[] players;

    public A2Test() {
        Player.resetPlayerCounter();
        players = addPlayers(2);
    }
    @Test
    public void testGameStalemate(){
        PlayingField playingField = new PlayingField(3,3);
        int[] inputs = {
                1, 1,
                0, 0,
                0, 1,
                2, 1,
                2, 0,
                0, 2,
                1, 2,
                1, 0,
                2, 2
        };
        playGame(playingField, inputs, players);
    }



    @Test
    public void testGameXWin(){
        PlayingField playingField = new PlayingField(3,3);

        int[] inputs = {
               1,1,
               0,0,
               1,2,
               0,2,
               1,0
        };
        playGame(playingField, inputs, players);
    }
    @Test
    public void testGameOWin(){
        PlayingField playingField = new PlayingField(3,3);

        int[] inputs = {
                0,0,
                1,1,
                0,1,
                0,2,
                1,0,
                2,0
        };
        playGame(playingField, inputs, players);
    }
    private void playGame(PlayingField playingField, int[] inputs, Player[] players) {
        int j = 0;
        for (int i = 0; i < inputs.length-1; i+=2) {
            printPlayerTurn(playingField , players[j%2],inputs[i],inputs[i+1]);
            j++;
        }
        Assertions.assertTrue(playingField.isGameOver());
    }
}
