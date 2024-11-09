package Blatt_3.Aufgabe_4;

public enum Rank {
    Two,
    Three,
    Four,
    Five,
    Six,
    Seven,
    Eight,
    Nine,
    Ten,
    Jack,
    Queen,
    King,
    Ace;

    public static Rank fromInt(int RankNr){
        switch(RankNr){
            case 2: return Two;
            case 3: return Three;
            case 4: return Four;
            case 5: return Five;
            case 6: return Six;
            case 7: return Seven;
            case 8: return Eight;
            case 9: return Nine;
            case 10: return Ten;
            case 11: return Jack;
            case 12: return Queen;
            case 13: return King;
            case 14: return Ace;
            default: return null;
        }
    }
}

