package EventHandler;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Gui.*;


public class clearField implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		 
		 Login ob = Login.getRef();
		 
		 ob.user.setText("");
		 ob.password.setPassword("");
		
	}

}