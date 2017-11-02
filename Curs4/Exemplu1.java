import java.util.*;
import java.util.function.*;
import java.util.stream.*;




public class Exemplu1 {
    public static void main(String [] args) {
        List<String> lista = Arrays.asList("My", "name", "is", "Alice");
        String rezultat = lista.stream()
                               .filter(a -> a.length() % 2 == 0)
                               .collect(Collectors.joining(" "));
        System.out.println("rezultat = " + rezultat);
    }
}