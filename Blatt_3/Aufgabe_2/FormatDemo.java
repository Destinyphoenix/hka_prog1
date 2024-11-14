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
        String signed_decimal = String.format("%+.2f", x*1.0 );
        System.out.print(signed_decimal + "; ");

        //Als 8-stellige Hexadezimalzahl
        String eight_hexnumber = String.format("%8X", x);
        System.out.print("0x" + eight_hexnumber + "; ");

        //Als 32-stellige Binärzahl
        String binnumber = Integer.toBinaryString(x);
        String binnumber_formatiert = String.format("%32s", binnumber).replace(" ", "0");
        System.out.print("0b" + binnumber_formatiert + "; ");

        //Als Dezimalzahl in eckigen Klammern
        String decimal_in_brackets = String.format("%-5s%5s", x, x);
        System.out.println("[" + decimal_in_brackets + "]");
    }

    static void doubleFormatDemo(double d) {
        //ohne Formatierung
        System.out.print(d + "; ");

        //Als Dezimalzahl
        String d_with_two_decimals = String.format("%25.2f", d);
        System.out.print(d_with_two_decimals + "; ");

        //Als Dezimalzahl in wissenschaftlicher Notation
        String d_as_scientific_decimal = String.format("%25.2e", d);
        System.out.print(d_as_scientific_decimal + "; ");

        //Als Hexzahl in wissenschaftlicher Notation
        String d_as_scientific_hexnumber = String.format("%25.2a", d);
        System.out.println(d_as_scientific_hexnumber + "; ");
    }
}