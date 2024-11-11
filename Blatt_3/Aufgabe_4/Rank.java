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
    Jack, //Bube
    Queen, //Dame
    King,//König
    Ace; // Ass

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
    public static String fromRankGerman(Rank rank){
        switch(rank){
            case Two: return "2";
            case Three: return "3";
            case Four: return "4";
            case Five: return "5";
            case Six: return "6";
            case Seven: return "7";
            case Eight: return "8";
            case Nine: return "9";
            case Ten: return "10";
            case Jack: return "Bube";
            case Queen: return "Dame";
            case King: return  "König";
            case Ace: return "Ass";

            default: return null;
        }
    }
}

