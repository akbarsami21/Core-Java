package graphicsjava;

import java.awt.Color;

import javax.swing.JFrame;

public class Example extends JFrame{
	Example(){
		setSize(500,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		MyPanel panel=new MyPanel();
		panel.setBackground(Color.green);
		add(panel);
	}

	public static void main(String[] args) {
		new Example().setVisible(true);

	}

}
