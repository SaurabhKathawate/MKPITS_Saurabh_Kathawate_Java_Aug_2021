//wap to accept a num and print whether it is prime no. or not.
import java.awt.*;
import java.awt.event.*;
class Event_Q8 extends Frame implements ActionListener
{
	Label l1,l2;
	TextField t1;
	Button b1;
	Event_Q8()
	{
		l1=new Label("Enter Number");
		l1.setBounds(50,50,100,25);
		add(l1);
		t1=new TextField();
		t1.setBounds(150,50,75,25);
		add(t1);
		b1=new Button("Check");
		b1.addActionListener(this);
		b1.setBounds(100,100,75,25);
		add(b1);
		setLayout(null);
		setSize(300,300);
		setVisible(true);
		l2=new Label("Result");
		l2.setBounds(50,150,150,25);
		add(l2);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int num=Integer.parseInt(t1.getText());
		int i;
			for(i=2;num>i;i++)
			{
				if(num % i == 0)
				{
					l2.setText("Result: "+num+" is not Prime no");
					break;
				}
			}
			if(num == i)
			{
				l2.setText("Result: "+num+" is Prime no");
			}
	}
	public static void main(String arg[])
	{
		Event_Q8 f=new Event_Q8();
	}
}