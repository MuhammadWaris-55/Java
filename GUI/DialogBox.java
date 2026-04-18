import javax.swing.*;

public class Main {
    JFrame f;

    Main(){
        f = new JFrame();
        // Show a dialog box with an info icon
        JOptionPane.showMessageDialog(f,"Hello World!" , "Info", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        new Main();
    }
}