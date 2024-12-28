package Blatt_8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFibonacci {

    @Test
    public void testIterativInt() {
        int[] fibonacciNumbers = {
            0, // 0
            1, // 1
            1, // 2
            2, // 3
            3, // 4
            5, // 5
            8, // 6
            13, // 7
            21, // 8
            34, // 9
            55, // 10
            89, // 11
            144, // 12
            233, // 13
            377, // 14
            610, // 15
            987, // 16
            1597, // 17
            2584, // 18
            4181, // 19
            6765, // 20
            10946, // 21
            17711, // 22
            28657, // 23
            46368, // 24
            75025, // 25
            121393, // 26
            196418, // 27
            317811, // 28
            514229, // 29
            832040, // 30
            1346269, // 31
            2178309, // 32
            3524578, // 33
            5702887, // 34
            9227465, // 35
            14930352, // 36
            24157817, // 37
            39088169, // 38
            63245986, // 39
            102334155, // 40
            165580141, // 41
            267914296, // 42
            433494437, // 43
            701408733, // 44
            1134903170, // 45
            1836311903, // 46
        };
        for (int i = 0; i < fibonacciNumbers.length; i++) {
            Assertions.assertEquals(
                fibonacciNumbers[i],
                Fibonacci.fibonacciIter(i)
            );
            System.out.println(i + ": " + Fibonacci.fibonacciIter(i));
        }
    }

    @Test
    public void testRecursiveInt() {
        int[] fibonacciNumbers = {
            0, // 0
            1, // 1
            1, // 2
            2, // 3
            3, // 4
            5, // 5
            8, // 6
            13, // 7
            21, // 8
            34, // 9
            55, // 10
            89, // 11
            144, // 12
            233, // 13
            377, // 14
            610, // 15
            987, // 16
            1597, // 17
            2584, // 18
            4181, // 19
            6765, // 20
            10946, // 21
            17711, // 22
            28657, // 23
            46368, // 24
            75025, // 25
            121393, // 26
            196418, // 27
            317811, // 28
            514229, // 29
            832040, // 30
            1346269, // 31
            2178309, // 32
            3524578, // 33
            5702887, // 34
            9227465, // 35
            14930352, // 36
            24157817, // 37
            39088169, // 38
            63245986, // 39
            102334155, // 40
            165580141, // 41
            267914296, // 42
            433494437, // 43
            701408733, // 44
            1134903170, // 45
            1836311903, // 46
        };
        for (int i = 0; i < fibonacciNumbers.length; i++) {
            Assertions.assertEquals(
                fibonacciNumbers[i],
                Fibonacci.fibonacciRec(i)
            );
            System.out.println(i + ": " + Fibonacci.fibonacciRec(i));
        }
    }
}
