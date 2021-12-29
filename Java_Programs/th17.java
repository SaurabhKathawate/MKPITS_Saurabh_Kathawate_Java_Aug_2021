import javax.swing.*;
import java.awt.*;

public class th17 {
    Window wob;
    Frame f;
    JButton red,yellow,green;
    th17(){
        f=new Frame();
        wob=new Window(f);
        red=new JButton();
        wob.add(red,BorderLayout.NORTH);
        yellow=new JButton();
        wob.add(yellow,BorderLayout.SOUTH);
        green=new JButton();
        wob.add(green,BorderLayout.EAST);

        wob.setSize(300,400);
        //wob.setLayout(null);       because there is default layout
        wob.setVisible(true);
    }
}
class ThreadEx17{
    public static void main(String[] args) {
        new th17();
    }
}