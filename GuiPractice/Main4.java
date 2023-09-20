package practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Main4 implements ActionListener{
    JFrame frame;
    JButton b1;
    JTextField jf;
    JLabel label;
    public void actionPerformed(ActionEvent e){
        String text=jf.getText();
        try{
            FileWriter w=new FileWriter("C:\\Users\\mdsam\\OneDrive\\Documents\\java\\lili.txt");
            w.write(text);
            w.close();
            JOptionPane.showMessageDialog(frame,"saved");
        }catch(IOException e1){
            JOptionPane.showMessageDialog(frame,"not saved");
        }
    }
    Main4(){
        frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,50,450,350);
        frame.setLayout(new FlowLayout());
        
        b1=new JButton("Button");
        jf =new JTextField(20);
        jf.addActionListener(this);
        label =new JLabel("Dial Number:");
        
        frame.add(label);
        frame.add(jf);
        frame.add(b1);
        
       
        
    }
    public static void main(String []args){
        Main m=new Main();
    }
}


