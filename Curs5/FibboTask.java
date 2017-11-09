import java.util.concurrent.*;

public class FibboTask extends RecursiveTask<Integer> {
    
    
    private Integer n;
    
    public FibboTask(Integer n) {
        this.n = n;
    }
    
    public Integer compute() {
        if (n <= 1) {
            return n;
        }
        
        FibboTask t1 = new FibboTask(n-1);
        FibboTask t2 = new FibboTask(n-2);
        
        t1.fork();
        
        return t2.compute() + t1.join();
    }
}