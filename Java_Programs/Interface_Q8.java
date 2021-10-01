//multiple inheritance is not supported in the case of class because of ambiguity. However, it is supported in case of an interface because there is no ambiguity.
//It is because its implementation is provided by the implementation class. For example:

    interface Printable{  
    void print();  
    }  
    interface Showable{  
    void print();  
    }  
      
    class Interface_Q8 implements Printable, Showable{  
    public void print(){System.out.println("Hello");}  
    public static void main(String args[]){  
    Interface_Q8 obj = new Interface_Q8();  
    obj.print();  
     }  
    }  
