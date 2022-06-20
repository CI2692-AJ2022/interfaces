import java.util.Arrays;

public class MyStack implements MyStackInterface{
    private int[] stack = new int[0];

    @Override
    public void push(int item) {
        int[] newStack = new int[stack.length + 1];
        newStack[0] = item;
        for (int i = 1; i < newStack.length; i++){
            newStack[i] = stack[i-1];
        }
        stack = newStack;
    }

    @Override
    public int pop() {
        if (stack.length > 0){
            int item = stack[0];
            stack = Arrays.copyOfRange(stack, 1, stack.length);
            return item;
        }
        return 0;
    }

    @Override
    public int peek() {
        return stack.length > 0 ? stack[0]: 0;
    }
}
