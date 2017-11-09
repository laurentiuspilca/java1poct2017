import java.util.concurrent.*;

public class Exemplu2 {

    public static void main(String [] args) {
        ExecutorService service = 
            Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors());
                
        try {
            
            while(true) { 
                Runnable r = () -> {
                    int a;
                    a = 3 + 4;
                };
                
                service.execute(r);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        
        service.shutdown();
    }
    
    
}