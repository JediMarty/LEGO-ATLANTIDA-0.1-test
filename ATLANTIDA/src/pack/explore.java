package pack;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;


public class explore implements ActionListener{
	
	public static JLabel bg;
	public static JLabel unitlb;
    public static JLabel monsterlb;	
    static ImageIcon imgm1 = new ImageIcon("monster1.png");
    static ImageIcon imgm2 = new ImageIcon("monster1.png");
    static ImageIcon imgm3 = new ImageIcon("monster1.png");
    public static JButton buttonhit;
    
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

		
		buttonhit = new JButton("Hit");
		buttonhit.addActionListener(this);
		
	}

       public static void showMonster() {
		
		List <ImageIcon> list = new ArrayList<>();
		int random = (int) (Math.random() * 3);
		
		list.add(imgm1);
		list.add(imgm2);
		list.add(imgm3);
		
		monsterlb.setIcon(list.get(random));
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//the different situations in the game!
		
        int num1 = (int) (Math.random() * 9 + 1);
		int num2 = (int) (Math.random() * 9 + 1);
		
		if(num1 == 1 || num1 == 2 || num1 ==3) {
			
			if(num2 >5) {
				showMessageDialog(null, "You destroy the sea monster, congratulations!");
			}
			
			else {
			showMessageDialog(null, "The sea monster destroy you, you lost!");
			}
			
		}
		
		else if (num1 == 5 || num1 == 6){
			monsterlb.setIcon(imgm2);
			if(num2 >5) {
				showMessageDialog(null, "You destroy the sea monster, congratulations!");
			}
			
			else {
			showMessageDialog(null, "The sea monster destroy you, you lost!");
			}
		}
		
		else if (num1 == 4) {
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


