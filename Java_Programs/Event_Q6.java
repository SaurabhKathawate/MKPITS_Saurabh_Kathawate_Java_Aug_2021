//wap to accept 3 subject marks and display total, percentage and grade;
import java.awt.*;
import java.awt.event.*;

class Event_Q6 extends Frame implements ActionListener
{
	Label l1,l2,l3,l4,l5,l6;
	TextField t1,t2,t3;
	Button b1;
	Event_Q6()
	{
		l1=new Label("Subject 1");
		l1.setBounds(50,50,75,25);
		add(l1);

		t1=new TextField();
		t1.setBounds(150,50,75,25);
		add(t1);

		l2=new Label("Subject 2");
		l2.setBounds(50,100,75,25);
		add(l2);

		t2=new TextField();
		t2.setBounds(150,100,75,25);
		add(t2);

		l3=new Label("Subject 3");
		l3.setBounds(50,150,75,25);
		add(l3);

		t3=new TextField();
		t3.setBounds(150,150,75,25);
		add(t3);

		b1=new Button("Result");
		b1.addActionListener(this);
		b1.setBounds(150,200,75,25);
		add(b1);
		setLayout(null);
		setSize(375,400);
		setVisible(true);

		l4=new Label("Total");
		l4.setBounds(150,250,75,25);
		add(l4);
		l5=new Label("Percentage");
		l5.setBounds(150,300,125,25);
		add(l5);
		l6=new Label("Grade");
		l6.setBounds(150,350,75,25);
		add(l6);
	}

	public void actionPerformed(ActionEvent ae)
	{
		int s1=Integer.parseInt(t1.getText());
		int s2=Integer.parseInt(t2.getText());
		int s3=Integer.parseInt(t3.getText());

		int total=0;
		float per=0;
		String grade=null;

		if(ae.getSource()==b1)
		{
			total=s1+s2+s3;
			per=(float) (total/3.0f);
			if(per>=35) {grade="Pass";}
			else {grade="Fail";}
		}
		l4.setText("Total: "+total);
		l5.setText("Percentage : " + per);
		l6.setText("Grade : " + grade);

	}

	public static void main(String arg[])
	{
		Event_Q6 f=new Event_Q6();
	}
}

