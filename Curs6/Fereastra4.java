import javax.swing.*;
import java.awt.*;

public class Fereastra4 extends JFrame {
    
    private JPanel p1, p2;
    
    private JButton b1;
    private JButton b2;
    private JButton b3;
    
    public Fereastra4() {
     
        p1 = new JPanel();
        p2 = new JPanel();
        b1 = new JButton("Rosu");
        b2 = new JButton("Verde");
        b3 = new JButton("Albastru");
        
        add(p2);
        add(p1, BorderLayout.SOUTH);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        
        b1.addActionListener(ev -> p2.setBackground(Color.RED));
        b2.addActionListener(ev -> p2.setBackground(Color.GREEN));
        b3.addActionListener(ev -> p2.setBackground(Color.BLUE));
        
        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String [] args) {
        new Fereastra4();
    }
}