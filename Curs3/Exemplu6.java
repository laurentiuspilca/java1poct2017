import java.util.stream.*;

public class Exemplu6 {

    public static void main(String [] args) {
        
        Stream<?> s1 = Stream.empty();
        
        Stream<Integer> s2 = Stream.of(2,4,6,7,8);
        
        Stream<Integer> s3 = Stream.iterate(1, i -> i + 1);
        
        Stream<Integer> s4 = Stream.generate(() -> 1);
    }
}