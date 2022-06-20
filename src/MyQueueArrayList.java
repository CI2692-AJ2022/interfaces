import java.util.ArrayList;

public class MyQueueArrayList implements MyQueueInterface{
    private ArrayList<Integer> queue = new ArrayList<Integer>();

    @Override
    public void add(int item) {
        queue.add(item);
    }

    @Override
    public Integer peek() {
        return queue.size() > 0 ? queue.get(0): null;
    }

    @Override
    public Integer poll() {
        return queue.size() > 0 ? queue.remove(0): null;
    }
}
