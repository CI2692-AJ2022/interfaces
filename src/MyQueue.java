import java.util.Arrays;


public class MyQueue implements MyQueueInterface<Integer> {

    private int[] queue;

    public MyQueue() {
        this.queue = new int[0];
    }

    public int size() {
        return queue.length;
    }

    @Override
    public void add(Integer item) {
        // New array to keep the first elements and new added, the original is static
        int[] newArray = new int[queue.length + 1];

        // The new element is added at ending of array for FIFO property
        newArray[queue.length] = item;

        // Adding original elements to new queue
        System.arraycopy(queue, 0, newArray, 0, queue.length);

        // Original queue is replaced
        queue = newArray;
    }




    @Override
    public Integer peek() {
        // Verify is queue is empty
        if(queue.length > 0) {
            // Show the first element added
            return queue[0];
        }
        return null;
    }

    @Override
    public Integer poll() {
        // Verify is queue is empty
        if(queue.length > 0) {
            // Select first element added, because is the first element out
            int valueToReturn = queue[0];
            // Replace original queue
            queue = Arrays.copyOfRange(queue, 1, queue.length);
            return valueToReturn;
        }
        return null;
    }
}
