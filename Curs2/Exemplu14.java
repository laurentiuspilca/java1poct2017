import java.nio.file.*;
import java.io.*;

public class Exemplu14 {

    public static void main(String [] args) {
        Path p1 = Paths.get("C:/A/B/C/D/E/F");
        
        Path p2 = p1.subpath(1,4);
        
        System.out.println(p2);
        
        File file = p1.toFile();
        
        System.out.println(file);
    }
}