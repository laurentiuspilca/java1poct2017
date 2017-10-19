import java.nio.file.*;
import java.io.*;

public class Exemplu18 {

    public static void main(String [] args) {
        Path p1 = Paths.get("bau");
        Path p2 = Paths.get("hau");
        
        try {
            boolean rez = Files.isSameFile(p1,p2);
            System.out.println(rez);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}