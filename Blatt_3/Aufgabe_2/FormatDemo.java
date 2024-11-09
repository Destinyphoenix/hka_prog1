class FormatDemo {
    public static void main(String[] args) {
        intFormatDemo(100);
        intFormatDemo(1023);
        intFormatDemo(0xFFF1234);
        intFormatDemo(-3);
    }

    static void intFormatDemo(int x) {
        //ohne Formatierung
        System.out.print(x + "; ");

        //Als Dezimalzahl
        double Dezimalzahl = x;
        if (Dezimalzahl > 0) {
            System.out.print("+" + Dezimalzahl + "; ");
        }
        else {
            System.out.print(Dezimalzahl + "; ");
        }

        //Als 8-stellige Hexadezimalzahl
        String Hexzahl = Integer.toHexString(x);
        Hexzahl = Hexzahl.toUpperCase();
        System.out.print("0x" + Hexzahl + "; ");

        //Als 32-stellige Binärzahl
        String Binzahl = Integer.toBinaryString(x);
        System.out.print("0b" + Binzahl + "; ");

        //Als Dezimalzahl in eckigen Klammern
        String Klammern = "[          ]";
        String Dezzahl = Integer.toString(x);
        StringBuilder SB = new StringBuilder(Klammern);
        SB.replace(1, Dezzahl.length(), Dezzahl);
        SB.replace(Klammern.length() - Dezzahl.length(), Klammern.length(), Dezzahl);
        String Dezzahl_in_Klammern = SB.toString();
        System.out.println(Dezzahl_in_Klammern);
    }

    static void doubleFormatDemo(double d) {

    }
}