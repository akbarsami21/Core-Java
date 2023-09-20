package graphicsjava;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel extends JPanel{
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		g.setColor(Color.black);
		g.setFont(new Font(Font.SANS_SERIF,Font.BOLD,30));
		/*g.drawString("We Are 4!diots", 10, 50);
		//g.drawLine(200, 100, 200, 250);
		g.drawRect(10, 100, 150, 100);
		g.fillRect(10, 210, 150, 100);
		g.drawOval(250, 150, 150, 150);
		g.fillOval(250, 310, 150, 150);
		g.drawArc(410, 310, 150, 150, 0, 180);
		/*
		   int x[]= {100,200,300};
		   int y[]= {400,300,400};
		   int n=3;
		   g.drawPolygon(x, y, n);
		 
		String url="C:\\Users\\mdsam\\OneDrive\\Pictures\\picture\\IMG_20220822_195238_798.jpg";
		Image image=new ImageIcon(url).getImage();
		g.drawImage(image, 10, 10, 800, 500, null);*/
		
		g.drawRect(30, 50, 500, 300);
		g.drawOval(200, 130, 150, 150);
		
	
	}

}
