package JavaSwing;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Registration extends JFrame implements ActionListener{
	JLabel l,l1,l2,l3,l4,l5,l6,lbl;
	JTextField t1 ,t2;
	JRadioButton r1,r2,r3;
	ButtonGroup bg;
	JComboBox c1,c2,c3;
	JTextArea ta1, ta2;
	JCheckBox terms;
	JButton b1;
	
	Registration(){
		setTitle("Registration form");
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//set background of the frame
		getContentPane().setBackground(Color.LIGHT_GRAY);
		
		l = new JLabel("Registration Form");
		l.setSize(200,30);
		l.setLocation(300, 10);
		Font f = new Font("arial", Font.BOLD, 20);
		l.setFont(f);
		
		l1 = new JLabel("Name ");
		l1.setSize(200,30);
		l1.setLocation(50, 70);
		
		//text field 1 for name
		t1 = new JTextField(20);
		t1.setSize(200,30);
		t1.setLocation(200, 70);
		
		l2 = new JLabel("Contact no. ");
		l2.setSize(200,30);
		l2.setLocation(50, 120);
		
		//text field 2 for contact no
		t2 = new JTextField(20);
		t2.setSize(200,30);
		t2.setLocation(200, 120);
		
		l3 = new JLabel("Gender ");
		l3.setSize(200,30);
		l3.setLocation(50, 170);
		
		bg = new ButtonGroup();  // button group
		
		// radio buttons for gender
		r1 = new JRadioButton("Female");
		r1.setSize(200,40);
		r1.setLocation(200, 170);
		
		r2 = new JRadioButton("Male");
		r2.setSize(200,40);
		r2.setLocation(200, 200);
		//r2.setForeground(Color.BLACK);
		
		r3 = new JRadioButton("Other");
		r3.setSize(200,40);
		r3.setLocation(200, 230);
		
		
		//add radio button to the group for single selection
		
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		
		
		l4 = new JLabel("DOB ");
		l4.setSize(200,30);
		l4.setLocation(50, 300);
		
		String date[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		c1 = new JComboBox(date);
		c1.setSize(50,30);
		c1.setLocation(200, 300);
		
		String month[] = {"Jan","feb","march","april","may","june","july","august","sep","oct","nov","dec"};
		c2 = new JComboBox(month);
		c2.setSize(70,30);
		c2.setLocation(270, 300);
		
		String year[] = {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"};
		c3 = new JComboBox(year);
		c3.setSize(70,30);
		c3.setLocation(370, 300);
		
		
		l5 = new JLabel("Address ");
		l5.setSize(200,30);
		l5.setLocation(50, 350);
		
		ta1 = new JTextArea(20,25);
		ta1.setSize(300,70);
		ta1.setLocation(200, 350);
		ta1.setLineWrap(true);
		
		//term condition check box
		terms = new JCheckBox("*Please Accept term and conditons");
		terms.setSize(225,30);
		terms.setLocation(100, 450);
		
		//submit button 
		b1 = new JButton("Submit");
		b1.setSize(100,30);
		b1.setLocation(150, 525);
		b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		
		//label for screen
		l6 = new JLabel("Output Screen");
		l6.setSize(200,30);
		l6.setLocation(530, 70);
		
		//screen to show details
		ta2 = new JTextArea(120,200);
		ta2.setSize(300,200);
		ta2.setLocation(530,120);
		ta2.setLineWrap(true);
		
		// label for successful registration
		Font f1 = new Font("arial", Font.BOLD, 15);
		lbl = new JLabel();
		lbl.setSize(350,30);
		lbl.setLocation(100, 580);
		lbl.setFont(f1);
		
		
		add(l);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(r1);
		add(r2);
		add(r3);
		add(l4);
		add(c1);
		add(c2);
		add(c3);
		add(l5);
		add(ta1);
		add(terms);
		add(b1);
		add(l6);
		add(ta2);
		add(lbl);
		
		b1.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {
		if(terms.isSelected()==true) {
			
			//get all data from the form
			String name = t1.getText();
			String contact = t2.getText();
			String gender = "Other";
			if(r1.isSelected()) gender = "Female";
			else if(r2.isSelected()) gender = "Male";
			
			String dob = c1.getSelectedItem() + " - " + c2.getSelectedItem() + " - " + c3.getSelectedItem();
			String address = ta1.getText();
			
			//display all data to screen
			ta2.setText("\t*****Details*****\n"+"\n Name : " + name+"\n Contact no. : " + contact+"\n Gender : " + gender+"\n DOB. : " + dob+"\n Address : " + address);
			
			//set message for registration successful
			lbl.setText("Registration Successful");
		}
		else {
			lbl.setText("Accept terms & condition to submit");
			ta2.setText("");
		}
		
	}
}

public class RegistrationForm {
	public static void main(String[] args) {
		Registration r = new Registration();
		r.setSize(900,670);
		r.setLocation(100,100);
		r.setVisible(true);	
	}

}
