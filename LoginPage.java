package JavaSwing;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage extends JFrame implements ActionListener{
	
	JLabel lbl,l1,l2;
	JTextField t1;
	JPasswordField t2;
	JButton b, close;
	
	LoginPage(){
		setTitle("Login Page");
		setLayout(null);
		setSize(600,600);
		
		lbl = new JLabel("Login Form");
		lbl.setSize(200,40);
		lbl.setLocation(250,20);
		Font f = new Font("arial", Font.BOLD, 19);
		lbl.setFont(f);
		
		l1 = new JLabel("Username");
		l1.setSize(100,30);
		l1.setLocation(200,90);
		
		l2 = new JLabel("Password");
		l2.setSize(100,30);
		l2.setLocation(200,150);
		
		t1 = new JTextField(20);
		t1.setSize(200,30);
		t1.setLocation(300,90);
		
		t2 = new JPasswordField(20);
		t2.setSize(200,30);
		t2.setLocation(300,150);
		
		b = new JButton("Login");
		b.setSize(100,30);
		b.setLocation(200,230);
		
		close = new JButton("Close");
		close.setSize(100,30);
		close.setLocation(350,230);
		
		
		add(lbl);
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

