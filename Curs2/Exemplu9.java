import java.nio.file.*;

public class Exemplu9 {

    public static void main(String [] args) {
        Path p1 = Paths.get("C:/A/B/C");
        Path p2 = Paths.get("C:/D/E/F");
        
        Path p3 = p1.resolve(p2);
        
        System.out.println(p3);
    }
}