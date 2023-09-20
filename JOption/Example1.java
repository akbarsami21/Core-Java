package JOption;

import java.awt.Color;

import javax.swing.*;

public class Example1 {
	public static void main(String[] args) {


		String name = JOptionPane.showInputDialog(null, "What's Your Name?");

		int choice = JOptionPane.showConfirmDialog(null, "Do You Like Cricket? " + name + " ?");

		if (choice == JOptionPane.YES_OPTION)
			JOptionPane.showMessageDialog(null, "Good, South Asian People Like Cricket Very Much."
					+ "\nThank You So Much " + name + " For Using Our Application.");
		else if (choice == JOptionPane.NO_OPTION)
			JOptionPane.showMessageDialog(null,
					"Its Okay." + "Thank You So Much " + name + " For Using Our Application.");
		else
			JOptionPane.showMessageDialog(null, "Thanks " + name + " For Using This Applicaiton");
	}

}

// JOptionPane.showMessageDialog(null, "My Name is Sami");
// JOptionPane.showConfirmDialog(null, "is your name sami?");
// JOptionPane.showInputDialog(null, "whats your name?");