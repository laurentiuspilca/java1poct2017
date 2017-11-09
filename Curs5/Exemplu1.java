import java.util.concurrent.*;

public class Exemplu1 {

    public static void main(String [] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        
        Runnable r1 = () -> System.out.println(Thread.currentThread().getName() + " Hello World!");
        
        System.out.println("Main " + Thread.currentThread().getName());
        service.execute(r1);
        
        service.shutdown();
    }
}