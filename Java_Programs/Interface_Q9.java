//A class implements an interface, but one interface extends another interface.

    interface Printable{  
    void print();  
    }  
    interface Showable extends Printable{  
    void show();  
    }  
    class Interface_Q9 implements Showable{  
    public void print(){System.out.println("Hello");}  
    public void show(){System.out.println("Welcome");}  
      
    public static void main(String args[]){  
    Interface_Q9 obj = new Interface_Q9();  
    obj.print();  
    obj.show();  
     }  
    }  
