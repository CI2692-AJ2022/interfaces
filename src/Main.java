
public class Main {


    public static void main(String[] args) {
        MyQueue arrayQueue = new MyQueue();
        MyStack arrayStack = new MyStack();
        MyQueueArrayList arrayListQueue = new MyQueueArrayList();
        MyStackArrayList arrayListStack = new MyStackArrayList();
        
        for(int i = 1; i <= 10; i++){
            arrayQueue.add(i);
            arrayStack.push(i);
            arrayListQueue.add(i);
            arrayListStack.push(i);    
        }   
        
        for(int i = 0; i < 11; i++){
            System.out.println("CONSULTA " + i );
            System.out.println("");
            
            System.out.println("El elemento del principio de la cola como array es: " + arrayQueue.peek());
            System.out.println("El elemento que esta encima de la pila como array es: " + arrayStack.peek());
            System.out.println("El elemento del principio de la cola como arrayList es: " + arrayListQueue.peek());
            System.out.println("El elemento que esta encima de la pila como arrayList es: " + arrayListStack.peek());
            System.out.println("");
           
            System.out.println("ELIMINACION " + i);
            System.out.println("");
            
            System.out.println("El elemento eliminado de la cola como array es: " + arrayQueue.poll());
            System.out.println("El elemento eliminado de la pila como array es: " + arrayStack.pop());
            System.out.println("El elemento eliminado de la cola como arrayList es: " + arrayListQueue.poll());
            System.out.println("El elemento eliminado de la pila como arrayList es: " + arrayListStack.pop());
            System.out.println("");
           
            System.out.println("NUEVA CONSULTA " + i);
            System.out.println("");
           
            System.out.println("El nuevo elemento del principio de la cola como array es: " + arrayQueue.peek());
            System.out.println("El nuevo elemento que esta encima de la pila como array es: " + arrayStack.peek());
            System.out.println("El nuevo elemento del principio de la cola como arrayList es: " + arrayListQueue.peek());
            System.out.println("El nuevo elemento que esta encima de la pila como arrayList es: " + arrayListStack.peek());
            
            System.out.println("");            
        }
    }
}