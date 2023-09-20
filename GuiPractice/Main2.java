package practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Main2 implements ActionListener{
	JFrame frame;
	JButton button;
	JTextField jf;
	JLabel label;
	JPanel panel1;
	JPanel panel2;
	
	public void actionPerformed(ActionEvent event) {
		String text=jf.getText();
		try {
			FileWriter w=new FileWriter("C:\\Users\\mdsam\\OneDrive\\Documents\\java\\sami.exe");
			w.write(text);
			w.close();
			JOptionPane.showMessageDialog(panel2, "Saved");
			
			FileReader r=new FileReader("C:\\Users\\mdsam\\OneDrive\\Documents\\java\\sami.exe ");
			StringBuilder count=new StringBuilder();
			int c;
			while((c=r.read())!=-1) {
				count.append((char)c);
			}
			r.close();
			JOptionPane.showMessageDialog(panel2, count.toString());
		}catch(IOException e) {
			JOptionPane.showMessageDialog(panel2, "Not Saved");
		}
	}
	Main2(){
		frame=new JFrame("Calculator");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 50, 450, 400);
		frame.setLayout(new FlowLayout());
		
		panel1=new JPanel(new GridLayout(4,3));
		for(int i=1;i<=9;i++) {
			panel1.add(new JButton(""+i));
		}
		panel1.add(new JButton("*"));
		panel1.add(new JButton("0"));
		panel1.add(new JButton("#"));
		panel1.setPreferredSize(new Dimension(200,150));
		panel1.setBackground(Color.black);
		frame.add(panel1);	
		
		panel2=new JPanel(new FlowLayout());
		jf=new JTextField(15);
		label=new JLabel("Dial Number:");
		panel2.add(label);
		panel2.add(jf);
		button =new JButton("Save");
		button.setBackground(Color.red);
		button.addActionListener(this);
		panel2.add(button);
		panel2.setBackground(Color.green);
		frame.add(panel2);
		
	}
	public static void main(String[] args) {
		Main2 m=new Main2();
	}

}
