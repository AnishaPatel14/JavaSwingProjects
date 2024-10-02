import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class SimpleIntrestCalculator extends Frame{
	
	Label l1,l2,l3,l4;
	TextField t1,t2,t3,t4;
	Button b1,b2,b3;
	
	public SimpleIntrestCalculator(){
		
		l1 = new Label("Priciple Amount :     ");
		l2 = new Label("Rate :     ");
		l3 = new Label("Time Duration :     ");
		l4 = new Label("Simple Intrest :     ");
		
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
		
		setSize(700,400);
		setTitle("SI Calculator");

		setLayout(new FlowLayout()); // align center
		
	}
	

	public static void main(String[] args) {
		
		SimpleIntrestCalculator s = new SimpleIntrestCalculator();
		s.setVisible(true);
		
	}

}
