import java.util.concurrent.*;

public class Exemplu3 {

    public static void main(String [] args) {
        ExecutorService service = Executors.newFixedThreadPool(4);
        
        Callable<Integer> task = () -> 5 + 3;
        
        Future<Integer> f = service.submit(task); // Runnable sau Callable
        
        // alte operatii
        
        try {
            Integer rez = f.get();
            System.out.println(rez);
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("A aparut o exceptie");
        }
    }
}