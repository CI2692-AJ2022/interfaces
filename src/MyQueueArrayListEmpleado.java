import java.util.ArrayList;

public class MyQueueArrayListEmpleado {

    private ArrayList<Empleado> queueList;

    public MyQueueArrayListEmpleado() {
        this.queueList = new ArrayList<Empleado>();
    }

    public void add(Empleado item) {
        queueList.add(item);
    }

    public Empleado peek() {
        if(queueList.size() > 0) {
            return queueList.get(0);
        }
        return null;
    }
    
    public Empleado poll() {
        if(queueList.size() > 0) {
            Empleado valueToReturn = queueList.get(0);
            queueList.remove(0);
            return valueToReturn;
        }
        return null;
    }
    
    public int sizeOfQueue() {
        return queueList.size();
    }
}
