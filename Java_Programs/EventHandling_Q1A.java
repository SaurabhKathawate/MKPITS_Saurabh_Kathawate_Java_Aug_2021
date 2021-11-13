//1-Example of event handling within class
import java.awt.*;
import java.awt.event.*;
public class EventHandling_Q1A extends  Frame implements  ActionListener
{
    TextField tf;
    Button b1,b2;
    EventHandling_Q1A()
    {
        tf=new TextField();
        tf.setBounds(125,50,100,50);
        b1=new Button("Enter");
        b1.setBounds(50,150,100,50);
        b1.addActionListener(this);
        b2=new Button("Clear");
        b2.setBounds(200,150,100,50);
        b2.addActionListener(this);
        add(tf);
        add(b1);
        add(b2);
        setTitle("event example");
        setLayout(null);
        setSize(350,350);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == b1)
        tf.setText("Saurabh");

        if(ae.getSource() == b2)
		tf.setText("");
    }
    public static void main(String[] arg) {
        new EventHandling_Q1A();
    }
}
