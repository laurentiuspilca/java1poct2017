import java.nio.file.*;
import java.io.*;

public class Exemplu19 {

    public static void main(String [] args) {
        Path p1 = Paths.get("Exemplu19.java");
        try (BufferedReader in = Files.newBufferedReader(p1)) {
            String line = null;
            
            while ( (line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}