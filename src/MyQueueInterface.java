/* Interface indicates what functions are need to be implemented,
these functions are mandatory, but must be empty because they just show the
general behavior of the functions. The body is described in every class which
implement it
* */

public interface MyQueueInterface {
    /**
     * Insert an element at Queue's Peek
     * @param item Element to insert
     */
    public void add(int item);

    /**
     * Remove the element at Queue's Peek.
     * Applying FIFO (First In First Out)
     * @return Element deleted
     */
    public Integer peek();

    /**
     * Show the element at Stack's Peek
     * @return First element added
     */
    public Integer poll();
}