package pack;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Frame extends JFrame{

	
	public Frame() {
		init();
	}
	
	public void init() {
		
        JLabel label = new JLabel();
	
		ImageIcon bg = new ImageIcon("darkrain.jpg");
		
     
		label.setIcon(bg);
		
		
        
		//The Window
		this.setTitle("ATLANTIDA 0.1-test");
		this.setSize(800,800);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.add(label);
	   
		this.setVisible(true);
		
	}
}
