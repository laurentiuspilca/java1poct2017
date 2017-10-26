import java.util.*;

public class Exemplu5 {

    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(3,5,6,8,9);
        
        list.stream()
            .map(x -> 2*x)
            .forEach(System.out::println);
    }
}