import java.util.ArrayList;

public class MyQueueArrayList implements MyQueueInterface<Employee>{
    private ArrayList<Employee> queue = new ArrayList<>();

    @Override
    public void add(Employee item) {
        queue.add(item);
    }

    @Override
    public Employee peek() {
        return queue.size() > 0 ? queue.get(0): null;
    }

    @Override
    public Employee poll() {
        return queue.size() > 0 ? queue.remove(0): null;
    }

    public int size() {
        return queue.size();
    }
}
