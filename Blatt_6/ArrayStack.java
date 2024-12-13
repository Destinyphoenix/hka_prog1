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

    public int checkConsumedCapacity() {
        //result in % filled

        float resultF = (float) size / capacity * 10;
        int result = (int) resultF;
        if (size / capacity == 1) result = 100;
        System.out.println(result + "%");
        return result;
    }

    @Override
    public void push(E element) {
        size++;
        resizeIfNeeded();
        elements[size - 1] = element;
    }

    private void resizeIfNeeded() {
        if (capacity < size) {
            resize(capacity * 2);
            return;
        }
        if (checkConsumedCapacity() <= 40) {
            resize(capacity / 2);
            return;
        }
    }

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
