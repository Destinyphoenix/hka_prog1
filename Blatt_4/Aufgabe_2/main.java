package Blatt_4.Aufgabe_2;

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

    }

    public static void printPlayerTurn(PlayingField playingField, Player p, int x, int y){
        playingField.setField(x,y,p.getPlayerSymbol());
        playingField.printPlayingField();
    }

}
