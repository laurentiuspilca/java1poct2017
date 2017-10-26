import java.time.*;

public class Exemplu15 {

    public static void main(String [] args) {
        ZoneId.getAvailableZoneIds()
        .stream()
        .filter(z -> z.contains("Europe"))
        .forEach(System.out::println);
    }
}