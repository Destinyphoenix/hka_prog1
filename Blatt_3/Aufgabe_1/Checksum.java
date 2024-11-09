package Blatt_3.Aufgabe_1;

import java.util.Scanner;

class Checksum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        String hex;

        System.out.println("insert your number to calculate checksum: ");
        x = scan.nextInt();
        System.out.println("insert your hex-number to calculate checksum: ");
        hex = scan.next();
        System.out.println("the checksum of your number" + x + " is: " + checksum(x, 10));
        System.out.println("the checksum of your hex-number " + hex + " is: " + checksumHex(hex));
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
            x = x / base;
        }
        return sum;
    }
    public static String checksumHex(String hex) {
        // convert hex-string to integer
        int intHex = Integer.parseInt(hex, 16);
        return Integer.toHexString(checksum(intHex, 10));
    }
}