import java.nio.file.*;

public class Exemplu6 {

    public static void main(String [] args) {
        Path p1 = Paths.get("A", "B", "C", "D");
        Path p2 = Paths.get("C:/A/B/C/D");
        
        for (int i = 0; i<p1.getNameCount();i++) {
            System.out.println(p1.getName(i));
        }
        
        System.out.println("==========================");
        
        for (int i = 0; i<p2.getNameCount();i++) {
            System.out.println(p2.getName(i));
        }
    }
}