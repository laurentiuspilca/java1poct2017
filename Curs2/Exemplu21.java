import java.util.*;
import java.util.stream.*;

public class Exemplu21 {

    public static void main(String [] args) {
        List<String> list = Arrays.asList("HELLO", "WORLD", "JOHN", "DOE");
        
        list.stream()
            .filter(x -> x.length() % 2 == 0)
            .map(x -> x.length())
            .map(x -> x*2)
            .forEach(System.out::println);
    }
}