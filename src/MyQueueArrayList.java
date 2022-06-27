import java.util.ArrayList;

public class MyQueueArrayList implements MyQueueInterface{

    private ArrayList<Integer> queueList;

    public MyQueueArrayList() {
        this.queueList = new ArrayList<Integer>();
    }

    @Override
    public void add(int item) {
        queueList.add(item);
    }

    @Override
    public Integer peek() {
        if(queueList.size() > 0) {
            return queueList.get(0);
        }
        return null;
    }

    @Override
    public Integer poll() {
        if(queueList.size() > 0) {
            int valueToReturn = queueList.get(0);
            queueList.remove(0);
            return valueToReturn;
        }
        return null;
    }
}
