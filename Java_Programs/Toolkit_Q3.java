    import java.awt.*;   
    class Toolkit_Q3 {   
    Toolkit_Q3(){   
    Frame f=new Frame();   
    Image icon = Toolkit.getDefaultToolkit().getImage("D:\\icon.png");  
    f.setIconImage(icon);  
    f.setLayout(null);   
    f.setSize(400,400);   
    f.setVisible(true);   
    }   
    public static void main(String args[]){   
    new Toolkit_Q3();   
    }   
    }  
