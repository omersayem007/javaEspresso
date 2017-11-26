
package Gui;

import java.awt.Rectangle;
import javax.swing.*;
import eventHandlers.Panel2EventHandler;

public class Panel2 extends JPanel {
	private JLabel lblNum1;
	public JTextField txtFieldNum1;
	private JButton btnForward;
	private JButton btnBackward;
	
	private static Panel2 ref;

	private Panel2() {
		initilalizeComponents();
	}
	public static Panel2 getRef(){
		if(ref == null)
			ref = new Panel2();
		return ref;
	}
	private void initilalizeComponents() {
		this.setLayout(null);

		this.lblNum1 = new JLabel("Num1:");
		this.lblNum1.setBounds(50, 25, 50, 25);
		this.add(this.lblNum1);

		this.txtFieldNum1 = new JTextField();
		this.txtFieldNum1.setBounds(50 + 50 + 15, 25, 100, 25);
		this.add(this.txtFieldNum1);

		this.btnForward= new JButton("Next");
		Rectangle r = this.txtFieldNum1.getBounds();
		this.btnForward.setBounds((int) r.getX(), (int) r.getY() + 30, 100, 25);
		this.add(this.btnForward);
		
		this.btnBackward= new JButton("Back");
		r.translate(0, 60);
		this.btnBackward.setBounds(r);
		this.add(this.btnBackward);

		this.btnBackward.addActionListener();

	}
}
