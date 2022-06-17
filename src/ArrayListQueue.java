import java.util.ArrayList;

public class ArrayListQueue implements MyQueueInterface {
    ArrayList<Integer> queue = new ArrayList<Integer>();

    @Override
    public void add(int item) {
        queue.add(item);
    }

    @Override
    public Integer poll() {
        if(queue.size() > 0) {
            int element = queue.get(0);
            queue.remove(0);
            return element;
        } else {
            return null;
        }
    }
    
    @Override
    public Integer peek() {
        if(queue.size() > 0) {
            return queue.get(0);
        } else {
            return null;
        }
    }

}
