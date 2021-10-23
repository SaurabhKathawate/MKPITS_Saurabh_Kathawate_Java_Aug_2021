import java.awt.*;
import java.awt.event.*;

//for button event action listener interface is Actionlistener
class Event_Q1 extends Frame implements ActionListener
{
	Event_Q1(){
		Button b1=new Button("Ok");
		//register the button component with the listener
		b1.addActionListener(this);
		b1.setBounds(100,50,100,25);
		add(b1);
		setLayout(null);
		setSize(500,500);
		setVisible(true);
	}

	//implementation of Actionlistener interface method actionperformed
	public void actionPerformed(ActionEvent ae){
		System.out.println("Ok");
	}

	public static void main(String arg[]){
		Event_Q1 f=new Event_Q1();
	}
}