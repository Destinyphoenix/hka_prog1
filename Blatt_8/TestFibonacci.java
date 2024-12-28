package Blatt_8;

import java.math.BigInteger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFibonacci {

    private static int getFibonacciNumbersInt(int i) {
        int[] fibonacciNumbersInt = {
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
        return fibonacciNumbersInt[i];
    }

    private static BigInteger getFibonacciNumbersBigInt(int i) {
        BigInteger[] numbers = {
            BigInteger.valueOf(0), // 0
            BigInteger.valueOf(1), // 1
            BigInteger.valueOf(1), // 2
            BigInteger.valueOf(2), // 3
            BigInteger.valueOf(3), // 4
            BigInteger.valueOf(5), // 5
            BigInteger.valueOf(8), // 6
            BigInteger.valueOf(13), // 7
            BigInteger.valueOf(21), // 8
            BigInteger.valueOf(34), // 9
            BigInteger.valueOf(55), // 10
            BigInteger.valueOf(89), // 11
            BigInteger.valueOf(144), // 12
            BigInteger.valueOf(233), // 13
            BigInteger.valueOf(377), // 14
            BigInteger.valueOf(610), // 15
            BigInteger.valueOf(987), // 16
            BigInteger.valueOf(1597), // 17
            BigInteger.valueOf(2584), // 18
            BigInteger.valueOf(4181), // 19
            BigInteger.valueOf(6765), // 20
            BigInteger.valueOf(10946), // 21
            BigInteger.valueOf(17711), // 22
            BigInteger.valueOf(28657), // 23
            BigInteger.valueOf(46368), // 24
            BigInteger.valueOf(75025), // 25
            BigInteger.valueOf(121393), // 26
            BigInteger.valueOf(196418), // 27
            BigInteger.valueOf(317811), // 28
            BigInteger.valueOf(514229), // 29
            BigInteger.valueOf(832040), // 30
            BigInteger.valueOf(1346269), // 31
            BigInteger.valueOf(2178309), // 32
            BigInteger.valueOf(3524578), // 33
            BigInteger.valueOf(5702887), // 34
            BigInteger.valueOf(9227465), // 35
            BigInteger.valueOf(14930352), // 36
            BigInteger.valueOf(24157817), // 37
            BigInteger.valueOf(39088169), // 38
            BigInteger.valueOf(63245986), // 39
            BigInteger.valueOf(102334155), // 40
            BigInteger.valueOf(165580141), // 41
            BigInteger.valueOf(267914296), // 42
            BigInteger.valueOf(433494437), // 43
            BigInteger.valueOf(701408733), // 44
            BigInteger.valueOf(1134903170), // 45
            BigInteger.valueOf(1836311903), // 46
            BigInteger.valueOf(2971215073L), // 47
            BigInteger.valueOf(4807526976L), // 48
            BigInteger.valueOf(7778742049L), // 49
            BigInteger.valueOf(12586269025L), // 50
            BigInteger.valueOf(20365011074L), // 51
            BigInteger.valueOf(32951280099L), // 52
            BigInteger.valueOf(53316291173L), // 53
            BigInteger.valueOf(86267571272L), // 54
            BigInteger.valueOf(139583862445L), // 55
            BigInteger.valueOf(225851433717L), // 56
            BigInteger.valueOf(365435296162L), // 57
            BigInteger.valueOf(591286729879L), // 58
            BigInteger.valueOf(956722026041L), // 59
            BigInteger.valueOf(1548008755920L), // 60
            BigInteger.valueOf(2504730781961L), // 61
            BigInteger.valueOf(4052739537881L), // 62
            BigInteger.valueOf(6557470319842L), // 63
            BigInteger.valueOf(10610209857723L), // 64
            BigInteger.valueOf(17167680177565L), // 65
            BigInteger.valueOf(27777890035288L), // 66
            BigInteger.valueOf(44945570212853L), // 67
            BigInteger.valueOf(72723460248141L), // 68
            BigInteger.valueOf(117669030460994L), // 69
            BigInteger.valueOf(190392490709135L), // 70
            BigInteger.valueOf(308061521170129L), // 71
            BigInteger.valueOf(498454011879264L), // 72
            BigInteger.valueOf(806515533049393L), // 73
            BigInteger.valueOf(1304969544928657L), // 74
            BigInteger.valueOf(2111485077978050L), // 75
            BigInteger.valueOf(3416454622906707L), // 76
            BigInteger.valueOf(5527939700884757L), // 77
            BigInteger.valueOf(8944394323791464L), // 78
            BigInteger.valueOf(14472334024676221L), // 79
            BigInteger.valueOf(23416728348467685L), // 80
            BigInteger.valueOf(37889062373143906L), // 81
            BigInteger.valueOf(61305790721611591L), // 82
            BigInteger.valueOf(99194853094755497L), // 83
            new BigInteger("160500643816367088"), // 84
            new BigInteger("259695496911122585"), // 85
            new BigInteger("420196140727489673"), // 86
            new BigInteger("679891637638612258"), // 87
            new BigInteger("1100087778366101931"), // 88
            new BigInteger("1779979416004714189"), // 89
            new BigInteger("2880067194370816120"), // 90
            new BigInteger("4660046610375530309"), // 91
            new BigInteger("7540113804746346429"), // 92
            new BigInteger("12200160415121876738"), // 93
            new BigInteger("19740274219868223167"), // 94
            new BigInteger("31940434634990099905"), // 95
            new BigInteger("51680708854858323072"), // 96
            new BigInteger("83621143489848422977"), // 97
            new BigInteger("135301852344706746049"), // 98
            new BigInteger("218922995834555169026"), // 99
            new BigInteger("354224848179261915075"), // 100
        };

        return numbers[i];
    }

    @Test
    public void testIterativeInt() {
        for (int i = 0; i <= 46; i++) {
            Assertions.assertEquals(
                getFibonacciNumbersInt(i),
                Fibonacci.fibonacciIter(i)
            );
            //System.out.println(i + ": " + Fibonacci.fibonacciIter(i));
        }
    }

    @Test
    public void testRecursiveInt() {
        for (int i = 0; i <= 10; i++) {
            Assertions.assertEquals(
                getFibonacciNumbersInt(i),
                Fibonacci.fibonacciRec(i)
            );
            //System.out.println(i + ": " + Fibonacci.fibonacciRec(i));
        }
    }

    @Test
    public void testIterativeBigInt() {
        // tests the first 100 positions
        for (int i = 0; i <= 100; i++) {
            Assertions.assertEquals(
                getFibonacciNumbersBigInt(i),
                FibonacciBigInteger.fibonacciIter(i)
            );
            //System.out.println(i + ": " + FibonacciBigInteger.fibonacciIter(i));
        }
    }

    @Test
    public void testRecursiveBigInt() {
        for (int i = 0; i <= 10; i++) {
            Assertions.assertEquals(
                getFibonacciNumbersBigInt(i),
                FibonacciBigInteger.fibonacciRec(i)
            );
            //System.out.println(i + ": " + Fibonacci.fibonacciRec(i));
        }
    }
}
