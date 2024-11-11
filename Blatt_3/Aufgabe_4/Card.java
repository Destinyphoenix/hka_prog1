package Blatt_3.Aufgabe_4;

import java.util.Random;

public class Card {
    Suit suit;
    Rank rank;

    public Card(int suitNr, int rankNr) {
        suit = Suit.fromInt(suitNr);
        rank = Rank.fromInt(rankNr);
    }

    public String name(){
        return (suit +" "+ rank);
    }
    public static Card random(){
        Random random = new Random();

        int rankNr = random.nextInt(2, 14);
        int suitNr =random.nextInt(1, 4);
        return new Card(suitNr ,rankNr);
    }
}
