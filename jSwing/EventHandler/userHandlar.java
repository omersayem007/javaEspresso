package EventHandler;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Gui.*;


public class userHandlar implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		Login ref = Login.getRef();

		String User = ref.user.getText();
		String Password =ref.password.getPassword();
		
		System.out.println(User);
		System.out.println(Password);
		
		
	}

}
