import java.util.ArrayList;
public class MyStackArrayList implements MyStackArrayListInterface{

    private ArrayList<Integer> stacklist;

    @Override
    public void push(Integer item) {
        stacklist.add(item);
    }

    @Override
    public Integer peek() {
        if(stacklist.size() > 0) {
            return stacklist.get(stacklist.size()-1);
        }
        return null;
    }

    @Override
    public Integer pop() {
        if(stacklist.size() > 0) {
            Integer valueToReturn = stacklist.get(stacklist.size()-1);
            stacklist.remove(stacklist.size()-1);
            return valueToReturn;
        }
        return null;
    }
}
