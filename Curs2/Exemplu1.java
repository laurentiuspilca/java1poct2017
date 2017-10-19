import java.io.*;

public class Exemplu1 {

    public static void main(String [] args) {
        File file = new File("test1");
        
        if(file.exists()) {
            System.out.print("File exists");
        } else {
            System.out.print("File does not exist");
        }
    }
}