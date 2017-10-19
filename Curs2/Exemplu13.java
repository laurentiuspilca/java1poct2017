import java.nio.file.*;

public class Exemplu13 {

    public static void main(String [] args) {
        Path p1 = Paths.get("A/B/C/../D/../././../E/R/F/././../T");
        
        Path p2 = p1.normalize();
        
        System.out.println(p2);
    }
}