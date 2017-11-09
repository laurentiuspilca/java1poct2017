import java.util.concurrent.*;

public class Exemplu4 {

    public static void main(String [] args) {
        ExecutorService service = Executors.newFixedThreadPool(4);
        
        Runnable r = () -> System.out.println("HELLO");
        
        Future<?> f = service.submit(r);
        
        try {
            f.get();
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("A aparut o exceptie");
        }
    }
}