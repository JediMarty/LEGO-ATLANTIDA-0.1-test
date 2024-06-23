package pack;

import static javax.swing.JOptionPane.showMessageDialog;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Frame{
	
	public static JFrame frame = new JFrame();
	public static ImageIcon bg = new ImageIcon("darkrain.jpg");
	JPanel gamepanel1 = new JPanel();
	JPanel gamepanel2 = new JPanel();
	public static JPanel cardPanel = new JPanel(new CardLayout());
	public boolean yes = false;
	public static int sum_resources = 1000;
	public static JLabel Count_label;
	JButton bbase;
	JButton br;
	JPanel panel;
	JButton exp;
	JButton ex;
	public Frame() {
		init();
		
	}
	
	public void init() {
		
		JLabel labelbg = new JLabel();
		Count_label = new JLabel();
		JLabel labelu = new JLabel();
		JLabel labelp = new JLabel();
		JLabel labelock1 = new JLabel();
		JLabel labelock2 = new JLabel();
		panel = new JPanel();
		
		ImageIcon base = new ImageIcon("Abase.png");
		ImageIcon resources = new ImageIcon("resources.png");
		ImageIcon units = new ImageIcon("Asub.png");
		ImageIcon explored = new ImageIcon("expl.png");
		ImageIcon exit = new ImageIcon("exit.png");
		ImageIcon lockedbuilding1 = new ImageIcon("lock.png");
		ImageIcon lockedbuilding2 = new ImageIcon("lock.png");
		ImageIcon lockedbuilding3 = new ImageIcon("lock.png");
		
		labelbg.setIcon(bg);
	    labelbg.setBounds(0,0,800,800);
	    
		Count_label.setText(String.valueOf(sum_resources));
	    Count_label.setForeground(Color.WHITE);
	    Count_label.setFont(new Font("MV Boli",Font.BOLD,30));
	    Count_label.setVerticalAlignment(JLabel.TOP);
	    Count_label.setHorizontalAlignment(JLabel.RIGHT);
		Count_label.setBounds(0,0,780,180);

	    Image modifiedbaseimg1 = base.getImage().getScaledInstance(450, 400, java.awt.Image.SCALE_SMOOTH);
	    base = new ImageIcon(modifiedbaseimg1);
        bbase = new JButton(base);
        bbase.setBounds(50,250,200,250);
        bbase.setBorderPainted(false);
        bbase.setContentAreaFilled(false);
        bbase.setFocusPainted(false);
        bbase.setOpaque(false);
        bbase.addMouseListener(click_b);
		
	    Image modifiedbaseimg2 = resources.getImage().getScaledInstance(550, 380, java.awt.Image.SCALE_SMOOTH);
	    resources = new ImageIcon(modifiedbaseimg2);
	    br = new JButton(resources);
	    br.setBounds(500,90,270,170);
	    br.setBorderPainted(false);
	    br.setContentAreaFilled(false);
	    br.setFocusPainted(false);
	    br.setOpaque(false);
	    br.addMouseListener(click_r);
	    
	    panel.setBackground(Color.BLUE);
	    panel.setBounds(0,600,800,160);
	    //panel.setLayout(new FlowLayout(FlowLayout.LEFT));
	    //panel.setLayout(new BorderLayout());
	    //panel.setPreferredSize(new Dimension(100,160));
	    Image modifiedbaseimg3 = units.getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
	    units = new ImageIcon(modifiedbaseimg3);
	    labelu.setIcon(units);
	    
	    labelp.setIcon(lockedbuilding1);
	    labelock1.setIcon(lockedbuilding2);
	    labelock2.setIcon(lockedbuilding3);
	 
        panel.add(labelu);
        panel.add(Box.createHorizontalStrut(70));
        panel.add(labelp);    
        panel.add(Box.createHorizontalStrut(70));
	    panel.add(labelock1);
	    panel.add(Box.createHorizontalStrut(70));
	    panel.add(labelock2);
	    panel.setVisible(false);
	    
	    
	    exp = new JButton(explored);
	    exp.setBounds(700, 680, 80, 80);
	    exp.setBorderPainted(false);
	    exp.setContentAreaFilled(false);
	    exp.setFocusPainted(false);
	    exp.setOpaque(false);
	    exp.addMouseListener(click_expl);
	    
	    
	    ex = new JButton(exit);
	    ex.setBounds(700, 680, 80, 80);
	    ex.setBorderPainted(false);
	    ex.setContentAreaFilled(false);
	    ex.setFocusPainted(false);
	    ex.setOpaque(false);
	    ex.addMouseListener(click_exit);
	    ex.setVisible(false);
	    
	    //first set of components
	    gamepanel1.add(exp);
	    gamepanel1.add(ex);
	    gamepanel1.add(panel);
	    gamepanel1.add(Count_label);
	    gamepanel1.add(br);
	    gamepanel1.add(bbase);
	    gamepanel1.add(labelbg);
	    gamepanel1.setLayout(null);
	    
	    //Add first set of components
	    cardPanel.add(gamepanel1);
	    
	    //second set of components 
	    explore d = new explore();
	    gamepanel2.add(explore.buttonrun);
	    gamepanel2.add(explore.buttonhit);
	    gamepanel2.add(explore.unitlb);
	    gamepanel2.add(explore.monsterlb);
	    gamepanel2.add(explore.bg);
	    gamepanel2.setLayout(null); 
	    explore.unitlb.setBounds(350, 10, 420, 400);
	    explore.bg.setBounds(0, 0, 800, 800);
	    explore.monsterlb.setBounds(10, 410, 500, 400);
	    explore.buttonhit.setBounds(60, 100, 100, 50);
	    explore.buttonrun.setBounds(180, 100, 100, 50);
	    
	    //Add second set of components
	    cardPanel.add(gamepanel2);
	    
	    //The Window
	    frame.setTitle("ATLANTIDA 0.1-test");
	    frame.setSize(800,800);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
		cardPanel.setBounds(0,0,800,800);
		frame.add(cardPanel);
	
		frame.setLayout(null);
        
        frame .setVisible(true);
	    
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
			br.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	};
	
	MouseListener click_b = new MouseListener() {

		@Override
		public void mouseClicked(MouseEvent e) {
			panel.setVisible(true);
			exp.setVisible(false);
			ex.setVisible(true);
			
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
			bbase.setCursor(new Cursor(Cursor.HAND_CURSOR));
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	
	};
	public static void switch_the_scene() {
		CardLayout cl = (CardLayout) (cardPanel.getLayout());
		cl.next(cardPanel);
		Frame.check_for_loss();
	}
	
	MouseListener click_expl = new MouseListener() {

		@Override
		public void mouseClicked(MouseEvent e) {
			switch_the_scene();
			explore.showMonster();
			
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
			exp.setCursor(new Cursor(Cursor.HAND_CURSOR));
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	};
	
	MouseListener click_exit = new MouseListener() {

		@Override
		public void mouseClicked(MouseEvent e) {
			panel.setVisible(false);
			exp.setVisible(true);
			ex.setVisible(false);
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
			ex.setCursor(new Cursor(Cursor.HAND_CURSOR));
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	};
	
	public void resources() {
		
		sum_resources +=10;
		Count_label.setText(String.valueOf(sum_resources));
	}
	
	static void check_for_loss() {
		
		if (sum_resources == 0) {
			showMessageDialog(null, "You lost the GAME!");
			reset();
			Frame.frame.dispose();
		    
			new Menu();
			
			
		}
	}
	
	public static void reset() {
		Count_label.setText(String.valueOf(sum_resources=1000));
	}
	
}

