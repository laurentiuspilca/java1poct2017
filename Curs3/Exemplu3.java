public class Exemplu3 {

    public static void main(String [] args) {
        
        Predicat p1 = x -> true;
        
        Predicat p2 = x -> x % 2 == 0;
        
        Predicat p3 = x -> {
            System.out.println("Bau");
            return x % 2 == 0;
        };
        
        Predicat p4 = x -> testX(x);
        Predicat p5 = Exemplu3::testX;
        
        Predicat p6 = (x) -> true;
        Predicat p7 = (int x) -> true;
    }
    
    private static boolean testX(int x) {
        System.out.println("Bau");
        return x % 2 == 0;
    }
}