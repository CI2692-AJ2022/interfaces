import java.util.ArrayList;
public class MyQueueArrayList implements MyQueueArrayListInterface{

    private ArrayList<Employee> queuelist = new ArrayList<>();

    @Override
    public void add(Employee item) {
        queuelist.add(item);
    }

    @Override
    public Employee peek() {
        if(queuelist.size() > 0) {
            return queuelist.get(0);
        }
        return null;
    }

    @Override
    public Employee poll() {
        if(queuelist.size() > 0) {
            Employee valueToReturn = queuelist.get(0);
            queuelist.remove(0);
            return valueToReturn;
        }
        return null;
    }

    public int size() {
        return queuelist.size();
    }
}
