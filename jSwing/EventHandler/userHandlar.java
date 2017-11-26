package EventHandler;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Gui.*;


public class userHandlar implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		Login ob = Login.getRef();
		
		System.out.println( ob.user.getText() ) ;
		
        System.out.println(ob.password.getText());
		
	}

}
