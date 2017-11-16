import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fereastra1 extends JFrame {
    
    private JButton b1;
    
    public Fereastra1() {
        super("Titlu");
        this.setLayout(new FlowLayout());
        
        b1 = new JButton("HELLO");
        
        this.add(b1);
        
        b1.addActionListener(new MyListener());
    }
    
    private class MyListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent ev) {
            if (b1.getText().equals("HELLO")) {
                b1.setText("WORLD!");
            } else {
                b1.setText("HELLO");
            }
        }
    }
}