import javax.swing.*;
import java.awt.*;
public class elevator extends JFrame {
    Panel p1,p2,p3,p4,p5,p6;
    JLabel l1,l2,l3,l4,l5,l6;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13;
    elevator(){
        /*JPanel p1=new JPanel();
        p1.setBounds(40,80,120,400);
        p1.setBackground(Color.MAGENTA);

        JPanel p2=new JPanel();
        p2.setBounds(190,90,120,340);
        p2.setBackground(Color.gray);*/

        l3=new JLabel();
        l3.setText("5");
        l3.setBounds(100,125,30,30);
        add(l3);
        JPanel p3=new JPanel();
        p3.setBounds(50,90,100,100);
        p3.setBackground(Color.gray);

        l4=new JLabel();
        l4.setText("^");
        l4.setBounds(100,225,30,30);
        add(l4);
        JPanel p4=new JPanel();
        p4.setBounds(50,192,100,100);
        p4.setBackground(Color.darkGray);

        l5=new JLabel();
        l5.setText("FAN ON");
        l5.setBounds(80,300,80,80);
        add(l5);
        JPanel p5=new JPanel();
        p5.setBounds(50,295,100,100);
        p5.setBackground(Color.gray);

        b1=new JButton("1");
        b1.setBounds(200,90,45,45);
        add(b1);
        b2=new JButton("2");
        b2.setBounds(255,90,45,45);
        add(b2);

        b3=new JButton("3");
        b3.setBounds(200,155,45,45);
        add(b3);
        b4=new JButton("4");
        b4.setBounds(255,155,45,45);
        add(b4);

        b5=new JButton("5");
        b5.setBounds(200,220,45,45);
        add(b5);
        b6=new JButton("6");
        b6.setBounds(255,220,45,45);
        add(b6);

        b7=new JButton("L");
        b7.setBounds(200,285,45,45);
        add(b7);
        b8=new JButton("F");
        b8.setBounds(255,285,45,45);
        add(b8);

        b9=new JButton("O");
        b9.setBounds(200,350,45,45);
        add(b9);
        b10=new JButton("C");
        b10.setBounds(255,350,45,45);
        add(b10);

        /*b11=new JButton("5");
        b11.setBounds(50,90,100,100);
        f.add(b11);

        b12=new JButton("^");
        b12.setBounds(50,210,100,100);
        f.add(b12);

        b13=new JButton("FAN ON" +
                "LIGHT ON" +
                "DOOR OPEN");
        b13.setBounds(50,330,100,100);
        f.add(b13);*/


        //f.add(p1);
        //add(p2);
        add(p3);
        add(p4);
        add(p5);
        setTitle("Elevator");
        setSize(350,550);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String arg []){
        new elevator();
    }
}
