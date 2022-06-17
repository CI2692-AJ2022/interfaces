
public class Main {


    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        ArrayListStack myArrayListStack = new ArrayListStack();
        ArrayListQueue myArrayListQueue = new ArrayListQueue();

        System.out.println(myStack.peek());

        myStack.push(5);

        System.out.println(myStack.peek());

        myStack.push(2);

        System.out.println(myStack.peek());

        System.out.println(myStack.pop());

        System.out.println(myStack.peek());

        System.out.println("lllllllll");

        System.out.println(myArrayListStack.peek());

        myArrayListStack.push(5);

        System.out.println(myArrayListStack.peek());

        myArrayListStack.push(2);

        System.out.println(myArrayListStack.peek());

        System.out.println(myArrayListStack.pop());

        System.out.println(myArrayListStack.peek());
        
        System.out.println("lllllllll");


        System.out.println(myArrayListQueue.peek());

        myArrayListQueue.add(5);

        System.out.println(myArrayListQueue.peek());

        myArrayListQueue.add(2);

        System.out.println(myArrayListQueue.peek());

        System.out.println(myArrayListQueue.poll());

        System.out.println(myArrayListQueue.peek());

    }
}