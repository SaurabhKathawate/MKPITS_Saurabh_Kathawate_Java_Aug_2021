//AWT CheckboxGroup Class Declaration
import java.awt.*;
import java.awt.event.*;
class Radio_Q1 extends Frame
{
	Checkbox r1,r2;
	CheckboxGroup cbg;
	Label l1,l2;
	Button b1;
	Radio_Q1()
	{
		l1=new Label("Select Gender");
		l1.setBounds(10,50,100,50);
		add(l1);

		l2=new Label("Details");
		l2.setBounds(10,200,200,50);
		add(l2);

		cbg=new CheckboxGroup();

		r1=new Checkbox("Male",cbg,false);
		r1.setBounds(100,100,100,20);
		add(r1);

		r2=new Checkbox("Female",cbg,false);
		r2.setBounds(200,100,100,20);
		add(r2);

		b1=new Button("Ok");
		b1.setBounds(150,150,100,25);
		add(b1);
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(r1.getState()==true)
					l2.setText("Gender Selected: Male");
				else if(r2.getState()==true)
					l2.setText("Gender Selected: Female");
			}
		}
		);

		setLayout(null);
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String arg[])
	{
		new Radio_Q1();
	}
}