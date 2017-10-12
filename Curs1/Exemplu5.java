import java.io.*;

public class Exemplu5 {

    public static void main(String [] args) {
        try (
            InputStreamReader readerCons = new InputStreamReader(System.in);
            BufferedReader cons = new BufferedReader(readerCons)
        ) {
            System.out.print("FILE: ");
            String adresa = cons.readLine();
            
            try (
                FileInputStream fis = new FileInputStream(adresa);
                InputStreamReader readerFile = new InputStreamReader(fis);
                BufferedReader in = new BufferedReader(readerFile);
            ) {
                String nr;
                int suma = 0;
                while ( (nr = in.readLine()) != null ) {
                    suma += Integer.parseInt(nr);
                }
                System.out.println("SUMA: " + suma);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}