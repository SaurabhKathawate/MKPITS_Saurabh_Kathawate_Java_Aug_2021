//We can also write all the codes of creating JFrame, JButton and method call inside the java constructor.

import javax.swing.*;
import java.awt.event.*;

class Swing_Q2
{
	JFrame jf;
	JButton b1;
	Swing_Q2()
	{
		jf=new JFrame();
		jf.setTitle("Swing_Q2");
		jf.setLayout(null);
		jf.setSize(400,400);
		jf.setVisible(true);

		b1=new JButton("Save");
		b1.setBounds(130,100,100,25);
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				System.out.println("Hello from save Button");
			}
		});
		jf.add(b1);
	}
		public static void main(String arg[])
		{
			new Swing_Q2();
		}
}