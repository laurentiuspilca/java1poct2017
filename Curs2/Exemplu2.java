import java.io.*;

public class Exemplu2 {

    public static void main(String [] args) {
        File file = new File("test1");
        
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}