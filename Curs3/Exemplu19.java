import java.util.*;

public class Exemplu19 {

    public static void main(String [] args) {
        Locale locale = new Locale("ro", "RO");
        ResourceBundle bundle = ResourceBundle.getBundle("example", locale);
        
        String hello = bundle.getString("howAreYou");
        
        System.out.println(hello);
    }
}