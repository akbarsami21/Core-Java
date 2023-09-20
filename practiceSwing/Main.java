package practiceSwing;

import java.awt.*;
import javax.swing.*;

public class Main {
	public static void main(String[] args) {

		JFrame frame = new JFrame("Calculator");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(150, 50, 350, 350);
		frame.setLayout(new FlowLayout());

		JPanel p1 = new JPanel(new FlowLayout());
		JTextField jf = new JTextField();
		jf.setPreferredSize(new Dimension(400, 90));
		p1.add(jf);
		frame.add(p1, BorderLayout.CENTER);
		;

		JPanel p = new JPanel(new GridLayout(5, 5));
		p.add(new JButton("R-CM"));
		p.add(new JButton("M-"));
		p.add(new JButton("M+"));
		p.add(new JButton("/"));
		p.add(new JButton("C"));

		for (int i = 7; i <= 9; i++) {
			p.add(new JButton("" + i));
		}

		p.add(new JButton("X"));
		p.add(new JButton("CE"));

		for (int i = 4; i <= 6; i++) {
			p.add(new JButton("" + i));
		}
		p.add(new JButton("-"));
		p.add(new JButton("R"));

		for (int i = 1; i <= 3; i++) {
			p.add(new JButton("" + i));
		}
		p.add(new JButton("+"));
		p.add(new JButton("+-"));
		p.add(new JButton("0"));
		p.add(new JButton("."));
		p.add(new JButton("%"));
		p.add(new JButton("*"));
		p.add(new JButton("="));
		p.setPreferredSize(new Dimension(400, 400));
		frame.add(p, BorderLayout.WEST);

	}

}
