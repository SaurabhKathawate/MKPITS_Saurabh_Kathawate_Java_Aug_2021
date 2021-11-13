import java.awt.*;
import java.awt.event.*;

class Mouse_Q2 extends Frame
{
	Mouse_Q2()
	{
		addMouseListener(new mymouseadapter(this));
		setTitle("Mouse_Q1");
		setLayout(null);
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String arg[])
	{
		Mouse_Q2 m=new Mouse_Q2();
	}
}
//creating adapter class
class mymouseadapter extends MouseAdapter
{
	Mouse_Q2 m1;
	mymouseadapter(Mouse_Q2 m1)
	{
		this.m1=m1;
	}
	public void mouseClicked(MouseEvent me)
	{
		System.out.println("Hello");
	}
}