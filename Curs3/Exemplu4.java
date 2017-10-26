import java.util.*;
public class Exemplu4 {

    public static void main(String [] args) {
        List<String> list = Arrays.asList("Happy", "New", "Year!");
        
        int sum = list.stream()
                .mapToInt(s -> s.length())
                .sum();
        
        System.out.println(sum);
    }
}