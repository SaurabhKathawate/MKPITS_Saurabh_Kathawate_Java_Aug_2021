//The object of Scrollbar class is used to add horizontal and vertical scrollbar. Scrollbar is a GUI component allows us to see invisible number of rows and columns.

    import java.awt.*;  
    class Scrollbar_Q1{  
    Scrollbar_Q1(){  
                Frame f= new Frame("Scrollbar Example");  
                Scrollbar s=new Scrollbar();  
                s.setBounds(100,100, 50,100);  
                f.add(s);  
                f.setSize(400,400);  
                f.setLayout(null);  
                f.setVisible(true);  
    }  
    public static void main(String args[]){  
           new Scrollbar_Q1();  
    }  
    }  
