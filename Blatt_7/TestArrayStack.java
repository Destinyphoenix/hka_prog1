package Blatt_7;

import Blatt_4.Aufgabe_2.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestArrayStack {

    @Test
    public void testIntPushAndPop() {
        ArrayStack<Integer> intStack = new ArrayStack();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);
        intStack.push(5);
        intStack.push(6);
        intStack.push(7);
        intStack.push(8);
        Assertions.assertEquals(8, intStack.pop());
        Assertions.assertEquals(7, intStack.pop());
        Assertions.assertEquals(6, intStack.pop());
        Assertions.assertEquals(5, intStack.pop());
        Assertions.assertEquals(4, intStack.pop());
        Assertions.assertEquals(3, intStack.pop());
        Assertions.assertEquals(2, intStack.pop());
        Assertions.assertEquals(1, intStack.pop());
        Assertions.assertNull(intStack.pop());
        intStack.push(9);
        Assertions.assertEquals(9, intStack.pop());
    }
}
