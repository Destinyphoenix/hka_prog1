package Blatt_4.Aufgabe_2;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        PlayingField playingField = new PlayingField(3,3);
        Player[] players = addPlayers(2);
        int turn = 0;

        playingField.printPlayingField();

        while(true){
            playerTurn(playingField, players[turn%2]);
            turn++;
        }
        //System.out.println("das Spiel hat "+ turn +" gedauert");
    }

    public static Player[] addPlayers(int playerQuantity){
        Player[] players = new Player[playerQuantity];
        for (int i = 0; i < playerQuantity; i++) {
                players[i] = new Player();
        }
        return players;
    }
    public static void playerTurn(PlayingField playingField ,Player p){
        Scanner scan  = new Scanner(System.in);
        int x;
        int y;
        System.out.println("Player "+p.getPlayerSymbol()+" :");
        System.out.println("insert x coordinate");
        x = scan.nextInt();
        System.out.println("insert y coordinate");
        y = scan.nextInt();

        printPlayerTurn(playingField ,p,x,y);
    }
    public static void printPlayerTurn(PlayingField playingField, Player p, int x, int y){
        if(!playingField.setField(x,y,p.getPlayerSymbol())){
            playerTurn(playingField, p);
        }
        playingField.printPlayingField();
    }


}
