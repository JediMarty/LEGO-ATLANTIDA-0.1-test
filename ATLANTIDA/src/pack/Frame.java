package pack;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


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
	    labelr.addMouseListener(click_r);
	    
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

	MouseListener click_r = new MouseListener() {

		@Override
		public void mouseClicked(MouseEvent e) {
			int i = 0;
			yes = true;
			
			if (yes = true) {
		
				while(i<=10) {
				
					try {
						Thread.sleep(20);
						resources();
						i+=1;
					
				
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
				}
				
				
			}
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
