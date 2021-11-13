//Toolkit class is the abstract superclass of every implementation in the Abstract Window Toolkit. Subclasses of Toolkit are used to bind various components. It inherits Object class.

    import java.awt.*;  
    public class Toolkit_Q1{  
      public static void main(String[] args) {  
          Toolkit t = Toolkit.getDefaultToolkit();  
          System.out.println("Screen resolution = " + t.getScreenResolution());  
          Dimension d = t.getScreenSize();  
          System.out.println("Screen width = " + d.width);  
          System.out.println("Screen height = " + d.height);  
      }  
    }  
