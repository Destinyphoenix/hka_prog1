package Blatt_7;

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
        // Calculate percentage of capacity filled
        System.out.println("size: " + size + " cap" + capacity);
        float resultF = ((float) size / capacity) * 100;
        int result = (int) resultF;
        if ((float) size / capacity == 1) result = 100;
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
        if (size == 0) {
            return null;
        }
        size--;
        E value = elements[size];
        resizeIfNeeded();
        return value;
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
