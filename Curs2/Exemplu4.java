import java.io.*;

public class Exemplu4 {

    public static void main(String [] args) {
        try (InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader cons = new BufferedReader(isr)) {
        
           while(true) {
               System.out.print("Comanda:");
               String cmd = cons.readLine();
               String cuv[] = cmd.split("\\s+");
               
               switch (cuv[0]) {
                   case "exit": System.exit(0);
                   
                   case "cf": {
                       File f = new File(cuv[1]);
                       f.createNewFile();
                       System.out.println("Fisierul a fost creat!");
                   }break;
                   
                   case "cd": {
                       File f = new File(cuv[1]);
                       f.mkdir();
                       System.out.println("Folderul a fost creat!");
                   }break;
                   
                   case "list": {
                       File f = new File(cuv[1]);
                       String [] fileNames = f.list();
                       for (String n : fileNames) {
                           System.out.println(n);
                       }
                   }break;
                   
                   case "delete": {
                       File f = new File(cuv[1]);
                       f.delete();
                       System.out.println("Fisierul a fost sters!");
                   }break;
               }
           }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}