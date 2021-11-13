//example of checkbox to do additon and substraction of 2 no.

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Checkbox_Q3
{
    Checkbox_Q3()
    {
        Frame f= new Frame("Checkbox Example");
        Label l1 = new Label();
        l1.setBounds(100,200,300,20);
        f.add(l1);
        Label l2 = new Label();
        l2.setBounds(100,250,300,20);
        f.add(l2);
        TextField t1=new TextField();
        t1.setBounds(10,50,100,20);
        f.add(t1);
        TextField t2=new TextField();
        t2.setBounds(110,50,100,20);
        f.add(t2);

        Checkbox c1 = new Checkbox("add");
        c1.setBounds(100,100,50,50);
        f.add(c1);
        Checkbox c2 = new Checkbox("substract", true);
        c2.setBounds(100,150,100,50);
        f.add(c2);

        Button b1=new Button("result");
        b1.setBounds(10,300,100,50);
        b1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                l1.setText("");
                l2.setText("");
                int n1=Integer.parseInt(t1.getText());
                int n2=Integer.parseInt(t2.getText());
                int res=0;
                StringBuilder sb=new StringBuilder();
                if(c1.getState()==true)
                {
                    res=n1+n2;
                    sb.append("add is " + res );
                }
                if(c2.getState()==true)
                {
                    res=n1-n2;
                    sb.append("sub is " + res);
                }
                l1.setText(sb.toString());
                l2.setText(sb.toString());
            }
        });
		f.add(b1);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args)
    {
        new Checkbox_Q3();
    }
}