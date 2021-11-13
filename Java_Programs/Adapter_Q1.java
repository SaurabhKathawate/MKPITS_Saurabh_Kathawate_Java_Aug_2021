import java.awt.*;
import java.awt.event.*;

class Adapter_Q1 extends Frame
{
	Label l1;
	TextField t1;
	Adapter_Q1()
	{
		setTitle("Adapter_Q1");
		setLayout(null);
		setSize(400,400);
		setVisible(true);

		l1=new Label("MKPITS");
		l1.setBounds(10,50,250,25);
		add(l1);
		t1=new TextField();
		t1.setBounds(10,120,250,25);
		add(t1);
		t1.addKeyListener(new keyadapter(this));
	}
	public static void main(String arg[])
	{
		Adapter_Q1 ad1=new Adapter_Q1();
	}
}
class keyadapter extends KeyAdapter
{
	Adapter_Q1 ad2;
	keyadapter(Adapter_Q1 ad2)
	{
		this.ad2=ad2;
	}
	public void keyTyped(KeyEvent ke)
	{
		System.out.println("Key Typed" );
	}
}