import java.util.ArrayList;


/**
 * Class to use a generic ArrayList Queue for employee data and
 * implement the interface of Queue.
 */
public class MyArrayListQueue implements MyQueueInterface<Employee> {

    // Initialization
    private final ArrayList<Employee> queueArrayList;

    // Constructor
    public MyArrayListQueue(){
        this.queueArrayList = new ArrayList<>(0);
    }

    // Method to return the actual size of queue
    public int size(){
        return queueArrayList.size();
    }


    @Override
    public void add(Employee item) {
        // Using properties of ArrayList object, because it has dynamic size
        queueArrayList.add( item);
    }

    @Override
    public Employee peek() {
        // Verify is queue is empty
        if(queueArrayList.size() > 0) {
            // Show the first element added, for FIFO property
            return queueArrayList.get(0);
        }
        return null;
    }

    @Override
    public Employee poll() {
        // Verify is queue is empty
        if(queueArrayList.size() > 0) {
            // Select first element added, because is the first element out
            Employee valueToReturn = queueArrayList.get(0);
            // Delete the element, and replace the original
            queueArrayList.remove(0);
            return valueToReturn;
        }
        return null;
    }

}
