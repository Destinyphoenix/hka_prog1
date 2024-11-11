package Blatt_3.Aufgabe_4;

import java.lang.reflect.Array;

public class CardGame {
    public static void main(String[] args) {
        Card[] cards = new Card[10];
        for (int i=0; i<10;i++){
            cards[i] = Card.random();
            System.out.println( i+1 + " "+ cards[i].name());
        }
    }
}
