import java.util.*;

public class Exemplu8 {

    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        
        list.parallelStream()
            // pot avea operatii intermediare
            .forEachOrdered(System.out::println);
    }
}