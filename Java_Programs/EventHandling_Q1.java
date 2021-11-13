//1-Example of event handling within class
import java.awt.*;
import java.awt.event.*;

class EventHandling_Q1 extends Frame implements ActionListener
{
	TextField tf;
	EventHandling_Q1()
	{
		tf=new TextField();
		tf.setBounds(100,50,100,25);
		add(tf);

		Button b1=new Button("Click");
		b1.addActionListener(this);
		b1.setBounds(100,100,100,25);
		add(b1);

		setLayout(null);
		setSize(300,300);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		tf.setText("within class");
	}
	public static void main(String arg[])
	{
		new EventHandling_Q1();
	}
}