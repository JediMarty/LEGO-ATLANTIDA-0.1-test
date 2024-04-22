package pack;

import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;

public class Frame extends JFrame{

	
	public Frame() {
		init();
	}
	
	public void init() {
		
		int num_test = 1000;
		JLabel label = new JLabel();
		JLabel Count_label = new JLabel();
		ImageIcon bg = new ImageIcon("darkrain.jpg");
		JPanel panel = new JPanel();
     
		label.setIcon(bg);
		
		Count_label.setText(String.valueOf(num_test));
	    Count_label.setForeground(Color.WHITE);
	    Count_label.setFont(new Font("MV Boli",Font.BOLD,30));
		
		LayoutManager overlay = new OverlayLayout(panel);
        panel.setLayout(overlay);
        
        panel.add(Count_label);
        Count_label.setAlignmentX(RIGHT_ALIGNMENT);
        Count_label.setAlignmentY(TOP_ALIGNMENT);
        
        panel.add(label);
        label.setAlignmentX(RIGHT_ALIGNMENT);
        label.setAlignmentY(TOP_ALIGNMENT);
		
        //The Window
		this.setTitle("ATLANTIDA 0.1-test");
		this.setSize(800,800);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
	    this.setVisible(true);
		
	}
}
