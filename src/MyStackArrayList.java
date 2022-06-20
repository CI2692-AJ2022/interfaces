import java.util.ArrayList;

public class MyStackArrayList implements MyStackInterface{
    private ArrayList<Integer> stack = new ArrayList<>();

    @Override
    public void push(int item) {
        stack.add(item);
    }

    @Override
    public int pop() {
        return stack.size() > 0? stack.remove(stack.size() - 1): 0;
    }

    @Override
    public int peek() {
        return stack.size() > 0? stack.get(stack.size() - 1): 0;
    }
}
