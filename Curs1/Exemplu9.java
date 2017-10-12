import java.io.*;

public class Exemplu9 {

    public static void main(String [] args) {
        try (
            FileInputStream fis = new FileInputStream("exemplu");
            ObjectInputStream in = new ObjectInputStream(fis)
        ) {
            C c1 = (C) in.readObject();
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}