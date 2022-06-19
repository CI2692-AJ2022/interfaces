
public class Main {

    public static void main(String[] args) {

        // Testing queues
        System.out.println("\n ---QUEUES USING ARRAY---");
        MyQueue queue = new MyQueue();
        queue.add(2);
        queue.add(3);
        queue.add(7);

        System.out.println("\n Last Element in Queue"+ " " + queue.peek());
        System.out.println("Delete last element");
        queue.poll();
        System.out.println("\n Last Element in Queue"+ " " + queue.peek());
        System.out.println("Delete last element");
        queue.poll();
        System.out.println("\n Last Element in Queue"+ " " + queue.peek());
        System.out.println("Delete last element");
        queue.poll();
        // Queue must be empty
        System.out.println("\n Last Element in Queue"+ " " + queue.peek());
        System.out.println("Delete last element");
        queue.poll();


        System.out.println("\n ---QUEUE USING ARRAY LIST---");
        MyArrayListQueue queueList = new MyArrayListQueue();
        queueList.add(2);
        queueList.add(3);
        queueList.add(7);
        System.out.println("\n Last Element in Queue" + " " + queueList.peek());
        System.out.println("Delete last element");
        queueList.poll();
        System.out.println("\n Last Element in Queue" + " " + queueList.peek());
        System.out.println("Delete last element");
        queueList.poll();
        System.out.println("\n Last Element in Queue" + " " + queueList.peek());
        System.out.println("Delete last element");
        queueList.poll();
        // Queue must be empty
        System.out.println("\n Last Element in Queue" + " " + queueList.peek());
        System.out.println("Delete last element");
        queueList.poll();

        // Testing Stack


        System.out.println("\n ---STACK USING ARRAYS---");
        MyStack stack = new MyStack();
        stack.push(2);
        stack.push(3);
        stack.push(7);

        System.out.println("\n Last Element in Stack" + " " + stack.peek());
        System.out.println("Delete last element");
        stack.pop();
        System.out.println("\n Last Element in Stack" + " " + stack.peek());
        System.out.println("Delete last element");
        stack.pop();
        System.out.println("\n Last Element in Stack" + " " + stack.peek());
        System.out.println("Delete last element");
        stack.pop();
        // Stack must be empty
        System.out.println("\n Last Element in Stack" + " " + stack.peek());
        System.out.println("Delete last element");
        stack.pop();


        System.out.println("\n ---STACK USING ARRAY LIST---");
        MyArrayListStack stackList = new MyArrayListStack();
        stackList.push(2);
        stackList.push(3);
        stackList.push(7);

        System.out.println("\n Last Element in Stack" +  " " + stackList.peek());
        System.out.println("Delete last element");
        stackList.pop();
        System.out.println("\n Last Element in Stack" +  " " + stackList.peek());
        System.out.println("Delete last element");
        stackList.pop();
        System.out.println("\n Last Element in Stack" +  " " + stackList.peek());
        System.out.println("Delete last element");
        stackList.pop();
        // Stack must be empty
        System.out.println("\n Last Element in Stack" +  " " + stackList.peek());
        System.out.println("Delete last element");
        stackList.pop();


    }
}