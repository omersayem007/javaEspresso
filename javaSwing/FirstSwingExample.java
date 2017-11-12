import javax.swing.*;

public class FirstSwingExample{

public static  void main(String [] args){
	
	int  xCordinate =50;
    int yCordinate =100;
	
	JFrame frame =new JFrame();
	
	JTextField name,phone,email; 
	
	JLabel nameField,phoneField,emailFeild;  
    
	//-------------------------------  name -----------------------------------//
    nameField=new JLabel("name");  
    nameField.setBounds(xCordinate-40,yCordinate, 100,30);
    name=new JTextField("Your number ");  
    name.setBounds(xCordinate,yCordinate, 200,30); 
		
	
    //--------------------------- phone ----------------------------//
	phoneField=new JLabel("phone");  
    phoneField.setBounds(xCordinate-40,yCordinate+40, 100,30);
    phone=new JTextField("valid phone no ");  
    phone.setBounds(xCordinate,yCordinate+40, 200,30); 
	
	
	//---------------------------- Email ------------------------//
	emailFeild=new JLabel("email");  
    emailFeild.setBounds(xCordinate-40,yCordinate+80, 100,30);
	email=new JTextField("Email acoount "); 
	email.setBounds(xCordinate,yCordinate+80, 200,30);
	
	
	//---------------------------- Button ------------------------//
	JButton saveButton =new JButton("save");  
    saveButton.setBounds(xCordinate,yCordinate+150,95,30);
	
    JButton deleteButton =new JButton("delete");  
    deleteButton.setBounds(xCordinate+100,yCordinate+150,95,30);


    frame.add(nameField);
    frame.add(phoneField);
    frame.add(emailFeild);	
	
	
    frame.add(saveButton); 
    frame.add(deleteButton); 	

	
    frame.add(name); 
	frame.add(phone); 
	frame.add(email);
	
	
	frame.setSize(500,500);
	frame.setTitle("My Contact");
	frame.setLayout(null);
	frame.setVisible(true);

}

}
