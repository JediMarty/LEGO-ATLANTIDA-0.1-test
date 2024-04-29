package pack;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;
import javax.swing.SwingConstants;

public class Frame extends JFrame{

	
	public Frame() {
		init();
	}
	
	public void init() {
		
		int num_test = 1000;
		JLabel labelbg = new JLabel();
		JLabel Count_label = new JLabel();
		JLabel labelbase = new JLabel();
		JLabel labelr = new JLabel();
		ImageIcon bg = new ImageIcon("darkrain.jpg");
		ImageIcon base = new ImageIcon("Abase.png");
		ImageIcon resources = new ImageIcon("resources.png");

	    labelbg.setIcon(bg);
	    labelbg.setBounds(0,0,800,800);
	    
		Count_label.setText(String.valueOf(num_test));
	    Count_label.setForeground(Color.WHITE);
	    Count_label.setFont(new Font("MV Boli",Font.BOLD,30));
	    Count_label.setVerticalAlignment(JLabel.TOP);
	    Count_label.setHorizontalAlignment(JLabel.RIGHT);
		Count_label.setBounds(0,0,780,780);

	    Image modifiedbaseimg1 = base.getImage().getScaledInstance(450, 400, java.awt.Image.SCALE_SMOOTH);
	    base = new ImageIcon(modifiedbaseimg1);
	    labelbase.setIcon(base);
	    labelbase.setBounds(0,150,500,500);
        
	    Image modifiedbaseimg2 = resources.getImage().getScaledInstance(550, 380, java.awt.Image.SCALE_SMOOTH);
	    resources = new ImageIcon(modifiedbaseimg2);
	    labelr.setIcon(resources);
	    labelr.setBounds(360,1,500,500);
	    
	    //The Window
		this.setTitle("ATLANTIDA 0.1-test");
		this.setSize(800,800);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(Count_label);
        this.add(labelr);
		this.add(labelbase);
        this.add(labelbg);
	    this.setLayout(null);
	    this.setVisible(true);
		
	}
}


