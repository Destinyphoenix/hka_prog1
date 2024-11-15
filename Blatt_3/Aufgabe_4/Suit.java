package Blatt_3.Aufgabe_4;

public enum Suit{
    CLUBS("Kreuz"), //Kreuz
    SPADES("Pik"), //Pik
    HEARTS("Herz"), //Herz
    DIAMONDS("Karo"); //Karo
    public final String gName;

    Suit(String value) {
        this.gName = value;
    }

    public static Suit fromInt(int suitNr){
        switch(suitNr){
            case 1: return CLUBS;
            case 2: return SPADES;
            case 3: return HEARTS;
            case 4: return DIAMONDS;
            default: return null;
        }
    }
}

