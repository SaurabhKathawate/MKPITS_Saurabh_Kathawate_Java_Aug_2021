//wap to accept 2 no. and print addition of 2 no.

import java.awt.*;
import java.awt.event.*;

class Event_Q3 extends Frame implements ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2;
	Button b1;

	Event_Q3()
	{
		l1=new Label("Enter Number 1");
		l1.setBounds(100,50,100,25);
		add(l1);

		t1=new TextField();
		t1.setBounds(220,50,100,25);
		add(t1);

		l2=new Label("Enter Number 2");
		l2.setBounds(100,100,100,25);
		add(l2);

		t2=new TextField();
		t2.setBounds(220,100,100,25);
		add(t2);

		b1=new Button("Enter");
		b1.addActionListener(this);
		b1.setBounds(200,150,100,25);
		add(b1);
		setLayout(null);
		setSize(500,500);
		setVisible(true);

		l3=new Label("Result");
		l3.setBounds(100,200,250,25);
		add(l3);
	}

	public void actionPerformed(ActionEvent ae)
	{
		int num1=Integer.parseInt(t1.getText());
		int num2=Integer.parseInt(t2.getText());
		int res=num1 + num2;
		l3.setText("Result :- Addition of two Numbers is "+res);
	}

	public static void main(String arg[])
	{
		Event_Q3 f=new Event_Q3();
	}
}