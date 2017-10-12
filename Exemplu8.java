import java.io.*;

public class Exemplu8 {

    public static void main(String [] args) {
        try (
            FileOutputStream fos = new FileOutputStream("exemplu");
            ObjectOutputStream out = new ObjectOutputStream(fos)
        ) {
            C c1 = new C();
            out.writeObject(c1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}