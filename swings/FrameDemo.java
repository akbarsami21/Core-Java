package swings;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel {
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.black);
		g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
		g.drawString("We Are 4!diots", 50, 50);
		g.drawOval(10, 60, 100, 100);
		g.fillOval(10, 170, 100, 100);
		String url = "C:\\Users\\mdsam\\Downloads\\xyz.jpeg";
		Image image = new ImageIcon(url).getImage();
		g.drawImage(image, 120, 60, 200, 150, null);

		g.drawRect(350, 60, 200, 200);
		g.fillRect(350, 300, 200, 200);

		int x[] = { 100, 200, 300 };
		int y[] = { 400, 300, 400 };
		int n = 3;
		g.drawPolygon(x, y, n);

		int a[] = { 50, 175, 300 };
		int b[] = { 600, 420, 600 };
		int c = 3;
		g.fillPolygon(a, b, c);
	}
}

public class FrameDemo extends JFrame {
	public static void main(String[] args) {

		FrameDemo frame = new FrameDemo();

		MyPanel panel1 = new MyPanel();
		panel1.setBackground(Color.GRAY);
		frame.add(panel1);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// frame.setSize(500,400);
		// frame.setLocation(100, 100);
		frame.setBounds(100, 100, 500, 400);
		frame.setTitle("BlackPink In Your Area");
		frame.setResizable(true);
		frame.setBackground(Color.BLACK);

	}

}
