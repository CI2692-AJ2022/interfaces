/* Interface indicates what functions are need to be implemented,
these functions are mandatory, but must be empty because they just show the
general behavior of the functions. The body is described in every class which
implement it
* */

public interface MyQueueInterface<T> {
    /**
     * Insert an element at Queue's Peek
     *
     * @param item Element to insert
     */
    void add(T item);

    /**
     * Remove the element at Queue's Peek.
     * Applying FIFO (First In First Out)
     *
     * @return Element deleted
     */
    public T peek();

    /**
     * Show the element at Stack's Peek
     *
     * @return First element added
     */
    public T poll();
}