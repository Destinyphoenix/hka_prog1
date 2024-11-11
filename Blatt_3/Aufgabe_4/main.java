package Blatt_3.Aufgabe_4;

public class main
{

    public static void main(String[] args) {
        Suit test = Suit.Hearts;
        Suit test2 = Suit.fromInt(3);
        System.out.println(test);
        System.out.println(Suit.fromInt(2));

        Card card = new Card(2,5);
        System.out.println(card.name());

        for (int i=0; i<50;i++){
            System.out.println(Card.random().name());
        }
    }
}
