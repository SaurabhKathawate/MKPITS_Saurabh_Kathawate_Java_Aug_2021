//Let's see a simple swing example where we are creating one button and adding it on the JFrame object inside the main() method.

import javax.swing.*;
import java.awt.event.*;

class Swing_Q1
{
	public static void main(String arg[])
	{
		JFrame jf=new JFrame("MKPITS");

		jf.setTitle("Swing_Q1");
		jf.setLayout(null);
		jf.setSize(400,400);
		jf.setVisible(true);

		JButton b1= new JButton("Save");
		b1.setBounds(130,100,100,25);
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				System.out.println("Heloo from save button");
			}
		});
		jf.add(b1);

	}
}
