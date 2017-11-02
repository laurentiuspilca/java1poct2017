public class EvenNumbersThread implements Runnable {
    public void run() {
        
        
        
        
        for(int i = 0; i < 30; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
}