import java.nio.file.*;
import java.io.*;

public class Exemplu15 {

    public static void main(String [] args) {
        Path p1 = Paths.get("myFile");
        Path p2 = Paths.get("MyDir");
        
        try {
            Files.createFile(p1);
            Files.createDirectory(p2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}