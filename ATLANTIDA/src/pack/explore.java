package pack;


import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class explore {
	
	public static JLabel bg;
	public static JLabel unitlb;
    public static JLabel monsterlb;	

	public explore() {
		init2();
	}
	
	public void init2() {
		
		ImageIcon img1 = new ImageIcon("unit1.png");
		ImageIcon img2 = new ImageIcon("monster1.png");
		
		bg = new JLabel();
		bg.setIcon(Frame.bg);
		
		unitlb = new JLabel();
		unitlb.setIcon(img1);
		unitlb.setBackground(Color.BLUE);
		unitlb.setOpaque(true);
		
		monsterlb = new JLabel();
		monsterlb.setIcon(img2);
		monsterlb.setBackground(Color.DARK_GRAY);
		monsterlb.setOpaque(true);

	}

}

