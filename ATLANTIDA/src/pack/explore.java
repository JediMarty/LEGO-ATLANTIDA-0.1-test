package pack;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;


public class explore implements ActionListener{
	
	public static JLabel bg;
	public static JLabel unitlb;
    public static JLabel monsterlb;	
    static ImageIcon imgm1 = new ImageIcon("monster1.png");
    static ImageIcon imgm2 = new ImageIcon("monster2.png");
    static ImageIcon imgm3 = new ImageIcon("monster3.png");
    public static JButton buttonhit;
    public static JButton buttonrun;
	
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
		
		buttonrun = new JButton("Run");
		buttonrun.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Frame.switch_the_scene();
				
			}
			
		});
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
		//the different situations in the battles!
		
        int num = (int) (Math.random() * 9 + 1);
		
		if(monsterlb.getIcon() == imgm1) {
			
			if(num > 5) {
				showMessageDialog(null, "You destroy the sea monster, congratulations!");
				Frame.Count_label.setText(String.valueOf(Frame.sum_resources += 500));
			}
			
			else {
			showMessageDialog(null, "The sea monster destroy you, you lost!");
			Frame.Count_label.setText(String.valueOf(Frame.sum_resources -= 1000));
			}
			
		}
		
		else if (monsterlb.getIcon() == imgm2){
			
			if(num > 3) {
				showMessageDialog(null, "You destroy the Manta Warrior, congratulations!");
				Frame.Count_label.setText(String.valueOf(Frame.sum_resources += 200));
			}
			
			else {
			showMessageDialog(null, "The sea monster destroy you, you lost!");
			Frame.Count_label.setText(String.valueOf(Frame.sum_resources -= 200));
			}
		}
		
		else if (monsterlb.getIcon() == imgm3) {
			if(num > 3) {
				showMessageDialog(null, "You destroy the sea monster, congratulations!");
				Frame.Count_label.setText(String.valueOf(Frame.sum_resources += 100));
			}
			
			else {
			showMessageDialog(null, "The Shark-man destroy you, you lost!");
			Frame.Count_label.setText(String.valueOf(Frame.sum_resources -= 100));
			}
		}
		
		Frame.switch_the_scene();
		 
	}
		
	}



