package pack;

public class Main{

	public static void main(String[] args) {
		while(Menu.x != 1) {
		
			new Menu();		
		}

	    Menu.framemenu.dispose();
	
     while(Frame.x != true) {
    	 
    	 new Frame();
	    	
     }
		Frame.frame.dispose();
		new explore();
	}

}

