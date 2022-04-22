package frame;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main 
{

	public static void main(String[] args) 
	{
//		JFrame frame = new JFrame();
//		frame.setVisible(true);
//		frame.setSize(400,400);
//		frame.setTitle("my new frame");
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setResizable(true);
//		
//		
//		ImageIcon image = new ImageIcon("snake4.png");
//		frame.setIconImage(image.getImage());
//		frame.getContentPane().setBackground(new Color(255,5,255));
		 
		//new MyFrame();
		
		ImageIcon imageIcon = new ImageIcon("h1.png");
		
		 JLabel label = new JLabel();
		 label.setText("How are you?");
		 label.setIcon(imageIcon);
		 label.setHorizontalTextPosition(JLabel.CENTER);
		 label.setVerticalTextPosition(JLabel.TOP);
		 label.setForeground(new Color(255,100,100));
		 label.setFont(new Font("楷體",Font.BOLD,30));//Font.PLAIN(正常)、Font.BOLD(粗體)和Font.ITALIC（斜體）
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(label);
		
		
	}

}
