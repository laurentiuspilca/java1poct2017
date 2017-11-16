import javax.swing.*;
import java.awt.*;

public class Fereastra5 extends JFrame {

    private JButton[] b = new JButton[12];
    
    public Fereastra5() {
    
        setLayout(new GridLayout(3,4));
        
        for (int i=0; i<b.length; i++) {
            b[i] = new JButton(String.valueOf(i+1));
            add(b[i]);
        }
        
        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String [] args) {
        new Fereastra5();
    }
}