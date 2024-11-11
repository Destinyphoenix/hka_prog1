package Blatt_3.Aufgabe_4;

public enum Suit{
    Clubs, //Kreuz
    Spades, //Pik
    Hearts, //Herz
    Diamonds; //Karo

    public static Suit fromInt(int suitNr){
        switch(suitNr){
            case 1: return Clubs;
            case 2: return Spades;
            case 3: return Hearts;
            case 4: return Diamonds;
            default: return null;
        }
    }
    public static String fromSuitGerman(Suit suit){
        switch(suit){
            case Clubs: return "Kreuz";
            case Spades: return "Pik";
            case Hearts: return "Herz";
            case Diamonds: return "Karo";
            default: return null;
        }

    }

}

