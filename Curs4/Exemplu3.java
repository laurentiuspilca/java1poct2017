import java.util.*;
import java.util.stream.*;

public class Exemplu3 {
    
    
    
    public static void main(String [] args) {
        List<Angajat> angajati = Arrays.asList(
            new Angajat("Popescu", 4000, Functie.PROGRAMATOR),
            new Angajat("Ionescu", 5000, Functie.MANAGER),
            new Angajat("Radulescu", 3500, Functie.PROGRAMATOR),
            new Angajat("Georgescu", 3800, Functie.PROGRAMATOR)        
        );
        
        double suma1 = angajati.stream()
                               .filter(a -> a.getFunctie() == Functie.PROGRAMATOR)
                               .map(a -> a.getSalariu())
                               .collect(Collectors.summingDouble(a -> a));
        System.out.println("suma1 = " + suma1);
        
        double suma2 = angajati.stream()
                               .filter(a -> a.getFunctie() == Functie.PROGRAMATOR)
                               .collect(Collectors.summingDouble(a -> a.getSalariu()));
        
        System.out.println("suma2 = " + suma2);
        
        double suma3 = angajati.stream()
                               .filter(a -> a.getFunctie() == Functie.PROGRAMATOR)
                               .map(a -> a.getSalariu())
                               .reduce(0.0, (a, b) -> a + b);
        System.out.println("suma3 = " + suma3);
        
        double suma4 = angajati.stream()
                               .filter(a -> a.getFunctie() == Functie.PROGRAMATOR)
                               .mapToDouble(a -> a.getSalariu())
                               .sum();
        System.out.println("suma4 = " + suma4);
        
        
        
        
        
        
        
    }
}