package Blatt_3.Aufgabe_4;

import java.util.Random;

public class Card {
    Suit suit;
    Rank rank;
    static Random randomGenerator;

    public Card(int suitNr, int rankNr) {
        suit = Suit.fromInt(suitNr);
        rank = Rank.fromInt(rankNr);
    }

    public String name(){
        return (Suit.fromSuitGerman(suit) +" "+ Rank.fromRankGerman(rank));

    }

    public static Card random(){
        randomGenerator = new Random();
        int rankNr = randomGenerator.nextInt(2, 14);
        int suitNr =randomGenerator.nextInt(1, 4);
        return new Card(suitNr ,rankNr);
    }
}
