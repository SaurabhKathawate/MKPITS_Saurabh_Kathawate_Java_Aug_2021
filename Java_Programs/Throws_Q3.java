//Java throws example

//Let's see the example of java throws clause which describes that checked exceptions can be propagated by throws keyword.

import java.io.IOException;
    class Throws_Q3{
      void m()throws IOException{
        throw new IOException("device error");//checked exception
      }
      void n()throws IOException{
        m();
      }
      void p(){
       try{
        n();
       }catch(Exception e){System.out.println("exception handled");}
      }
      public static void main(String args[]){
       Throws_Q3 obj=new Throws_Q3();
       obj.p();
       System.out.println("normal flow...");
      }
    }
