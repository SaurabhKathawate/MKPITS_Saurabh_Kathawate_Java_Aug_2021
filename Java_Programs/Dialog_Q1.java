//The Dialog control represents a top level window with a border and a title used to take some form of input from the user. It inherits the Window class.
//Unlike Frame, it doesn't have maximize and minimize buttons.

//Frame vs Dialog
//Frame and Dialog both inherits Window class. Frame has maximize and minimize buttons but Dialog doesn't have.

import java.awt.*;
    import java.awt.event.*;
    public class Dialog_Q1{
        private static Dialog d;
        Dialog_Q1() {
            Frame f= new Frame();
            d = new Dialog(f , "Dialog Example", true);
            d.setLayout( new FlowLayout() );
            Button b = new Button ("OK");
            b.addActionListener ( new ActionListener()
            {
                public void actionPerformed( ActionEvent e )
                {
                    Dialog_Q1.d.setVisible(false);
                }
            });
            d.add( new Label ("Click button to continue."));
            d.add(b);
            d.setSize(300,300);
            d.setVisible(true);
        }
        public static void main(String args[])
        {
            new Dialog_Q1();
        }
    }
