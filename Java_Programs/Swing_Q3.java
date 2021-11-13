//We can also inherit the JFrame class, so there is no need to create the instance of JFrame class explicitly.

import javax.swing.*;
import java.awt.event.*;

class Swing_Q3 extends JFrame
{
	JButton b1;
	Swing_Q3()
	{
		setTitle("Swing_Q3");
		setLayout(null);
		setSize(400,400);
		setVisible(true);

		b1=new JButton("Save");
		b1.setBounds(130,100,100,25);
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				System.out.println("Hello from save Button");
			}
		});
		add(b1);
	}
		public static void main(String arg[])
		{
			new Swing_Q3();
		}
}