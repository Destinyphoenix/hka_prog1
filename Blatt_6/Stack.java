package Blatt_6;

/**
 * A First in Last out Stack of Elements of a to be declared type
 * @param <E> the type of elements stored in the stack
 */

public interface Stack<E> {
    public void push(E element);

    /**
     *
     * @return and remove top most {@code Element} of DeclaredType from the Stack
     * or if the Stack is empty {@code null}
     */
    public E pop();

    /**
     *
     * @return  top most {@code Element} of DeclaredType from the Stack
     * or if the stack is empty {@code null}
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
