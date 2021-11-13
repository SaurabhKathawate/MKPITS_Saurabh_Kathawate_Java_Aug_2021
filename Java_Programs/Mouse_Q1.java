import java.awt.*;
import java.awt.event.*;

class Mouse_Q1 extends Frame implements MouseListener, MouseMotionListener
{
	Mouse_Q1()
	{
		addMouseListener(this);
		setTitle("Mouse_Q1");
		setLayout(null);
		setSize(300,300);
		setVisible(true);
	}
	public void mouseExited(MouseEvent me)
		{
		}
	public void mouseEntered(MouseEvent me)
		{
		}
	public void mouseReleased(MouseEvent me)
		{
		}
	public void mousePressed(MouseEvent me)
		{
		}
	public void mouseClicked(MouseEvent me)
		{
			System.out.println("Hello");
		}
	public void mouseMoved(MouseEvent me)
		{
		}
	public void mouseDragged(MouseEvent me)
		{
		}
	public static void main(String arg[])
	{
		new Mouse_Q1();
	}
}