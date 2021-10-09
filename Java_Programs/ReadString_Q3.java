//Java Console Example

    import java.io.Console;  
    class ReadString_Q3{    
    public static void main(String args[]){    
    Console c=System.console();    
    System.out.println("Enter your name: ");    
    String n=c.readLine();    
    System.out.println("Welcome "+n);    
    }    
    }  
