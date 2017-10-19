import java.nio.file.*;
import java.io.*;

public class Exemplu16 {

    public static void main(String [] args) {
        Path p1 = Paths.get("Exemplu16.java");
        Path p2 = Paths.get("copie.txt");
        
        try {
            Files.copy(p1,p2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}