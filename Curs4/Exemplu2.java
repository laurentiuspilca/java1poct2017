import java.util.*;
import java.util.stream.*;

public class Exemplu2 {
    public static void main(String [] args) {
        
        
        List<Curs> cursuri = Arrays.asList(
            new Curs(803, "OCA 7"),
            new Curs(808, "OCA 8"),
            new Curs(809, "OCP 8")
        );
        
        String rezultat = cursuri.stream()
                                 .filter(c -> c.nume.endsWith("8"))
                                 .map(c -> c.id + "")
                                 //.collect(Collectors.joining("1Z0-"));
                                  .reduce("", (a, b) -> a + "1Z0-" +b);
        
        System.out.println("rezultat = " + rezultat);
        
        String rezultat2 = cursuri.stream()
                                  .filter(c -> c.nume.endsWith("8"))
                                  .map(c -> "1Z0-" + c.id)
                                  .collect(Collectors.joining());
        
        System.out.println("rezultat2 = " + rezultat2);
        
        
        
        
        
        
        
        
        
        
        
    }
}