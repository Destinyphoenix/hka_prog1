package Blatt_3.Aufgabe_1;

import java.util.Scanner;

class Checksum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInputInt;
        String userInputHex;

        System.out.println("insert your number to calculate checksum: ");
        userInputInt = scan.nextInt();
        System.out.println("insert your hex-number to calculate checksum: ");
        userInputHex = scan.next();
        System.out.println("the checksum of your number " + userInputInt + " is: " + checksum(userInputInt, 10));
        System.out.println("the checksum of your hex-number " + userInputHex + " is: " + checksumHex(userInputHex).toUpperCase());
    }

    public static int checksum(int x, int base) {
        int sum = 0;
        // if x > 0, calculate checksum
        while (x > 0) {
            // get last character
            int lastChar = x % base;
            // add character to sum
            sum += lastChar;
            // remove last character
            x /= base;
        }
        return sum;
    }
    public static String checksumHex(String hex) {
        // convert hex-string to integer
        int intHex = Integer.parseInt(hex, 16);
        return Integer.toHexString(checksum(intHex, 10));
    }
}