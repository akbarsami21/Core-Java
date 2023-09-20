package JOption;

import java.awt.*;

import javax.swing.*;

public class Telehone {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("TelePhone");
		frame.setLayout(new FlowLayout());

		JPanel center = new JPanel();
		center.setLayout(new GridLayout(4, 3));
		for (int i = 1; i < 10; i++) {
			center.add(new JButton("" + i));
		}
		center.add(new JButton("*"));
		center.add(new JButton("0"));
		center.add(new JButton("#"));
		frame.add(center, BorderLayout.CENTER);

		JPanel south = new JPanel(new FlowLayout());
		JTextField jf = new JTextField(10);
		south.add(new JLabel("Number To Dial"));
		south.add(jf);
		frame.add(south, BorderLayout.EAST);

	}

}
