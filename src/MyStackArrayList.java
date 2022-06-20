import java.util.ArrayList;

public class MyStackArrayList implements MyStackInterface {

   private ArrayList<Integer> stackList;
   
   public MyStackArrayList(){
      this.stackList = new ArrayList<Integer>();
   }

   @Override
    public void push(int item) {
        stackList.add(0, item);
    }

    @Override
    public Integer pop() {
        if(stackList.size() > 0){
            int valueToReturn = stackList.get(0);
            stackList.remove(0);
            return valueToReturn;
        }
        return null;
    }

    @Override
    public Integer peek() {
        if(stackList.size() > 0){
            return stackList.get(0);
        }
        return null;
    }
}