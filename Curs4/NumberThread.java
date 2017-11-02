public class NumberThread extends Thread {
    private static int x;
    
    
    
    
    public void run() {
        for(int i = 0; i < 10; i++) {
            synchronized(this) {
                x++;
                System.out.println("x = " + x);
            }
        }
    }
}