import java.nio.file.*;
import java.io.*;

public class Exemplu25 {

    public static void main(String [] args) {
        Path p1 = Paths.get("./");
        try {
            long n = Files.walk(p1, 5) // Files.list(p1)
                .map(p -> p.toString())
                .filter(p -> p.endsWith(".java"))
                .count();
                
            System.out.println(n);    
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}