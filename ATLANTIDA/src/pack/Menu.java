package pack;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Menu implements ActionListener{

	public static JFrame framemenu = new JFrame();
	public static int x = 0;
	JButton PlayButton = new JButton();
	
	public Menu() {
		init();
	}
	
	public void init() {
		
		ImageIcon bg = new ImageIcon("darkrain.jpg");
		JLabel labelbg = new JLabel();
		labelbg.setIcon(bg);
		labelbg.setBounds(0,0,800,800);
		
		PlayButton.setText("PLAY");
		PlayButton.setFocusable(false);
		PlayButton.setFont(new Font("MV Boli",Font.BOLD,30));
		PlayButton.setBounds(260, 250, 300, 100);
		PlayButton.addActionListener(this);
		PlayButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
	    framemenu.setTitle("ATLANTIDA 0.1-test");
		framemenu.setSize(800,800);
		framemenu.setResizable(false);
		framemenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
		framemenu.add(PlayButton);
		framemenu.add(labelbg);
		framemenu.setLayout(null);
		framemenu.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == PlayButton) {
			x = 1;
			Menu.framemenu.dispose();
			new Frame();
		}
		
	}
	
}
