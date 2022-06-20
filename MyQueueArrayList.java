import java.util.ArrayList;
public class MyQueueArrayList implements MyQueueArrayListInterface{

    private ArrayList<Integer> queuelist;

    @Override
    public void add(Integer item) {
        queuelist.add(item);
    }

    @Override
    public Integer peek() {
        if(queuelist.size() > 0) {
            return queuelist.get(0);
        }
        return null;
    }

    @Override
    public Integer poll() {
        if(queuelist.size() > 0) {
            Integer valueToReturn = queuelist.get(0);
            queuelist.remove(0);
            return valueToReturn;
        }
        return null;
    }
}
