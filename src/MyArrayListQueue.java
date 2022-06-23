import java.util.ArrayList;

/**
 * Class to use a generic ArrayList Queue for every Type of data and
 * implement the interface of Queue.
 *
 * @param <T> Type of data to keep in queue
 */
public class MyArrayListQueue<T> implements MyQueueInterface {

    // Initialization
    private final ArrayList<T> queueArrayList;

    // Constructor
    public MyArrayListQueue(){
        this.queueArrayList = new ArrayList<>(0);
    }

    // Method to return the actual size of queue
    public int size(){
        return queueArrayList.size();
    }


    @Override
    public void add(Object item) {
        // Using properties of ArrayList object, because it has dynamic size
        queueArrayList.add((T) item);
    }

    @Override
    public T peek() {
        // Verify is queue is empty
        if(queueArrayList.size() > 0) {
            // Show the first element added, for FIFO property
            return queueArrayList.get(0);
        }
        return null;
    }

    @Override
    public T poll() {
        // Verify is queue is empty
        if(queueArrayList.size() > 0) {
            // Select first element added, because is the first element out
            T valueToReturn = queueArrayList.get(0);
            // Delete the element, and replace the original
            queueArrayList.remove(0);
            return valueToReturn;
        }
        return null;
    }

}
