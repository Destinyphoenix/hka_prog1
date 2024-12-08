package Blatt_6.test;

import Blatt_6.Aufgabe_2.FacultyFunction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class A2Test {
    @Test
    //unit test for the faculty calculation of the numbers 1-12
    public void testFaculty() {
        System.out.println("unit test for the faculty calculation of the numbers 1-12");
        System.out.println("...");
        int [] numbers = {1,2,3,4,5,6,7,8,9,10,11,12};
        BigInteger [] solutions = {BigInteger.valueOf(1),
                                   BigInteger.valueOf(2),
                                   BigInteger.valueOf(6),
                                   BigInteger.valueOf(24),
                                   BigInteger.valueOf(120),
                                   BigInteger.valueOf(720),
                                   BigInteger.valueOf(5040),
                                   BigInteger.valueOf(40320),
                                   BigInteger.valueOf(362880),
                                   BigInteger.valueOf(3628800),
                                   BigInteger.valueOf(39916800),
                                   BigInteger.valueOf(479001600),};

        for(int number : numbers){
            Assertions.assertEquals(solutions[number-1], FacultyFunction.calculateFaculty(number));
        }
        System.out.println("faculty calculation finished");
    }
}