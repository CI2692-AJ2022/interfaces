
public class Main {


    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        System.out.println(myStack.peek());

        myStack.push(4);

        System.out.println(myStack.peek());

        myStack.push(7);

        System.out.println(myStack.peek());

        System.out.println(myStack.pop());

        System.out.println(myStack.peek());
    }
}