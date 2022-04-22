package frame;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame
{
	MyFrame()
	{
		
		this.setVisible(true);
		this.setSize(400,400);
		this.setTitle("my new this");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		
		
		ImageIcon image = new ImageIcon("snake4.png");
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(new Color(255,5,255));
	}
}
