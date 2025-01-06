package Blatt_8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("input number for calculation");
        int userInput = scan.nextInt();
        if (userInput <= 46) {
            System.out.println("it: " + Fibonacci.fibonacciIter(userInput));
            System.out.println("rec: " + Fibonacci.fibonacciRec(userInput));
        } else {
            System.out.println(
                "it: " + FibonacciBigInteger.fibonacciIter(userInput)
            );
            System.out.println(
                "rec: " + FibonacciBigInteger.fibonacciRec(userInput)
            );
        }
    }
}
