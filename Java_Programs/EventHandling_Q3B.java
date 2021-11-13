//accept 2 no. from the user and display the additon of 2 no.
//3-Example of event handling by Annonymous class

import java.awt.*;
import java.awt.event.*;
public class EventHandling_Q3B extends  Frame
{
    EventHandling_Q3B()
    {
        Label l1=new Label("num1");
        l1.setBounds(50,50,100,25);
        add(l1);
        TextField t1=new TextField();
        t1.setBounds(200,50,100,25);
        add(t1);

        Label l2=new Label("num2");
        l2.setBounds(50,100,100,25);
        add(l2);
        TextField t2=new TextField();
        t2.setBounds(200,100,100,25);
        add(t2);

        Label l3=new Label("Result");
        l3.setBounds(50,150,100,25);
        add(l3);
        TextField t3=new TextField();
        t3.setBounds(200,150,100,25);
        add(t3);

        Button b1=new Button("addition");
        b1.setBounds(100,200,100,25);
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //String str1 = t1.getText();
                double fn = Double.parseDouble(t1.getText());
                double sn = Double.parseDouble(t2.getText());

                t3.setText("Sum is " + (fn+sn));
            }
        }
        );
        add(b1);

        setSize(400,400);
        setTitle("calculator");
        setLayout(null);
        setVisible(true);
    }
    public  static  void main(String[] arg)
    {
        new EventHandling_Q3B();
    }
}
