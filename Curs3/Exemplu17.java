import java.time.*;

public class Exemplu17 {

    public static void main(String [] args) {
        Duration d1 = Duration.ofMinutes(10);
        
        Period p1 = Period.ofWeeks(3);
        
        System.out.println(d1);
        System.out.println(p1);
    }
}