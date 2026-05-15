import javax.swing.*;
import java.awt.*;

public class TextField {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); //Making New Frame
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JTextField textfield = new JTextField(); //Making New TextField
        textfield.setPreferredSize(new Dimension(300, 100));
        frame.add(textfield);

        JButton btn = new JButton("SUBMIT");
        // Lambda expression - no extra class needed
        btn.addActionListener(e -> System.out.println("Waris Codes"));
        frame.add(btn);

        frame.setVisible(true);
    }
}