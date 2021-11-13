//Java AWT Checkbox Example

import java.awt.*;
class Checkbox_Q1
{
	Checkbox_Q1()
	{
		Frame f=new Frame();
		Checkbox c1=new Checkbox("C++",true);
		c1.setBounds(50,50,50,25);
		f.add(c1);

		Checkbox c2=new Checkbox("Java",true);
		c2.setBounds(50,100,50,25);
		f.add(c2);

		f.setTitle("Checkbox");
		f.setLayout(null);
		f.setSize(300,300);
		f.setVisible(true);
	}
	public static void main(String arg[])
	{
		new Checkbox_Q1();
	}
}