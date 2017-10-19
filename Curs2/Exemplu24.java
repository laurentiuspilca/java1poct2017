import java.nio.file.*;
import java.io.*;

public class Exemplu24 {

    public static void main(String [] args) {
        Path p1 = Paths.get("Exemplu24.java");
        
        try {
             Files.lines(p1)
             .filter(s -> s.length() % 2 == 0)
             .filter(s -> !s.trim().isEmpty())
             .map(s -> new StringBuilder(s).reverse())
             .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}