/* Interface indicates what functions are need to be implemented,
these functions are mandatory, but must be empty because they just show the
general behavior of the functions. The body is described in every class which
implement it
*/

public interface MyStackInterface {
    /**
     * Insert an element at Stack's Peek
     * @param item Element to insert
     */
    public void push (int item);

    /**
     * Remove the element at Stack's Peek.
     * Applying LIFO (Last In First Out)
     * @return Element deleted
     */
    public Integer pop();

    /**
     * Show the element at Stack's Peek
     * @return Last element added
     */
    public Integer peek();
}