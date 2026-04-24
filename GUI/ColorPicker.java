import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorText {

    public static void main(String[] args) {

        // Create the window
        JFrame frame = new JFrame("Text Color Changer");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Input field for typing text
        JTextField inputField = new JTextField(20);

        // Label to display the colored text
        JLabel displayLabel = new JLabel("Your text will appear here");
        displayLabel.setFont(new Font("Arial", Font.BOLD, 18));

        // Three color buttons
        JButton redButton    = new JButton("Red");
        JButton blueButton   = new JButton("Blue");
        JButton greenButton  = new JButton("Green");

        // Red button clicked
        redButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayLabel.setText(inputField.getText());
                displayLabel.setForeground(Color.RED);
            }
        });

        // Blue button clicked
        blueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayLabel.setText(inputField.getText());
                displayLabel.setForeground(Color.BLUE);
            }
        });

        // Green button clicked
        greenButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayLabel.setText(inputField.getText());
                displayLabel.setForeground(Color.GREEN);
            }
        });

        // Add everything to the window
        frame.add(new JLabel("Type something:"));
        frame.add(inputField);
        frame.add(redButton);
        frame.add(blueButton);
        frame.add(greenButton);
        frame.add(displayLabel);

        // Show the window
        frame.setVisible(true);
    }
}