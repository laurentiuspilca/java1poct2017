import java.util.concurrent.locks.*;

public class Exemplu11 {
    
    private static ReadWriteLock s = new ReentrantReadWriteLock();
    private static int x;

    public static void main(String [] args) {
        
    }
    
    public static void increment() {
        try {
            s.writeLock().lock();
            x++;
        } finally {
            s.writeLock().unlock();
        }
    }
    
    public static void afisare() {
        try {
            s.readLock().lock();
            System.out.println(x);
        } finally {
            s.readLock().unlock();
        }
    }
}