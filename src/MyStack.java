// Stack implementation with a normal array

public class MyStack implements MyStackInterface {
    private int[] stack = new int[0];

    @Override
    public void push(int item) {
        int[] newStack = new int[stack.length + 1];

        for(int i = 0; i < stack.length; i++){
            newStack[i] = stack[i];
        }

        newStack[stack.length] = item;
        stack = newStack;
    }

    @Override
    public Integer pop() {
        if(stack.length > 0) {
            int numberEliminated = stack[stack.length - 1];
            int[] newArray = new int[stack.length - 1];

            for(int i = 0; i < stack.length - 1; i++){
                newArray[i] = stack[i];
            }

            stack = newArray;
            return numberEliminated;
        } else {
            return null;
        }
    }
    
    @Override
    public Integer peek() {
        if(stack.length > 0) {
            return stack[stack.length - 1];
        } else {
            return null;
        }
    }


}
