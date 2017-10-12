import java.io.*;

public class Exemplu2 {

    public static void main(String [] args) {
        
        try (FileInputStream fis = new FileInputStream("Exemplu2.java");
        InputStreamReader reader = new InputStreamReader(fis);
        BufferedReader in = new BufferedReader(reader)) {
            
            String line;
            
            while ( (line = in.readLine()) != null) {
                System.out.println(line);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}