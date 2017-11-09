import java.util.*;

public class Exemplu9 {
    
    public static void main(String [] args) {
        List<Integer> valute = Arrays.asList(4, 8, 4, 8, 13);
        
        valute.parallelStream()
            .map(e -> convert(e))
            .forEach(System.out::println);
            
             
    }
    
    private static Integer convert(Integer eur) {
        try { Thread.sleep(1000);} catch(Exception e) {e.printStackTrace();}
        return eur * 5;
    }
}