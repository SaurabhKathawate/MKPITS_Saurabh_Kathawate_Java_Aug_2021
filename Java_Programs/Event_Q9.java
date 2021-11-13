//wap to accept a no. and print table of that number.
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Event_Q9 extends Frame implements ActionListener
{
	Label l1;
	TextField tf;
	Button b1;
	TextArea ta;
	Event_Q9()
	{
		l1=new Label("Enter Number");
		l1.setBounds(20,50,100,25);
		add(l1);
		tf=new TextField();
		tf.setBounds(130,50,100,25);
		add(tf);
		b1=new Button("Table");
		b1.setBounds(130,100,100,25);
		//register the button component with the listener
		b1.addActionListener(this);
		add(b1);
		ta=new TextArea(30,30);
		ta.setBounds(130,150,100,175);
		add(ta);
		setLayout(null);
		setSize(350,400);
		setVisible(true);
	}
	//implementation of actionlistener interface method actionperformed
		public void actionPerformed(ActionEvent ae)
		{
			int num=Integer.parseInt(tf.getText());
			int res=0;
			StringBuilder sb=new StringBuilder();
			if(ae.getSource() == b1)
			{
				for(int i=1;i<=10;i++)
				{
					res = num * i;
					sb.append(num + " * " + i + "=" + res + "\n");
				}
				ta.setText(sb.toString());
			}
		}
	public static void main(String[] arg)
	{
		Event_Q9 f=new Event_Q9();
	}
}
