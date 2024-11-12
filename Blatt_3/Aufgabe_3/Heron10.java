package Blatt_3.Aufgabe_3;

import java.util.Scanner;

class Heron10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert your number: ");
        double userInput = scanner.nextDouble();
        heron10(userInput);
    }

    public static void heron10(double a) {
        double b = a;
        System.out.println("n" + "     " + "xn");

        for(int i = 0; i < 10; i++){
            b = 0.5*(b + (a/b));
            if(i < 9){
                System.out.println((i+1) + "     " + b);
            }
            else {
                System.out.println((i + 1) + "    " + b);
            }
        }
    }
}