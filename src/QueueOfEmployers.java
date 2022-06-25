
import java.util.ArrayList;

public class QueueOfEmployers  {
    ArrayList<Jefe> queue = new ArrayList<Jefe>();

    
    public void add(Jefe item) {
        queue.add(item);
    }

    
    public Jefe poll() {
        if(queue.size() > 0) {
            Jefe element = queue.get(0);
            queue.remove(0);
            return element;
        } else {
            return null;
        }
    }
    
    
    public Jefe peek() {
        if(queue.size() > 0) {
            return queue.get(0);
        } else {
            return null;
        }
    }

}