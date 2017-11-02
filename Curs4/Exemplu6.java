public class Exemplu6 {
    public static void main(String [] args) {
        OddNumbersThread t1 = new OddNumbersThread();
        t1.start();
        
        
        
        OddNumbersThread t2 = new OddNumbersThread();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("s-a incheiat main()");
    }
}