package pack;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Frame extends JFrame{

	public boolean yes = false;
	static int num_test = 1000;
	JLabel Count_label;
	
	public Frame() {
		init();
		
	}
	
	public void init() {
		
		JLabel labelbg = new JLabel();
		Count_label = new JLabel();
		JLabel labelbase = new JLabel();
		JLabel labelr = new JLabel();
		JLabel labelu = new JLabel();
		JPanel panel = new JPanel();
		ImageIcon bg = new ImageIcon("darkrain.jpg");
		ImageIcon base = new ImageIcon("Abase.png");
		ImageIcon resources = new ImageIcon("resources.png");
		ImageIcon units = new ImageIcon("Asub.png");
	    
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
	    labelr.addMouseListener(click_r);
	
	    panel.setBackground(Color.BLUE);
	    //panel.setLayout(new FlowLayout(FlowLayout.LEFT));
	    panel.setLayout(new BorderLayout());
	    panel.setPreferredSize(new Dimension(100,120));
	    Image modifiedbaseimg3 = units.getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
	    units = new ImageIcon(modifiedbaseimg3);
	    labelu.setIcon(units);

	    panel.add(labelu);
	    
	    
	    //The Window
		this.setTitle("ATLANTIDA 0.1-test");
		this.setSize(800,800);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
		this.add(panel,BorderLayout.SOUTH);
		this.add(Count_label);
        this.add(labelr);
		this.add(labelbase);
        this.add(labelbg);
	    //this.setLayout(null);
        
	    this.setVisible(true);
	    
	}
    
	Timer timer; 
	int resource = 3;
	int i=0;
	MouseListener click_r = new MouseListener() {

		@Override
		public void mouseClicked(MouseEvent e) {
			
			yes = true;
			if (yes = true && resource > 0) {
			timer = new Timer(1000, new ActionListener() {
				

				@Override
				public void actionPerformed(ActionEvent e) {
					
					i++;
					if (i<=10) {
						resources();
					} else {
						timer.stop();
					}
					
				}
			});
			
		
				timer.start();
				
			}
			i = 0;
			resource-=1;
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	};
	public void resources() {
		
		num_test +=10;
		Count_label.setText(String.valueOf(num_test));
	}
	

	
}
