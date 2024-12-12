package Blatt_6;

/**
 * A First in Last out Stack of Elements of a to be declared type
 * @param <E> the type of elements stored in the stack
 */

public interface Stack<E> {
    public void push(E element);

    /**
     *
     * @return and remove top most Element of DeclaredType from the Stack
     */
    public E pop();

    /**
     *
     * @return top most Element of DeclaredType from the Stack
     */
    public E top();

    /**
     * checks if the Stack is empty
     * @return {@code true} if the stack contains no elements, {@code false} otherwise.
     */
    public boolean isEmpty();

    /**
     *
     * @return int value of current stack size
     */
    public int size();
}
