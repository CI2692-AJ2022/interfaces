import java.util.ArrayList;


public class MyArrayListStack implements MyStackInterface {

    private final ArrayList<Integer> stackArrayList;

    public MyArrayListStack(){
        this.stackArrayList = new ArrayList<>(0);
    }


    @Override
    public void push(int item) {
        // Using properties of ArrayList object, because it has dynamic size
        stackArrayList.add(item);
    }

    @Override
    public Integer pop() {
        // Verify if the stack is empty
        if(stackArrayList.size()>0){
            // Select the last element added, because is first element out
            int lastElement = stackArrayList.get(stackArrayList.size()-1);
            // Replace the original stack
            stackArrayList.remove(stackArrayList.size()-1);
            return lastElement;
        }
        return null;
    }

    @Override
    public Integer peek() {
        // Verify is queue is empty
        if(stackArrayList.size() > 0) {
            // Show the last element added, for LIFO property
            return stackArrayList.get(stackArrayList.size()-1);
        }
        return null;
    }
}
