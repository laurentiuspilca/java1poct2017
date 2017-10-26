public class Exemplu1 {

    public static void main(String [] args) {
        
        Consumator c1 = new MyConsumer();
        c1.consuma(10);
        
        Consumator c2 = new Consumator() {
            
            @Override
            public void consuma(int x) {
                System.out.println(x);
            } 
            
        };
        c2.consuma(15);
        
        Consumator c3 = x -> System.out.println(x);
        c3.consuma(20);
        
        Consumator c4 = System.out::println;
        c4.consuma(20);
    }
    
    private static class MyConsumer implements Consumator {
        
        @Override
        public void consuma(int x) {
            System.out.println(x);
        }
    }
}