import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SICalcActive extends Frame implements ActionListener{
	
	Label l1,l2,l3,l4;
	TextField t1,t2,t3,t4;
	Button b1,b2,b3;
	
	public SICalcActive(){
		
		setSize(250,500);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		l1 = new Label("Principle");
		l2 = new Label("Rate");
		l3 = new Label("Time");
		l4 = new Label("Simple Intrest");
		
		t1 = new TextField(20);
		t2 = new TextField(20);
		t3 = new TextField(20);
		t4 = new TextField(20);
		
		b1 = new Button("Calculate");
		b2 = new Button("Reset");
		b3 = new Button("Close");
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		add(b1);
		add(b2);
		add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		double p = 0, r = 0, t = 0, si = 0;
		
		try {
			p = Double.parseDouble(t1.getText());
		} catch (NumberFormatException e) {
			t1.setText("Only numbers are allowed");
		}
		
		try {
			r = Double.parseDouble(t2.getText());
		} catch (NumberFormatException e) {
			t2.setText("Only numbers are allowed");
		}
		
		try {
			t = Double.parseDouble(t3.getText());
		} catch (NumberFormatException e) {
			t3.setText("Only numbers are allowed");
		}
		
		if(ae.getSource() == b1) {
			si = (p*r*t)/100;
			t4.setText(String.valueOf(si));
		}
		if(ae.getSource() == b2) {
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
		}
		if(ae.getSource() == b3) {
			System.exit(0);
		}
		
	}

	public static void main(String[] args) {
		SICalcActive si = new SICalcActive();
		si.setVisible(true);
		si.setLocation(400,400);

	}	

}

