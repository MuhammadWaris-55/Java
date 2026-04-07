// Making a simple Button and using swing library

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class Main {
    JFrame jf;

    public Main(){
        jf = new JFrame("My Window");
        JButton btn = new JButton("Say Hello");

        jf.setLayout(new FlowLayout());
        jf.add(btn);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400, 400);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}