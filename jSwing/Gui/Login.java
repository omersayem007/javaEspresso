package Gui;

import java.awt.Rectangle;
import java.awt.event.ActionListener;
import javax.swing.*;
import EventHandler.*;

public class Login extends JPanel {
	private JLabel userLevel;
	private JLabel passwordLevel;
	
  public JTextField user;
	public JTextField password;
	
	public JButton clear;
	public JButton submit;
	private static Login ref;
	
	public Login(){
		initilalizeComponents();
		
	}
  

	public static Login getRef(){
		
		if(ref==null){
			ref = new Login();
		}
		
		return ref;
	}
	
	
	
	

	private void initilalizeComponents() {
		this.setLayout(null);
		
		this.userLevel = new JLabel("user:");
		this.userLevel.setBounds(50, 25, 50, 25);
		this.add(this.userLevel);
		
		this.user = new JTextField();
		this.user.setBounds(50+50+15, 25, 100, 25);
		this.add(this.user);
		
		this.passwordLevel = new JLabel("Password:");
		this.passwordLevel.setBounds(50,25+40,100, 25);
		this.add(this.passwordLevel);
		
		this.password = new JTextField();
		this.password.setBounds(50+50+40,25+40, 100, 25);
		this.add(this.password);

		
		this.clear = new JButton("clear");
		Rectangle r = this.passwordLevel.getBounds();
		this.clear.setBounds((int)r.getX(), (int)r.getY()+50, 100, 25);
		this.add(this.clear);
		
		this.submit = new JButton("submit");
		Rectangle r1 = this.clear.getBounds();
		this.submit.setBounds((int)r1.getX()+120, (int)r.getY()+50, 100, 25);
		this.add(this.submit);
		
		this.clear.addActionListener(new clearField());
		this.submit.addActionListener(new userHandlar());
		
	}

}
