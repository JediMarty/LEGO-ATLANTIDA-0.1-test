package pack;

import java.awt.Color;
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
    JButton PlayButton = new JButton();
	JButton OptionButton = new JButton();
	JButton QuitButton = new JButton();
	
	public Menu() {
		init();
	}
	
	public void init() {
		
		ImageIcon bg = new ImageIcon("darkrain.jpg");
		ImageIcon play = new ImageIcon("play_button2.png");
		ImageIcon selectedplay= new ImageIcon("play_button1.png");
		ImageIcon options = new ImageIcon("op_button2.png");
		ImageIcon selectedoptions = new ImageIcon("op_button1.png");
		ImageIcon quit = new ImageIcon("quit_button2.png");
		ImageIcon selectedquit = new ImageIcon("quit_button1.png");
		JLabel labelbg = new JLabel();
		labelbg.setIcon(bg);
		labelbg.setBounds(0,0,800,800);
		
		PlayButton.setIcon(play);
	    PlayButton.setBorderPainted(false);
		PlayButton.setBounds(235, 250, 400, 100);
		PlayButton.setContentAreaFilled(false);
		PlayButton.setFocusPainted(false);
		PlayButton.setOpaque(false);
		PlayButton.addActionListener(this);
	    PlayButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		OptionButton.setIcon(options);
		OptionButton.setBorderPainted(false);
		OptionButton.setBounds(235, 450, 400, 100);
		OptionButton.setContentAreaFilled(false);
		OptionButton.setFocusPainted(false);
		OptionButton.setOpaque(false);
		OptionButton.addActionListener(this);
		OptionButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		QuitButton.setIcon(quit);
		QuitButton.setBorderPainted(false);
		QuitButton.setBounds(235, 650, 400, 100);
		QuitButton.setContentAreaFilled(false);
		QuitButton.setFocusPainted(false);
		QuitButton.setOpaque(false);
		QuitButton.addActionListener(this);
	    QuitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
	
		
        framemenu.setTitle("ATLANTIDA 0.1-test");
		framemenu.setSize(800,800);
		framemenu.setResizable(false);
		framemenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
		framemenu.add(PlayButton);
		framemenu.add(OptionButton);
		framemenu.add(QuitButton);
		framemenu.add(labelbg);
		framemenu.setLayout(null);
		framemenu.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if (e.getSource() == PlayButton) {
	     
			Menu.framemenu.dispose();
			new Frame();
		}
		
	}
	
}
