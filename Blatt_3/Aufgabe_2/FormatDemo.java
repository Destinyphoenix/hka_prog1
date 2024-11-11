class FormatDemo {
    public static void main(String[] args) {
        System.out.println("Aufgabe b),c),d):");
        intFormatDemo(100);
        intFormatDemo(1023);
        intFormatDemo(0xFFF1234);
        intFormatDemo(-3);
        System.out.println();
        System.out.println("Aufgabe e),f),g):");
        doubleFormatDemo(2.5);
        doubleFormatDemo(3.141592653);
        doubleFormatDemo(1e12);
        doubleFormatDemo(-0.0001234);
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
        String Hexzahl = String.format("%02X", x);
        System.out.print("0x" + Hexzahl + "; ");

        //Als 32-stellige Binärzahl
        String Binzahl = Integer.toBinaryString(x);
        System.out.print("0b" + Binzahl + "; ");

        //Als Dezimalzahl in eckigen Klammern
        String Klammern = "[          ];";
        String Dezzahl = Integer.toString(x);
        StringBuilder SB = new StringBuilder(Klammern);
        SB.replace(1, Dezzahl.length(), Dezzahl);
        SB.replace(Klammern.length() - Dezzahl.length() - 1, Klammern.length() - 1, Dezzahl);
        String Dezzahl_in_Klammern = SB.toString();
        System.out.println(Dezzahl_in_Klammern);
    }

    static void doubleFormatDemo(double d) {
        //ohne Formatierung
        System.out.print(d + "; ");

        //Als Dezimalzahl
        String d_as_Dezzahl = String.format("%22.2f", d);
        System.out.print(d_as_Dezzahl + "; ");

        //Als Dezimalzahl in wissenschaftlicher Notation
        String d_as_scientific_Dezzahl = String.format("%22.2e", d);
        System.out.print(d_as_scientific_Dezzahl + "; ");

        //Als Hexzahl in wissenschaftlicher Notation
        String d_as_scientific_Hexzahl = String.format("%22.2a", d);
        System.out.println(d_as_scientific_Hexzahl + "; ");
    }
}