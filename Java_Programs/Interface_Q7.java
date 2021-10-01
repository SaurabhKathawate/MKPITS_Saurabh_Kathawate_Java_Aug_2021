    interface Printable{  
    void print();  
    }  
    interface Showable{  
    void show();  
    }  
    class Interface_Q7 implements Printable,Showable{  
    public void print(){System.out.println("Hello");}  
    public void show(){System.out.println("Welcome");}  
      
    public static void main(String args[]){  
    Interface_Q7 obj = new Interface_Q7();  
    obj.print();  
    obj.show();  
     }  
    }  
