import java.util.*;
import java.util.stream.*;

public class Exemplu4 {
    public static void main(String [] args) {
        List<Angajat> angajati = Arrays.asList(
            new Angajat("Popescu", 4000, Functie.PROGRAMATOR),
            new Angajat("Ionescu", 5000, Functie.MANAGER),
            new Angajat("Radulescu", 3500, Functie.PROGRAMATOR),
            new Angajat("Georgescu", 3800, Functie.PROGRAMATOR)        
        );
        
        Map<Functie, List<Angajat>> rezultat = 
                angajati.stream()
                        .collect(Collectors.groupingBy(a -> a.getFunctie()));
        
        System.out.println(rezultat);
        rezultat.forEach((k, v) -> System.out.println(k + " = " + v));
        
        
        Map<Functie, Map<Double, List<Angajat>>> rezultat2 = 
                angajati.stream()
                        .collect(Collectors.groupingBy(a -> a.getFunctie(),
                                 Collectors.groupingBy(a -> a.getSalariu())));                                  
        
        
        
        
        
        
        
        
        
    }
}