public interface MyQueueInterface<E> {
    public void add(int item);
    public Integer peek();
    public Integer poll();
}