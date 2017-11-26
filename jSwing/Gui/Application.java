package Gui;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Application extends JFrame {
	private static Application ref;
	
	public static Application getRef(){
		if(ref==null)
			ref = new Application();
		return ref;
	}
	
	public Application(){
		ref = this;
		this.add(Login.getRef(), BorderLayout.CENTER);
		this.setBounds(100, 100, 500, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	

}
