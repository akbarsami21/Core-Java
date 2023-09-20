package practiceSwing;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class MsgListen implements ActionListener{
	String m;
	MsgListen(String m){
		this.m=m;
	}
	public void actionPerformed(ActionEvent event) {
		JOptionPane.showMessageDialog(null, "Welcome To Facebook");
	}
}
public class Mainn {
	public static void main(String[] args) {
		JFrame frame=new JFrame("Facebook");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 30, 450, 450);
		frame.setLayout(new FlowLayout());
		
		JPanel p4=new JPanel();
		JTextField jf4=new JTextField(11);
		p4.add(jf4);
		p4.setBackground(Color.white);
		frame.add(p4, BorderLayout.WEST);
		

		JPanel p2=new JPanel();
		p2.setLayout(new GridLayout(4,3));
		for(int i=1;i<10;i++) {
			p2.add(new JButton(""+i));
		}
		p2.add(new JButton("*"));
		p2.add(new JButton("0"));
		p2.add(new JButton("#"));
		frame.add(p2, BorderLayout.SOUTH);
		
		JPanel p=new JPanel();
		JTextField jf=new JTextField(15);
		jf.setSize(new Dimension(50,60));
		p.add(new JLabel("Email:"));
		p.add(jf);
		p.setBackground(Color.white);
		frame.add(p, BorderLayout.WEST);
		
		JPanel p1=new JPanel();
		JTextField jf1=new JTextField(15);
		jf1.setSize(new Dimension(50,60));
		p1.add(new JLabel("Pass :"));
		p1.add(jf1);
		p1.setBackground(Color.white);
		frame.add(p1, BorderLayout.WEST);
		
		/*JButton b1=new JButton("Sign Up");
		b1.addActionListener(new MsgListen("Sign Up"));
		b1.setBackground(Color.blue);
		frame.add(b1);*/
		
		JButton b2=new JButton("Sign In");
		b2.addActionListener(new MsgListen("Sign In"));
		b2.setBackground(Color.blue);
		frame.add(b2);
		
		
	}

}
