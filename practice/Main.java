package practice;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
class MyPanel extends JPanel{
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.red);
		g.setFont(new Font(Font.SANS_SERIF,Font.CENTER_BASELINE,20));
		g.fillOval(190, 130, 150, 150);
		g.setColor(Color.black);
		g.fillOval(190, 500, 150, 150);
		g.setColor(Color.blue);
		g.fillOval(790, 130, 150, 150);
		g.setColor(Color.green);
		g.fillOval(790, 500, 150, 150);
		g.setColor(Color.YELLOW);
		g.fillRect(450, 300, 200, 200);
		g.setColor(Color.red);
		g.fillOval(510, 360, 80, 80);
		
		
	}
}
public class Main extends JFrame{
	public static void main(String[] args) {
		Main frame=new Main();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyPanel panel=new MyPanel();
		panel.setBackground(Color.CYAN);
		frame.add(panel);
		frame.setBounds(500, 250, 550, 450);
		frame.setTitle("Java Swings");
		frame.setResizable(true);
		
	}

}
