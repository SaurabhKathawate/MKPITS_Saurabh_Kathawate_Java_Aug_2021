//Exception can be handled in any method in call stack either in main() method,p() method,n() method or m() method.
//Rule: By default, Checked Exceptions are not forwarded in calling chain (propagated).
//Program which describes that checked exceptions are not propagated

    class Throws_Exception_Q5{  
      void m(){  
        throw new java.io.IOException("device error");//checked exception  
      }  
      void n(){  
        m();  
      }  
      void p(){  
       try{  
        n();  
       }catch(Exception e){System.out.println("exception handeled");}  
      }  
      public static void main(String args[]){  
       Throws_Exception_Q5 obj=new Throws_Exception_Q5();  
       obj.p();  
       System.out.println("normal flow");  
      }  
    }  
