// Stack implementation with arrayList


import java.util.ArrayList;

public class ArrayListStack implements MyStackInterface {
    ArrayList<Integer> stack = new ArrayList<Integer>();

    @Override
    public void push(int item) {
        stack.add(item);
    }

    @Override
    public Integer pop() {
        if(stack.size() > 0) {
            int element = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
            return element;
        } else {
            return null;
        }
    }
    
    @Override
    public Integer peek() {
        if(stack.size() > 0) {
            return stack.get(stack.size() - 1);
        } else {
            return null;
        }
    }

}
