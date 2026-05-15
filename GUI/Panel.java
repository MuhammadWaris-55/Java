import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel implements ActionListener{
    static JButton btn;
    static JPanel panel;
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btn){
            System.out.println("Waris COdes");
            panel.setVisible(true);
        }
    }
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setLayout(null);

        btn = new JButton();
        btn.addActionListener(new Button());
        frame.add(btn);
        btn.setBounds(0,0,100,100);

        panel = new JPanel();
        panel.setSize(150,150);
        panel.setBackground(Color.magenta);
        panel.setBounds(100,100,200,200);
        panel.setVisible(false);
        frame.add(panel);


    }
}
