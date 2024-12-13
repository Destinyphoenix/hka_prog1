package Blatt_6;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayStack<E> implements Stack<E> {

    private E[] elements;
    private int capacity = 1;
    private int size = 0;

    public ArrayStack() {
        elements = (E[]) new Object[capacity];
    }

    private void resize(int newCapacity) {
        elements = Arrays.copyOf(elements, newCapacity);
        capacity = newCapacity;
    }

    @Override
    public void push(E element) {}

    @Override
    public E pop() {
        return null;
    }

    @Override
    public E top() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
