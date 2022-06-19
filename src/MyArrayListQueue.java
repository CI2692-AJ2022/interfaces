import java.util.ArrayList;

public class MyArrayListQueue implements MyQueueInterface {

    private final ArrayList<Integer> queueArrayList;

    public MyArrayListQueue(){
        this.queueArrayList = new ArrayList<>(0);
    }

    @Override
    public void add(int item) {
        // Using properties of ArrayList object, because it has dynamic size
        queueArrayList.add(item);
    }

    @Override
    public Integer peek() {
        // Verify is queue is empty
        if(queueArrayList.size() > 0) {
            // Show the first element added, for FIFO property
            return queueArrayList.get(0);
        }
        return null;
    }

    @Override
    public Integer poll() {
        // Verify is queue is empty
        if(queueArrayList.size() > 0) {
            // Select first element added, because is the first element out
            int valueToReturn = queueArrayList.get(0);
            // Delete the element, and replace the original
            queueArrayList.remove(0);
            return valueToReturn;
        }
        return null;
    }
}
