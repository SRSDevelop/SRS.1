import javax.swing.JButton;
import javax.swing.JFrame;

public class MainLogin {
	
	JFrame login1;
	JButton driverButton;
	JButton riderButton;
	JButton createButton;
	
	MainLogin(){
		
		login1 = new JFrame("Login page");
		login1.setLayout(null);
		login1.setSize(500, 600);
		login1.setLocation(200, 100);

		driverButton = new JButton("Driver Login");
		driverButton.setSize(150, 50);
		driverButton.setLocation(10, 10);

		riderButton = new JButton("Rider Login");
		riderButton.setSize(150, 50);
		riderButton.setLocation(10, 60);

		createButton = new JButton("Create New User");
		createButton.setSize(150, 50);
		createButton.setLocation(10, 110);
		
		this.create();
		
	}
	
	
	private void create(){
	login1.add(driverButton);
	login1.add(riderButton);
	login1.add(createButton);
	login1.show();
	}

}
