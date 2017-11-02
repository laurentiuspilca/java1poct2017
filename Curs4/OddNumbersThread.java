public class OddNumbersThread extends Thread {
    public void run() {
        for(int i = 1; i < 30; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }        
    }
}