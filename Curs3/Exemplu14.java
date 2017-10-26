import java.time.*;

public class Exemplu14 {

    public static void main(String [] args) {
        LocalDateTime ld1 = LocalDateTime.now();
        
        LocalDateTime ld2 = LocalDateTime.of(2017, 10, 12, 12, 33);
        LocalDateTime ld3 = LocalDateTime.of(2017, 10, 12, 12, 33, 30);
        
        LocalDate d1 = LocalDate.now();
        LocalTime t1 = LocalTime.now();
        
        LocalDateTime ld4 = LocalDateTime.of(d1, t1);
        
        System.out.println(ld1);
        System.out.println(ld2);
        System.out.println(ld3);
        System.out.println(ld4);
    }
}