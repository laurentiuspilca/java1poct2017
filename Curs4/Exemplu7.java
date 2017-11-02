public class Exemplu7 {
    public static void main(String [] args) {
        
        
        
        
        EvenNumbersThread t1 = new EvenNumbersThread();
        new Thread(t1).start();
        
    }
}