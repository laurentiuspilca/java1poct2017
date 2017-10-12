import java.io.*;

public class Exemplu7 {

    public static void main(String [] args) {
        try (
            FileInputStream fis = new FileInputStream("punct");
            ObjectInputStream in = new ObjectInputStream(fis)
        ) {
            Punct p = (Punct) in.readObject();
            System.out.println(p.x + " " + p.y);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}