//Program of Exception Propagation

    class Throws_Exception_Q2{  
      void m(){  
        int data=50/0;  
      }  
      void n(){  
        m();  
      }  
      void p(){  
       try{  
        n();  
       }catch(Exception e){System.out.println("exception handled");}  
      }  
      public static void main(String args[]){  
       Throws_Exception_Q2 obj=new Throws_Exception_Q2();  
       obj.p();  
       System.out.println("normal flow...");  
      }  
    } 
