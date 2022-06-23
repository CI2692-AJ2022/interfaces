public interface MyQueueInterface<T> {
    public void add(T item);
    public T peek();
    public T poll();
}