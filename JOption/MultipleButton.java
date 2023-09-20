package JOption;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class MessageLisetner implements ActionListener {
	String msg;

	MessageLisetner(String msg) {
		this.msg = msg;
	}

	public void actionPerformed(ActionEvent event) {
		JOptionPane.showMessageDialog(null, "Your Clicked " + msg);
	}
}

public class MultipleButton {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setBackground(Color.pink);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(300, 50, 250, 250);
		frame.setTitle("Button Adding");

		frame.setLayout(new FlowLayout());

		JButton b1 = new JButton("Button1");
		b1.setBackground(Color.red);
		JButton b2 = new JButton("Button2");
		b2.setBackground(Color.yellow);
		JButton b3 = new JButton("Button3");
		b3.setBackground(Color.blue);
		JButton b4 = new JButton("Button4");
		b4.setBackground(Color.green);

		b1.addActionListener(new MessageLisetner("Button1"));
		b2.addActionListener(new MessageLisetner("Button2"));
		b3.addActionListener(new MessageLisetner("Button3"));
		b4.addActionListener(new MessageLisetner("Button4"));

		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);

		JPanel panel = new JPanel(new GridLayout(4, 3));
		for (int i = 1; i < 10; i++) {
			panel.add(new JButton("" + i));
		}
		panel.add(new JButton("*"));
		panel.add(new JButton("0"));
		panel.add(new JButton("#"));
		panel.setPreferredSize(new Dimension(150,150));
		panel.setBackground(Color.pink);
		frame.add(panel, BorderLayout.CENTER);

		JPanel panel1 = new JPanel(new FlowLayout());
		JTextField jf = new JTextField(12);
		JLabel jb = new JLabel("Dial Number:");
		panel1.add(jb);
		panel1.add(jf);
		panel1.setBackground(Color.pink);
		frame.add(panel1, BorderLayout.NORTH);
		

	}

}
