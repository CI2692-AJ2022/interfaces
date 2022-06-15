public interface MyQueueInterface<E> {
    public boolean add(E item);
    public E peek();
    public E poll();
}