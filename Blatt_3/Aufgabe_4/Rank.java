package Blatt_3.Aufgabe_4;

public enum Rank {
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("Bube"), //Bube
    QUEEN("Dame"), //Dame
    KING("König"),//König
    ACE("Ass"); // Ass

    public final String gName;

    private Rank(String gName) {
        this.gName = gName;
    }

    public static Rank fromInt(int RankNr){
        switch(RankNr){
            case 2: return TWO;
            case 3: return THREE;
            case 4: return FOUR;
            case 5: return FIVE;
            case 6: return SIX;
            case 7: return SEVEN;
            case 8: return EIGHT;
            case 9: return NINE;
            case 10: return TEN;
            case 11: return JACK;
            case 12: return QUEEN;
            case 13: return KING;
            case 14: return ACE;
            default: return null;
        }
    }
}

