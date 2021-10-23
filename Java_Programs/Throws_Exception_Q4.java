   //MultipleCatchBlock
   
   //In the above example exception occurs in m() method where it is not handled,so it is propagated to previous n() method where it is not handled,
   //again it is propagated to p() method where exception is handled.
   
       public class Throws_Exception_Q4{
   
   void m(){
   	try
   	{
           int data=50/0;
   	}
   	catch(Exception ee)
   	{
   		System.out.println("exception handled m");
   	}
         }
         void n(){
           m();
         }
         void p(){
   
           n();
   
         }
         public static void main(String args[]){
          Throws_Exception_Q4 obj=new Throws_Exception_Q4();
          try
          {
          obj.p();
           }catch(Exception e){System.out.println("exception handled");}
          System.out.println("normal flow...");
         }
   
   
   
   
       }
