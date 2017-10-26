import java.time.*;

public class Exemplu12 {

    public static void main(String [] args) {
        LocalTime t1 = LocalTime.now();
        
        LocalTime t2 = LocalTime.of(10, 30);
        
        LocalTime t3 = LocalTime.of(10, 30, 50);
        
        LocalTime t4 = LocalTime.of(10, 40, 50, 100);
        
        System.out.println(t1); // 20:42:30.12345
        System.out.println(t2); // 10:30
        System.out.println(t3); // 10:30:50
        System.out.println(t4); // 10:40:50.00000000100
        
        if (t1.isAfter(t2)) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
        
        LocalTime rez = t1.plusMinutes(5);
        System.out.println(rez);
    }
}