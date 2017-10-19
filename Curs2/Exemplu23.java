import java.util.*;

public class Exemplu23 {

    public static void main(String [] args) {
        List<String> list = Arrays.asList("ALA", "BALA", "PORTOCALA");
        
        list.stream()
            .map(s -> new StringBuilder(s).reverse())
            .forEach(System.out::println);
    }
}