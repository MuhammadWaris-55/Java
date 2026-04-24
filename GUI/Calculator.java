import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator {

    public static void main(String[] args) {

        // Create the window
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create two input fields
        JTextField num1 = new JTextField(5);
        JTextField num2 = new JTextField(5);

        // Create a label to show the result
        JLabel result = new JLabel("Result: ");

        // Create an Add button
        JButton addButton = new JButton("Add");

        // What happens when the button is clicked
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(num1.getText());
                int b = Integer.parseInt(num2.getText());
                int sum = a + b;
                result.setText("Result: " + sum);
            }
        });

        // Add everything to the window
        frame.add(new JLabel("Number 1:"));
        frame.add(num1);
        frame.add(new JLabel("Number 2:"));
        frame.add(num2);
        frame.add(addButton);
        frame.add(result);

        // Show the window
        frame.setVisible(true);
    }
}