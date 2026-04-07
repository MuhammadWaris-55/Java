// Making Buttons using actionListener

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;

public class Main {
    JFrame jf;

    public Main() {
        jf = new JFrame("My Window");

        JButton btnHello = new JButton("Say Hello");
        btnHello.addActionListener(e -> 
            JOptionPane.showMessageDialog(jf, "Hello!")
        );

        JButton btnBye = new JButton("Say Goodbye");
        btnBye.addActionListener(e -> 
            JOptionPane.showMessageDialog(jf, "Goodbye!")
        );

        // Button 3 - Close Window
        JButton btnClose = new JButton("Close");
        btnClose.addActionListener(e -> System.exit(0));

        jf.setLayout(new FlowLayout());
        jf.add(btnHello);
        jf.add(btnBye);
        jf.add(btnClose);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400, 400);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}