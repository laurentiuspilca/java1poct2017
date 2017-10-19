import java.util.*;

public class Exemplu22 {

    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(3,6,7,8,4,5,6);
        
        int sum = list.stream()
            //.peek(System.out::println)
            .filter(x -> x % 2 == 0)
            //.peek(System.out::println)
            .reduce(0, (a,b) -> a+b);
            
        System.out.println(sum);    
    }
}