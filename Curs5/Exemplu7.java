import java.util.concurrent.*;
import java.util.*;

public class Exemplu7 {

    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(4,7,3,2,6,7,4,9);
        
        ListAction listAction = new ListAction(list);
        
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(listAction);
        
    }
}