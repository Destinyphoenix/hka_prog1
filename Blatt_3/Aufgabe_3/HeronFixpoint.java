package Blatt_3.Aufgabe_3;

import java.util.Scanner;

class HeronFixpoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert your number: ");
        double userInput = scanner.nextDouble();
        heronFixpoint(userInput);
    }

    public static void heronFixpoint(double a) {
        double b = a;
        double c = 0.0;
        int n = 0;
        System.out.println("n" + "     " + "xn");

        while (c != b) {
            c = b;
            b = 0.5*(b + (a/b));
            n++;
            if(n < 10){
                System.out.println((n) + "     " + b);
            }
            else {
                System.out.println((n) + "    " + b);
            }
        }
    }
}