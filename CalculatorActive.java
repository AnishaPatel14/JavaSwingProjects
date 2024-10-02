import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorActive extends Frame implements ActionListener{
	
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2,b3,b4,b5,b6;
	
	
	public CalculatorActive(){
		
		setSize(600,400);
		setTitle("My Calculator");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		l1 = new Label("Number 1:     ");
		l2 = new Label("Number 2:     ");
		l3 = new Label("Result:       ");
		
		t1 = new TextField(20);
		t2 = new TextField(20);
		t3 = new TextField(20);
		
		b1 = new Button("Add");
		b2 = new Button("Sub");
		b3 = new Button("Multiply");
		b4 = new Button("Div");
		b5 = new Button("Reset");
		b6 = new Button("Close");
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		//System.out.println("Inside ActionPerformed");
		
		double a=0, b=0, c=0;
		
		try {
			a = Double.parseDouble(t1.getText());
		} catch (NumberFormatException e) {
			t1.setText("only numbers are allowed");
		}
		
		try {
			b = Double.parseDouble(t2.getText());
		} catch (NumberFormatException e) {
			t2.setText("only numbers are allowed");
		}
		
		if(ae.getSource() == b1) {
			c = a+b;
			t3.setText(String.valueOf(c));
		}
		if(ae.getSource() == b2) {
			c = a-b;
			t3.setText(String.valueOf(c));
		}
		if(ae.getSource() == b3) {
			c = a*b;
			t3.setText(String.valueOf(c));
		}
		if(ae.getSource() == b4) {
			c = a/b;
			t3.setText(String.valueOf(c));
		}
		if(ae.getSource() == b5) {
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
		if(ae.getSource() == b6) {
			System.exit(0);
		}
		
		
		
	}


	public static void main(String[] args) {
		CalculatorActive clc = new CalculatorActive();
		clc.setVisible(true);
		clc.setLocation(300,400);
	}

	
}

