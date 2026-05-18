import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;
import java.awt.color.CMMException;
import java.awt.event.*;
import java.io.*;


public class form extends JFrame implements ActionListener{

    JTextField namefield;
    JTextField emailfield;
    JPasswordField passwordfield;
    JComboBox country;
    JButton submit ;
    JButton clear;

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==submit){
            try{
                BufferedWriter writer = new BufferedWriter(new FileWriter("Stduents.txt"));
                String pass = new String(passwordfield.getPassword()) ;
                writer.write(namefield.getText()  +"  "+emailfield.getText()  +"  "+pass +"  "+country.getSelectedItem());
                writer.close();
            }catch(IOException b){}}
        if(e.getSource()==clear){
            namefield.setText("");
            emailfield.setText("");
            passwordfield.setText("");
            country.setSelectedIndex(0);
        }

    }

    public form(){
        setTitle("forum");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        add(panel);
        panel.setLayout(new GridLayout(6,2,10,15));

        JLabel name = new JLabel("Name");
        JLabel email = new JLabel("Email");
        JLabel password = new JLabel("Password");
        JLabel counrty = new JLabel("country");

        namefield = new JTextField();
        emailfield = new JTextField();
        passwordfield= new JPasswordField();
        clear = new JButton("clear");
        submit = new JButton("submit");
        String[] countr = {"Pakistan ", "India","Germany","Other"};
        country = new JComboBox(countr);

        panel.add(name);
        panel.add(namefield);
        panel.add(email);
        panel.add(emailfield);
        panel.add(password);
        panel.add(passwordfield);
        panel.add(counrty);
        panel.add(country);
        panel.add(new JLabel(""));
        panel.add(submit);
        panel.add(new JLabel(""));
        panel.add(clear);

        clear.addActionListener(this);
        submit.addActionListener(this);

        setVisible(true);

    }

}