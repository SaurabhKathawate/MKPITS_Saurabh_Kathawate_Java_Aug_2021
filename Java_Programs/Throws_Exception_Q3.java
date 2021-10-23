   //MultipleCatchBlock
   
   public class Throws_Exception_Q3 {

void m(){
        int data=50/0;
      }
      void n(){
        m();
      }
      void p(){

        n();

      }
      public static void main(String args[]){
       Throws_Exception_Q3 obj=new Throws_Exception_Q3();
       try
       {
       obj.p();
        }catch(Exception e){System.out.println("exception handled");}
       System.out.println("normal flow...");
      }
    }
