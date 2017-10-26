import java.util.*;

public class Exemplu10 {

    public static void main(String [] args) {
        List<String> list = Arrays.asList("Hello", "again");
        
        boolean b1 = list.stream().anyMatch(s -> s.length() % 2 == 0);
        boolean b2 = list.stream().noneMatch(s -> s.length() % 2 == 0);
        boolean b3 = list.stream().allMatch(s -> s.length() % 2 == 0);
        
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}