import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Swing extends Frame //implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	JTextField t1;
	JCheckBox cb1,cb2;
	JButton b1;
	JRadioButton r1,r2;
	ButtonGroup bg;
	JComboBox jcb;
	Swing()
	{
		l1=new JLabel("Registrstion Form");
		l1.setBounds(125,50,150,25);
		add(l1);
		l2=new JLabel("Username");
		l2.setBounds(50,100,200,25);
		add(l2);
		t1=new JTextField();
		t1.setBounds(150,100,180,25);
		add(t1);
		l3=new JLabel("Hobby");
		l3.setBounds(50,150,100,25);
		add(l3);
		cb1=new JCheckBox("Cricket");
		cb1.setBounds(150,150,80,25);
		add(cb1);
		cb2=new JCheckBox("Music");
		cb2.setBounds(250,150,80,25);
		add(cb2);
		l6=new JLabel("Gender");
		l6.setBounds(50,200,80,25);
		add(l6);
		r1=new JRadioButton("Male");
		r1.setBounds(150,200,80,25);
		add(r1);
		r2=new JRadioButton("Female");
		r2.setBounds(250,200,80,25);
		add(r2);
		bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);

		//Java Combobox
		l8=new JLabel("City");
		l8.setBounds(50,250,80,25);
		add(l8);
		String ct[]={"Banglore", "Chennai", "Delhi", "Mumbai", "Nagpur"};
		jcb=new JComboBox(ct);
		jcb.setBounds(150,250,100,25);
		add(jcb);


		b1=new JButton("Register");
		b1.setBounds(140,500,100,25);
		add(b1);
		l4=new JLabel("Username : ");
		l4.setBounds(50,550,100,25);
		add(l4);

		setTitle("MKPITS");
		setLayout(null);
		setSize(400,700);
		setVisible(true);

		//public void actionPerformed(ActionEvent ae)
		//{
			l4.setText("Username : "+t1.getText());
		//}
	}

	public static void main(String[] args)
	{
		new Swing();
	}
}