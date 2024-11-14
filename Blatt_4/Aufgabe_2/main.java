package Blatt_4.Aufgabe_2;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        PlayingField playingField = new PlayingField(3,3);
        /*System.out.println(playingField.getPlayingField().length);

        playingField.printPlayingField();

        playingField.setField(1,2,Status.X);
        playingField.printPlayingField();
*/
        Player x = new Player();
        System.out.println(x.getPlayerSymbol());

        Player y = new Player();
        System.out.println(y.getPlayerSymbol());

        Player z = new Player();
        printPlayerTurn(playingField ,x,1,0);
        printPlayerTurn(playingField ,y,2,0);
        playerTurn(playingField,x);

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
