package JOption;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class MesageListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent event) {
		JOptionPane.showMessageDialog(null, "You Clicked The Button");
	}
}

public class Example2 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(500, 500);
		frame.setLayout(new FlowLayout());

		JButton button1 = new JButton();
		button1.setText("Button1");
		frame.add(button1);
		button1.setBackground(Color.blue);
		button1.setPreferredSize(new Dimension(150, 50));
		button1.addActionListener(new MesageListener());

		JButton button2 = new JButton();
		button2.setText("Button2");
		frame.add(button2);
		button2.setBackground(Color.yellow);
		button2.setPreferredSize(new Dimension(150, 50));
		button2.addActionListener(new MesageListener());
	}

}
