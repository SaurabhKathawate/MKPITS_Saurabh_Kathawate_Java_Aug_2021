import java.awt.*;
import java.awt.event.*;

class Radio_Q2 extends Frame
{
	Label l,l1,l2,l3,l4,l5;
	Checkbox r1,r2,r3,r4,r5,r6,r7,r8,r9,r10;
	CheckboxGroup cbg1,cbg2,cbg3,cbg4,cbg5;
	Button b1;
	Radio_Q2()
	{
		l1=new Label("Q1- Capital of India is ?");
		l1.setBounds(10,50,200,25);
		add(l1);
		cbg1=new CheckboxGroup();
		r1=new Checkbox("Delhi",cbg1,false);
		r1.setBounds(50,70,100,25);
		add(r1);
		r2=new Checkbox("Mumbai",cbg1,false);
		r2.setBounds(150,70,100,25);
		add(r2);

		l2=new Label("Q2- Capital of Maharashtra ?");
		l2.setBounds(10,100,200,25);
		add(l2);
		cbg2=new CheckboxGroup();
		r3=new Checkbox("Delhi",cbg2,false);
		r3.setBounds(50,120,100,25);
		add(r3);
		r4=new Checkbox("Mumbai",cbg2,false);
		r4.setBounds(150,120,100,25);
		add(r4);

		l3=new Label("Q3- What is 5 + 2");
		l3.setBounds(10,150,200,25);
		add(l3);
		cbg3=new CheckboxGroup();
		r5=new Checkbox("7",cbg3,false);
		r5.setBounds(50,170,100,25);
		add(r5);
		r6=new Checkbox("10",cbg3,false);
		r6.setBounds(150,170,100,25);
		add(r6);

		l4=new Label("Q4- Apples and Oranges are");
		l4.setBounds(10,200,200,25);
		add(l4);
		cbg4=new CheckboxGroup();
		r7=new Checkbox("Fruits",cbg4,false);
		r7.setBounds(50,220,100,25);
		add(r7);
		r8=new Checkbox("Vegetables",cbg4,false);
		r8.setBounds(150,220,100,25);
		add(r8);

		l5=new Label("Q5- Eiffel Tower located");
		l5.setBounds(10,250,200,25);
		add(l5);
		cbg5=new CheckboxGroup();
		r9=new Checkbox("London",cbg5,false);
		r9.setBounds(50,270,100,25);
		add(r9);
		r10=new Checkbox("Paris",cbg5,false);
		r10.setBounds(150,270,100,25);
		add(r10);

		l=new Label("Result:");
		l.setBounds(10,450,250,25);
		add(l);
		b1=new Button("Submit");
		b1.setBounds(150,400,100,25);
		add(b1);
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				int total=0;
				if(r1.getState()==true)
					{total=total+1;}
				if(r4.getState()==true)
					{total=total+1;}
				if(r5.getState()==true)
					{total=total+1;}
				if(r7.getState()==true)
					{total=total+1;}
				if(r10.getState()==true)
					{total=total+1;}
				l.setText("Result: Your Score out of 5 is "+total);
			}
		}
		);
		setTitle("Demo Test");
		setLayout(null);
		setSize(400,500);
		setVisible(true);
	}
	public static void main(String arg[])
	{
		new Radio_Q2();
	}
}