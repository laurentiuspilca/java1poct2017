import java.io.*;
import java.util.*;

public class Exemplu4 {

    public static void main(String [] args) {
        
        try (
            InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader cons = new BufferedReader(reader)
        ) {
            System.out.print("NR: ");
            int nr = Integer.parseInt(cons.readLine());
            
            System.out.print("FILE: ");
            String file = cons.readLine();
            
            Random r = new Random();
            
            try (PrintStream out = new PrintStream(file)) {
                for (int i=0;i<nr;i++) {
                    out.println(r.nextInt(1000));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}