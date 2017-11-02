import java.util.*;
import java.util.stream.*;

public class Exemplu5 {
    public static void main(String [] args) {
        List<Angajat> angajati = Arrays.asList(
            new Angajat("Popescu", 4000, Functie.PROGRAMATOR),
            new Angajat("Ionescu", 5000, Functie.MANAGER),
            new Angajat("Radulescu", 3500, Functie.PROGRAMATOR),
            new Angajat("Georgescu", 3800, Functie.PROGRAMATOR)        
        );
        
        Map<Boolean, List<Angajat>> rezultat =
            angajati.stream()
                    .collect(Collectors.partitioningBy(
                                        a -> a.getSalariu() > 4000));
        rezultat.forEach((k, v) -> System.out.println(k + " = " + v));
    }
}