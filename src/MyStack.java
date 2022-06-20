import java.util.Arrays;

public class MyStack implements MyStackInterface {

   private int[] stack;
   
   public MyStack(){
      this.stack = new int[0];
   }

   @Override
    public void push(int item) {
        int[] newArray = new int[stack.length + 1];
        newArray[0] = item;
        for(int i = 0; i < stack.length; i++) {
            newArray[i+1] = stack[i];
        }
        stack = newArray;
    }

    @Override
    public Integer pop() {
        if(stack.length > 0){
            int valueToReturn = stack[0];
            stack = Arrays.copyOfRange(stack, 1, stack.length);
            return valueToReturn;
        }
        return null;
    }

    @Override
    public Integer peek() {
        if(stack.length > 0){
            return stack[0];
        }
        return null;
    }
}