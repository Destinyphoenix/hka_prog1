package Blatt_4.Aufgabe_2;

public class main {
    public static void main(String[] args) {
        PlayingField a = new PlayingField(3,3);
        System.out.println(a.getPlayingField().length);

        a.printPlayingField();

        a.setField(1,2,Status.X);
        a.printPlayingField();

    }

}
