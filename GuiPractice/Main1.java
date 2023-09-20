package practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Main1 implements ActionListener{
	JFrame frame;
	JButton b1;
	JButton b2;
	JTextField jf1;
	JTextField jf2;
	JLabel lb1;
	JLabel lb2;
	
	public void actionPerformed(ActionEvent event) {
		String text1=jf1.getText();
		String text2=jf2.getText()
;		try {
			FileWriter w=new FileWriter("C:\\Users\\mdsam\\OneDrive\\Documents\\java\\loginInfo.txt");
			w.write(text1);
			System.out.println();
			w.write(text2);
			w.close();
			JOptionPane.showMessageDialog(frame, "Log in SuccesFully");
			
		}catch(Exception e) {
			System.out.println();
		}
		
	}
	

	Main1() {
		frame = new JFrame("JFrame");
		frame.setVisible(true);
		frame.setBounds(100, 50, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setBackground(Color.black);

		b1 = new JButton("Sign In");
		b1.setBackground(Color.CYAN);
		b1.addActionListener(this);
		//b2 = new JButton("Create Account");
		//b2.setBackground(Color.cyan);

		jf1 = new JTextField(20);
		jf2 = new JTextField(20);

		lb1 = new JLabel("Email");
		lb2 = new JLabel("Pass");

		frame.add(lb1);
		frame.add(jf1);
		frame.add(lb2);
		frame.add(jf2);
		frame.add(b1);
		//frame.add(b2);
	}

	public static void main(String[] args) {
		Main1 m = new Main1();
	}

}
