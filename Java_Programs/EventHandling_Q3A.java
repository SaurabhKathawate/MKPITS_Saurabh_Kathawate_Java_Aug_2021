//3-Example of event handling by Annonymous class
import java.awt.*;
import java.awt.event.*;

class EventHandling_Q3A extends Frame
{
	TextField tf;
	Button b1, b2;
	EventHandling_Q3A()
	{
		tf=new TextField();
		tf.setBounds(80,50,140,25);
		add(tf);

		b1=new Button("Click");
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				tf.setText("Annonymous class");
			}
		}
		);
		b1.setBounds(100,100,100,25);
		add(b1);

		b2=new Button("Clear");
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				tf.setText(" ");
			}
		}
		);
		b2.setBounds(100,150,100,25);
		add(b2);

		setLayout(null);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String arg[])
	{
		new EventHandling_Q3A();
	}
}