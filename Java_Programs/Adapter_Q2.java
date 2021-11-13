import java.awt.*;
import java.awt.event.*;

class Adapter_Q2 extends Frame
{
	Label l1;
	TextField t1;
	Adapter_Q2()
	{
		setTitle("Adapter_Q2");
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
		Adapter_Q2 ad1=new Adapter_Q2();
	}
}
class keyadapter extends KeyAdapter
{
	Adapter_Q2 ad2;
	keyadapter(Adapter_Q2 ad2)
	{
		this.ad2=ad2;
	}
	public void keyTyped(KeyEvent ke)
	{
		System.out.println("Key Typed" );
		char c = ke.getKeyChar();
		System.out.println("char typed " + c);
		ad2.l1.setText(ad2.t1.getText());
	}
}