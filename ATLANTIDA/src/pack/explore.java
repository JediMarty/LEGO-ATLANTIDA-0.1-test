package pack;


import java.awt.Color;
import java.util.Random;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class explore {
	
	public static JLabel bg;
	public static JLabel unitlb;
    public static JLabel monsterlb;	
    static ImageIcon img2 = new ImageIcon("monster1.png");
	public explore() {
		init2();
		
	}
	
	public void init2() {
		
		ImageIcon img1 = new ImageIcon("unit1.png");
		
		
		bg = new JLabel();
		bg.setIcon(Frame.bg);
		
		unitlb = new JLabel();
		unitlb.setIcon(img1);
		unitlb.setBackground(Color.BLUE);
		unitlb.setOpaque(true);
		
		monsterlb = new JLabel();
		monsterlb.setIcon(null);
		monsterlb.setBackground(Color.DARK_GRAY);
		monsterlb.setOpaque(true);

	}
	
	public static void action() {
		//this method performs the different situations in the game!
		int num1 = (int) (Math.random() * 9 + 1);
		int num2 = (int) (Math.random() * 9 + 1);
		
		if(num1 == 5 || num1 == 6) {
			monsterlb.setIcon(img2);
			if(num2 >5) {
				showMessageDialog(null, "You destroy the sea monster, congratulations!");
			}
			
			else {
			showMessageDialog(null, "The sea monster destroy you, you lost!");
			}
			
		}
		
		else {
			showMessageDialog(null, "other, not completed yet....");
		}
	}

}

