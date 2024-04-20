package pack;

import javax.swing.JFrame;

public class Frame extends JFrame{

	public Frame() {
		init();
	}
	
	public void init() {
		
		this.setTitle("ATLANTIDA 0.1-test");
		this.setSize(800,800);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
