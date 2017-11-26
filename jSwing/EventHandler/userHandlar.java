package EventHandler;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Gui.*;
import javax.swing.*;


public class userHandlar implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		Login ref = Login.getRef();

		String User = ref.user.getText();
		String Password =ref.password.getText();

		if( User.equals("") || Password.equals("")){

			System.out.println("nooooooooooooooo");
		}else{
			System.out.println(User);
			System.out.println(Password);
		}
			
		
		
	}

}
