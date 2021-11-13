//3-Example of event handling by Annonymous class
import java.awt.*;
import java.awt.event.*;

class EventHandling_Q3 extends Frame
{
	TextField tf;
	EventHandling_Q3()
	{
		tf=new TextField();
		tf.setBounds(80,50,140,25);
		add(tf);

		Button b1=new Button("Click");
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

		setLayout(null);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String arg[])
	{
		new EventHandling_Q3();
	}
}