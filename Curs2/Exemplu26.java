import java.nio.file.*;
import java.io.*;

public class Exemplu26 {

    public static void main(String [] args) {
        Path p1 = Paths.get("./");
        
        try { 
            Files.find(p1, 10, (p, a) -> a.size() > 1000)
                .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}