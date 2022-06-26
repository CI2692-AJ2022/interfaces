import java.util.Arrays;

public class MyStack implements MyStackInterface{

    private int[] stack;

    public MyStack() {
        this.stack = new int[0];
    }

    @Override
    public void push(int item) {
        int[] newArray = new int[stack.length + 1];
        newArray[stack.length] = item;
        for(int i = 0; i < stack.length; i++) {
            newArray[i] = stack[i];
        }
        stack = newArray;
    }

    @Override
    public Integer peek() {
        if(stack.length > 0) {
            return stack[stack.length - 1];
        }
        return null;
    }

    @Override
    public Integer pop() {
        if(stack.length > 0) {
            int valueToReturn = stack[stack.length - 1];
            stack = Arrays.copyOfRange(stack, 0, stack.length - 1);
            return valueToReturn;
        }
        return null;
    }
}
