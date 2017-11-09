import java.util.concurrent.*;
import java.util.*;

public class ListAction extends RecursiveAction {

    private List<Integer> list;
    
    public ListAction(List<Integer> list) {
        this.list = list;
    }
    
    public void compute() {
        if (list.size() < 3) {
            for (Integer x : list) {
                System.out.println(x);
            }
            return;
        }
        
        int mid = list.size() / 2;
        
        ListAction a1 = new ListAction(list.subList(0, mid));
        ListAction a2 = new ListAction(list.subList(mid, list.size()));
        
        invokeAll(a1,a2);
    }
}