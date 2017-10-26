import java.util.*;

public class Exemplu18 {

    public static void main(String [] args) {
        Locale q1 = new Locale("en");
        Locale q2 = new Locale("en", "CA");
        Locale q3 = new Locale("fr", "CA");
        
        Locale q4 = new Locale.Builder()
            .setRegion("CA")
            .setLanguage("fr")
            .build();
            
        Locale q5 = Locale.GERMANY;    
    }
}