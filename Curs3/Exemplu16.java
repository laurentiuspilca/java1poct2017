import java.time.*;

public class Exemplu16 {

    public static void main(String [] args) {
        ZonedDateTime zdt1 = ZonedDateTime.now();
        
        LocalTime t1 = LocalTime.of(10,30);
        LocalDate d1 = LocalDate.of(2017, 10, 20);
        LocalDateTime ld1 = LocalDateTime.of(d1,t1);
        
        ZoneId z = ZoneId.of("Europe/London");
        ZonedDateTime zdt2 = ZonedDateTime.of(ld1, z);
        
        ZonedDateTime zdt3 = ZonedDateTime.now(z);
        
        System.out.println(zdt1);
        System.out.println(zdt2);
        System.out.println(zdt3);
    }
}