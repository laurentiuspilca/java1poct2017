import java.util.*;

public class Exemplu2 {

    public static void main(String [] args) {
        /*
        Comparator<String> c = new Comparator<String>() {
            public int compare(String a, String b) {
                return a.length() - b.length();
            }
        };
        */
       
        Set<String> set = new TreeSet<>((a,b) -> a.length() - b.length());
        
        set.add("z");
        set.add("aaa");
        set.add("bb");
        
        set.forEach(System.out::println);
    }
}