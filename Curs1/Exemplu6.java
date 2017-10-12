import java.io.*;

public class Exemplu6 {

    public static void main(String [] args) {
        Punct p1 = new Punct(3,4);
        
        try (
            FileOutputStream fos = new FileOutputStream("punct");
            ObjectOutputStream out = new ObjectOutputStream(fos)
        ) {
            out.writeObject(p1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}