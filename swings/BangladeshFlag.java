package swings;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BangladeshFlag extends JPanel {
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        
        // Draw green background
        g.setColor(Color.green);
        g.fillRect(0, 0, width, height);
        
        // Draw red circle
        int radius = height / 3;
        int centerX = width / 2;
        int centerY = height / 2;
        g.setColor(Color.RED);
        g.fillOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius);
        
        // Draw smaller white circle inside the red circle
        radius = (int) (radius * 0.6);
        g.setColor(Color.red);
        g.fillOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius);
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bangladesh Flag");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        BangladeshFlag panel = new BangladeshFlag();
        frame.add(panel);
        frame.setVisible(true);
    }
}

