//Java AWT Checkbox Example with ItemListener

import java.awt.*;
import java.awt.event.*;
class Checkbox_Q2
{
	Checkbox_Q2()
	{
		Frame f=new Frame();

		Label l1=new Label();
		l1.setAlignment(l1.CENTER);
		l1.setSize(400,100);
		f.add(l1);

		Checkbox c1=new Checkbox("C++");
		c1.setBounds(100,100,50,50);
		f.add(c1);

		Checkbox c2=new Checkbox("Java",true);
		c2.setBounds(100,150,50,50);
		f.add(c2);

		c1.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e)
			{
				l1.setText("C++ Checkbox: " + (e.getStateChange()==1?"checked":"unchecked"));
		    }
		}
		);
		c2.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e)
			{
				l1.setText("Java Checkbox: " + (e.getStateChange()==1?"checked":"unchecked"));
		    }
		}
		);

		f.setTitle("Checkbox");
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
	}
	public static void main(String arg[])
	{
		new Checkbox_Q2();
	}
}