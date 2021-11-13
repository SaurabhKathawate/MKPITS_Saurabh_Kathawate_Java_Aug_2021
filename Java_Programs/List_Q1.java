//The object of List class represents a list of text items. By the help of list, user can choose either one item or multiple items. It inherits Component class.

	import java.awt.*;
    public class List_Q1
    {
         List_Q1(){
            Frame f= new Frame();
            List l1=new List(5);
            l1.setBounds(100,100, 75,75);
            l1.add("Item 1");
            l1.add("Item 2");
            l1.add("Item 3");
            l1.add("Item 4");
            l1.add("Item 5");
            f.add(l1);
            f.setSize(400,400);
            f.setLayout(null);
            f.setVisible(true);
         }
    public static void main(String args[])
    {
       new List_Q1();
    }
    }
