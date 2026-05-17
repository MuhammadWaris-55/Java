package StdGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


// Calculator class
class Calculator implements ActionListener {

    JFrame f;

    JTextField tf;

    // Number buttons
    JButton b0, b1, b2, b3, b4,
            b5, b6, b7, b8, b9;

    // Operation buttons
    JButton add, sub, mul, div,
            equal, clear;


    int num1, num2, result;

    String operator;



    Calculator() {

        // Creating frame
        f = new JFrame("Calculator");

        f.setSize(350,450);

        f.setLayout(null);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        // Text field for display
        tf = new JTextField();

        tf.setBounds(30,30,270,40);

        f.add(tf);



        // Creating number buttons
        b0 = new JButton("0");

        b1 = new JButton("1");

        b2 = new JButton("2");

        b3 = new JButton("3");

        b4 = new JButton("4");

        b5 = new JButton("5");

        b6 = new JButton("6");

        b7 = new JButton("7");

        b8 = new JButton("8");

        b9 = new JButton("9");



        // Creating operation buttons
        add = new JButton("+");

        sub = new JButton("-");

        mul = new JButton("*");

        div = new JButton("/");

        equal = new JButton("=");

        clear = new JButton("C");



        // Setting button positions

        b7.setBounds(30,100,60,40);

        b8.setBounds(100,100,60,40);

        b9.setBounds(170,100,60,40);

        add.setBounds(240,100,60,40);


        b4.setBounds(30,160,60,40);

        b5.setBounds(100,160,60,40);

        b6.setBounds(170,160,60,40);

        sub.setBounds(240,160,60,40);


        b1.setBounds(30,220,60,40);

        b2.setBounds(100,220,60,40);

        b3.setBounds(170,220,60,40);

        mul.setBounds(240,220,60,40);


        b0.setBounds(30,280,60,40);

        clear.setBounds(100,280,60,40);

        equal.setBounds(170,280,60,40);

        div.setBounds(240,280,60,40);



        // Adding buttons into frame
        f.add(b0);

        f.add(b1);

        f.add(b2);

        f.add(b3);

        f.add(b4);

        f.add(b5);

        f.add(b6);

        f.add(b7);

        f.add(b8);

        f.add(b9);

        f.add(add);

        f.add(sub);

        f.add(mul);

        f.add(div);

        f.add(equal);

        f.add(clear);



        // Registering events

        b0.addActionListener(this);

        b1.addActionListener(this);

        b2.addActionListener(this);

        b3.addActionListener(this);

        b4.addActionListener(this);

        b5.addActionListener(this);

        b6.addActionListener(this);

        b7.addActionListener(this);

        b8.addActionListener(this);

        b9.addActionListener(this);

        add.addActionListener(this);

        sub.addActionListener(this);

        mul.addActionListener(this);

        div.addActionListener(this);

        equal.addActionListener(this);

        clear.addActionListener(this);



        f.setVisible(true);
    }



    // Event Handling
    public void actionPerformed(ActionEvent e) {

        // Number button logic
        if(e.getSource() == b0)
            tf.setText(tf.getText() + "0");

        else if(e.getSource() == b1)
            tf.setText(tf.getText() + "1");

        else if(e.getSource() == b2)
            tf.setText(tf.getText() + "2");

        else if(e.getSource() == b3)
            tf.setText(tf.getText() + "3");

        else if(e.getSource() == b4)
            tf.setText(tf.getText() + "4");

        else if(e.getSource() == b5)
            tf.setText(tf.getText() + "5");

        else if(e.getSource() == b6)
            tf.setText(tf.getText() + "6");

        else if(e.getSource() == b7)
            tf.setText(tf.getText() + "7");

        else if(e.getSource() == b8)
            tf.setText(tf.getText() + "8");

        else if(e.getSource() == b9)
            tf.setText(tf.getText() + "9");



            // Operation buttons
        else if(e.getSource() == add) {

            num1 =
                    Integer.parseInt(tf.getText());

            operator = "+";

            tf.setText("");
        }

        else if(e.getSource() == sub) {

            num1 =
                    Integer.parseInt(tf.getText());

            operator = "-";

            tf.setText("");
        }

        else if(e.getSource() == mul) {

            num1 =
                    Integer.parseInt(tf.getText());

            operator = "*";

            tf.setText("");
        }

        else if(e.getSource() == div) {

            num1 =
                    Integer.parseInt(tf.getText());

            operator = "/";

            tf.setText("");
        }



        // Equal button logic
        else if(e.getSource() == equal) {

            num2 =
                    Integer.parseInt(tf.getText());


            // Performing operation
            if(operator.equals("+"))
                result = num1 + num2;

            else if(operator.equals("-"))
                result = num1 - num2;

            else if(operator.equals("*"))
                result = num1 * num2;

            else if(operator.equals("/"))
                result = num1 / num2;


            // Showing result
            tf.setText(String.valueOf(result));
        }



        // Clear button
        else if(e.getSource() == clear) {

            tf.setText("");
        }
    }



    public static void main(String[] args) {

        new Calculator();
    }
}