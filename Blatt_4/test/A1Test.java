package Blatt_4.Aufgabe_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

public class A1Test {
    @Test
    public void testEqual() {
        Complex complexAdd = new Complex(3,4);
        Complex complexAdd2 = new Complex(1,-2);
        Complex expectedValueAdd = new Complex(4,2);

        Complex add = complexAdd.add(complexAdd2);
        Assertions.assertTrue(add.equals(expectedValueAdd));
    }
    @Test
    public void testAddition() {
        Complex complexAdd = new Complex(3,4);
        Complex complexAdd2 = new Complex(1,-2);
        Complex expectedValueAdd = new Complex(4,2);

        Complex add = complexAdd.add(complexAdd2);
        Assertions.assertTrue(add.equals(expectedValueAdd));
    }
    @Test
    public void testSubstraction() {
        Complex complexSub = new Complex(5,6);
        Complex complexSub2 = new Complex(2,3);
        Complex expectedValueSub = new Complex(3,3);

        Complex sub = complexSub.sub(complexSub2);
        Assertions.assertTrue(sub.equals(expectedValueSub));
    }
    @Test
    public void testMultiplication() {
        Complex complexMul = new Complex(2,3);
        Complex complexMul2 = new Complex(4,-1);
        Complex expectedValueMul = new Complex(11,10);

        Complex mul = complexMul.mul(complexMul2);
        Assertions.assertTrue(mul.equals(expectedValueMul));
    }
    @Test public void testDivision() {
        Complex complexDiv = new Complex(6,8);
        Complex complexDiv2 = new Complex(3,4);
        Complex expectedValueDiv = new Complex(2,0);

        Complex div = complexDiv.div(complexDiv2);
        Assertions.assertTrue(div.equals(expectedValueDiv));
    }
    @Test
    public void testPow() {
        Complex complexMuli2 = new Complex(0,1);
        Complex expectedValueMuli2 = new Complex(-1,0);

        Complex muli2 = complexMuli2.mul(complexMuli2);
        Assertions.assertTrue(muli2.equals(expectedValueMuli2));
        };
    }


