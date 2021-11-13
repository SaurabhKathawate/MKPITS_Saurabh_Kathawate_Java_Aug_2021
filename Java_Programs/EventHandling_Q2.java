//2-Example of event handling by other class
import java.awt.*;
import java.awt.event.*;

class EventHandling_Q2 extends Frame
{
	TextField tf;
	EventHandling_Q2()
	{
		tf=new TextField();
		tf.setBounds(100,50,100,25);
		add(tf);

		Button b1=new Button("Click");
		//b1.addActionListener(this);
		Outer o=new Outer(this);         //creating instance
		b1.addActionListener(o);         //reg button(other class)
		b1.setBounds(100,100,100,25);
		add(b1);

		setLayout(null);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String arg[])
	{
		new EventHandling_Q2();
	}
}
///////////////////////////////////////////
class Outer implements ActionListener
{
	EventHandling_Q2 eh;
	Outer(EventHandling_Q2 eh)           // constructor
	{
		this.eh=eh;
	}
	public void actionPerformed(ActionEvent ae)
	{
		eh.tf.setText("by other class");
	}
}