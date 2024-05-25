package pack;

import javax.swing.JFrame;

public class explore {
	
	public static JFrame frameexplore = new JFrame();
	
	public explore() {
		init();
	}
	
	public void init() {
		
		frameexplore.setTitle("ATLANTIDA 0.1-test");
		frameexplore.setSize(800,800);
		frameexplore.setResizable(false);
		frameexplore.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   


		frameexplore.setLayout(null);
		frameexplore.setVisible(true);
	}

}
