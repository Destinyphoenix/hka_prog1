package Blatt_8;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 10;

        for (int i = 1; i <= n; i++) {
            System.out.println(fibonacciIter(i));
        }
    }

    public static int fibonacciIter(int n) {
        if (n <= 0) {
            return 0;
        }
        int f1 = 0;
        int f2 = 1;
        int f3 = 0;
        for (int i = 1; i <= n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }

    public int fibonacciRec(int n) {
        return 0;
    }
}
