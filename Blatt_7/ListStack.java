package Blatt_7;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Consumer;

public class ListStack<E> implements Stack<E>, Iterable<E> {

    private LinkedList<E> elements;

    public ListStack() {
        elements = new LinkedList<>();
    }

    @Override
    public Iterator<E> iterator() {
        return elements.iterator();
    }

    @Override
    public void push(E element) {
        elements.addFirst(element);
    }

    @Override
    public E pop() {
        if (isEmpty()) return null;
        return elements.removeFirst();
    }

    @Override
    public E top() {
        if (isEmpty()) return null;
        return elements.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public int size() {
        return elements.size();
    }
}
