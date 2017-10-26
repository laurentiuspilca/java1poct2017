import java.util.*;
import java.util.stream.*;

public class Exemplu9 {

    public static void main(String [] args) {
        //List<Integer> list = Arrays.asList(1,4,4,4,6,7,8,8,4,2,1);
        
        int sum = 
            //list.stream()
            Stream.of(1,4,4,4,6,7,8,8,4,2,1)
                .distinct()
                .mapToInt(x -> x)
                .sum();
       
        System.out.println(sum);
    }
}