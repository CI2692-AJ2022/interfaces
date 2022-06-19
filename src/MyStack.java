import java.util.Arrays;

public class MyStack implements MyStackInterface{

    private int[] stack;

    public MyStack() {
        this.stack = new int[0];
    }

    @Override
    public void push(int nuevoElemento) {
        // New array to keep the first elements and new added, the original is static
        int [] stackNuevo = new int[stack.length + 1];

        // The new element is added at beginning of array for LIFO property
        stackNuevo[0]=nuevoElemento;

        // Adding original elements to new stack
        System.arraycopy(stack, 0, stackNuevo, 1, stack.length);
        // Se reemplza el stack original
        stack = stackNuevo;
    }

    @Override
    public Integer pop() {
        // Verify if the stack is empty
        if(stack.length>0){
            // Select the last element added, because is first element out
            int lastElement = stack[0];
            // Replace the original stack
            stack = Arrays.copyOfRange(stack, 1, stack.length);
            return lastElement;
        }
        return null;
    }

    @Override
    public Integer peek() {
        // Verify if the stack is empty
        if(stack.length>0){
            // Show last element added
            return stack[0];
        }
        return null;
    }
}
