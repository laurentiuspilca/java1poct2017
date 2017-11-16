import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fereastra6 extends JFrame {
    
    private JMenuBar mb;
    private JMenu m1;
    private JMenuItem mi1;
    
    private JPanel p1,p2,p3;
    private JLabel e1,e2;
    private JTextField t1;
    private JPasswordField t2;
    private JButton b1;
    
    public Fereastra6() {
        super("Login Frame");
        setLayout(new GridLayout(3, 1));
        
        mb = new JMenuBar();
        m1 = new JMenu("File");
        mi1 = new JMenuItem("Exit");
        
        setJMenuBar(mb);
        mb.add(m1);
        m1.add(mi1);
        mi1.addActionListener(ev -> System.exit(0));
        
        p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p3 = new JPanel();
        
        add(p1); add(p2); add(p3);
        
        e1 = new JLabel("Username");
        e2 = new JLabel("Password");
        
        t1 = new JTextField(15);
        t2 = new JPasswordField(15);
        
        b1 = new JButton("Login");
        
        p1.add(e1); p1.add(t1);
        p2.add(e2); p2.add(t2);
        p3.add(b1);
        
        b1.addActionListener(ev -> login());
        
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    
    private void login() {
        String username = t1.getText();
        String password = new String(t2.getPassword());
        
        if ("gigel".equals(username) && "1234".equals(password)) {
            JOptionPane.showMessageDialog(this, "Login reusit!");
        } else {
            JOptionPane.showMessageDialog(this, "Username sau parola gresite!");
        }
    }
    
    public static void main(String [] args) {
        new Fereastra6();
    }
}