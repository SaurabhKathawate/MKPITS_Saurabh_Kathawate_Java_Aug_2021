//wap to accept a number and print factorial of number
import java.awt.*;
import java.awt.event.*;

class Event_Q7 extends Frame implements ActionListener
{
	Label l1,l2;
	TextField t1;
	Button b1;
	Event_Q7()
	{
		l1=new Label("Enter Number");
		l1.setBounds(100,50,100,25);
		add(l1);

		t1=new TextField();
		t1.setBounds(250,50,100,25);
		add(t1);

		l2=new Label("Result: ");
		l2.setBounds(100,150,200,25);
		add(l2);

		b1=new Button("Ok");
		//register the button component with the listener
		b1.addActionListener(this);
		b1.setBounds(200,100,100,25);
		add(b1);
		setLayout(null);
		setSize(500,500);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int num =Integer.parseInt(t1.getText());
		int fact=1;

			if(ae.getSource()==b1)
				{
					for(int i=num;i>0;i--)
					{
						fact=fact*i;
					}
				}
		l2.setText("Result: Factorial is "+fact);
	}
	public static void main(String arg[])
	{
		Event_Q7 f=new Event_Q7();
	}
}