
import java.util.ArrayList;

public class QueueOfEmployers  {
    ArrayList<Employer> queue = new ArrayList<Employer>();

    
    public void add(Employer item) {
        queue.add(item);
    }

    
    public Employer poll() {
        if(queue.size() > 0) {
            Employer element = queue.get(0);
            queue.remove(0);
            return element;
        } else {
            return null;
        }
    }
    
    
    public Employer peek() {
        if(queue.size() > 0) {
            return queue.get(0);
        } else {
            return null;
        }
    }

}