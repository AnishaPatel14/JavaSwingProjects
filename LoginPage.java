package JavaSwing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage extends JFrame implements ActionListener{
	
	JLabel l1,l2;
	JTextField t1;
	JPasswordField t2;
	JButton b, close;
	
	LoginPage(){
		setTitle("Login Page");
		setLayout(new FlowLayout());
		setSize(600,600);
		l1 = new JLabel("Username");
		l2 = new JLabel("Password");
		t1 = new JTextField(20);
		t2 = new JPasswordField(10);
		b = new JButton("Login");
		close = new JButton("Close");
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b);
		add(close);
		
		b.addActionListener(this);
		close.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b) {
			System.out.println("Username = "+ t1.getText());
			System.out.println("Password = "+ t2.getText());
		}
		if(e.getSource() == close) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		LoginPage l = new LoginPage();
		l.setVisible(true);
		l.setLocation(300,300);
	}

	

}
