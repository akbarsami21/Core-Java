package practice;
import javax.swing.*;
import java.awt.*;
public class Main7 {
	    public static void main(String[] args) {
	        JFrame frame = new JFrame("My Program");
	        JButton button = new JButton("Click Me");
	        button.setForeground(Color.red);
	        frame.add(button);
	        frame.pack();
	        frame.setVisible(true);
	        frame.setLayout(new FlowLayout());
	    }
	}

