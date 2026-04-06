import javax.swing.*;

public class Main {
    JFrame f;

    Main(){
        f = new JFrame();
        JOptionPane.showMessageDialog(f,"Hello World!" , "Info", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        new Main();
    }
}  