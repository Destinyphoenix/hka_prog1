package Blatt_8;

import java.math.BigInteger;

public class FibonacciBigIntegerCached {

    public static BigInteger fibonacciIter(int n) {
        if (n <= 0) {
            return BigInteger.valueOf(0);
        }
        BigInteger f1 = BigInteger.ONE;
        BigInteger f2 = BigInteger.ZERO;
        BigInteger f3 = BigInteger.ZERO;
        for (int i = 1; i <= n; i++) {
            f3 = f1.add(f2);
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }

    public static BigInteger fibonacciRec(int n) {
        BigInteger cache[] = new BigInteger[n];
        if (n <= 0) {
            return BigInteger.ZERO;
        }
        if (n == 1) {
            return BigInteger.ONE;
        }
        // only the reference to the array is getting transmitted, all changes to the array
        // are getting shared to all instances at the same timne
        return fibonacciRec(n - 1, cache).add(fibonacciRec(n - 2, cache));
    }

    public static BigInteger fibonacciRec(int n, BigInteger cache[]) {
        if (cache[n] != null) {
            return cache[n];
        }
        if (n <= 0) {
            return BigInteger.ZERO;
        }
        if (n == 1) {
            return BigInteger.ONE;
        }
        cache[n] = fibonacciRec(n - 1, cache).add(fibonacciRec(n - 2, cache));
        return cache[n];
    }

    public static void measureExecuteTimeFibonacciRec(int i) {
        long start = System.nanoTime();
        fibonacciRec(i);
        long end = System.nanoTime();
        long duration = end - start;
        double durationMs = duration / 1_000_000.0; // Convert to milliseconds

        // Truncate to 3 decimal places
        long truncatedDuration = (long) (durationMs * 1000);
        durationMs = truncatedDuration / 1000.0;

        System.out.println(
                "Fibonacci Cached Recursive time: "
                        + durationMs + " ms"
        );
    }
    public static void measureExecuteTimeFibonacciIter(int i) {
        long start = System.nanoTime();
        fibonacciIter(i);
        long end = System.nanoTime();
        long duration = end - start;
        double durationMs = duration / 1_000_000.0; // Convert to milliseconds

        // Truncate to 3 decimal places
        long truncatedDuration = (long) (durationMs * 1000);
        durationMs = truncatedDuration / 1000.0;

        System.out.println(
                "Fibonacci Iterative time: "
                        + durationMs + " ms"
        );
    }
}
