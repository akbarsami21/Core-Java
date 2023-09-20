package JOption;

import java.awt.*;

import javax.swing.*;

public class FbSignUp {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(300, 100, 500, 500);
		
		                   
		JPanel panel1 = new JPanel();
		JTextField jf1 = new JTextField(8);
		panel1.add(new JLabel("Name:"));
		panel1.add(jf1);
		frame.add(panel1, BorderLayout.PAGE_START);

		JTextField jf = new JTextField(8);
		panel1.add(new JLabel("Password:"));
		panel1.add(jf);
		//frame.add(panel1, BorderLayout.SOUTH);
		
		JButton b1=new JButton();
		b1.setText("Sign In");
		b1.setPreferredSize(new Dimension(100,20));
		
		panel1.add(b1);
		frame.add(panel1, BorderLayout.WEST);
		
		
	}

}
