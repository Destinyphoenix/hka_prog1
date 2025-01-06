package Blatt_8;

import java.math.BigInteger;

public class Fibonacci {

    public static int fibonacciIter(int n) {
        if (n <= 0) {
            return 0;
        }
        int f1 = 1;
        int f2 = 0;
        int f3 = 0;
        for (int i = 1; i <= n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }

    public static int fibonacciRec(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacciRec(n - 1) + fibonacciRec(n - 2);
    }
}
