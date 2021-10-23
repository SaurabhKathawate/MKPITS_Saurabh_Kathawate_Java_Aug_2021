//wap to accept a number and print square of the number.

import java.awt.*;
import java.awt.event.*;

//for button event action listener interface is Actionlistener
class Event_Q2 extends Frame implements ActionListener
{
	Label l1,l2;
	TextField t1;
	Button b1;

	Event_Q2(){
		l1=new Label("Enter Number");
		l1.setBounds(100,50,100,25);
		add(l1);

		t1=new TextField();
		t1.setBounds(250,50,100,25);
		add(t1);



		Button b1=new Button("Ok");
		//register the button component with the listener
		b1.addActionListener(this);
		b1.setBounds(200,100,100,25);
		add(b1);
		setLayout(null);
		setSize(500,500);
		setVisible(true);

		l2=new Label("Result: ");
				l2.setBounds(100,150,200,25);
		add(l2);
	}

	////implementation of Actionlistener interface method actionperformed
	public void actionPerformed(ActionEvent ae){
		int num1=Integer.parseInt(t1.getText());
		int sq=num1 * num1;
		l2.setText("Result: Square of the Number is "+sq);
	}

	public static void main(String arg[]){
		Event_Q2 f=new Event_Q2();
	}
}