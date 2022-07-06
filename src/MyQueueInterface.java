public interface MyQueueInterface {
    public void add(Employee item);
    public Employee peek();
    public Employee poll();
    public int size();
}