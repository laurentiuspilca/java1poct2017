import java.util.concurrent.*;

public class Exemplu10 {
    
    private static Semaphore s = new Semaphore(1);
    private static int x;

    public static void main(String [] args) {
        
    }
    
    public static void increment() {
        try {
            s.acquire();
            x++;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            s.release();
        }
    }
    
    public static void afisare() {
        try {
            s.acquire();
            System.out.println(x);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            s.release();
        }
    }
}