import java.util.stream.*;

public class Exemplu7 {

    public static void main(String [] args) {
        Stream.iterate(1, i -> i+2)
            .limit(10)
            .forEach(System.out::println);
    }
}