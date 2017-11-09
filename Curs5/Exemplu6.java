import java.util.concurrent.*;

public class Exemplu6 {

    public static void main(String [] args) {
        FibboTask task = new FibboTask(6);
        
        ForkJoinPool pool = new ForkJoinPool();
        Integer rez = pool.invoke(task);
        
        System.out.println(rez);
    }
}