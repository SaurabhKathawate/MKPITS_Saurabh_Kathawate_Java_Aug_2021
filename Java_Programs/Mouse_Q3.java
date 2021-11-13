import java.awt.*;
import java.awt.event.*;

class Mouse_Q3 extends Frame
{
	Mouse_Q3()
	{
		addMouseMotionListener(new mymouseadapter(this));
		setTitle("Mouse_Q1");
		setLayout(null);
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String arg[])
	{
		Mouse_Q3 m=new Mouse_Q3();
	}
}
//creating adapter class
class mymouseadapter extends MouseMotionAdapter
{
	Mouse_Q3 m1;
	mymouseadapter(Mouse_Q3 m1)
	{
		this.m1=m1;
	}
	public void mouseMoved(MouseEvent me)
	{
		System.out.println("x: "+me.getX()+" y: "+me.getY());
	}
}