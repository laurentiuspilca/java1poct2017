import java.time.*;

public class Exemplu13 {

    public static void main(String [] args) {
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2017, 10 , 12);
        LocalDate d3 = LocalDate.of(2017, Month.OCTOBER, 12);
        
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}