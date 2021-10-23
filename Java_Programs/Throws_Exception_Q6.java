 class Throws_Exception_Q6{
      void m(){
		  try
		  {
        throw new java.io.IOException("device error");//checked exception
	}catch(Exception ee)
	{
		System.out.println(ee);
	}
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
       Throws_Exception_Q6 obj=new Throws_Exception_Q6();
       obj.p();
       System.out.println("normal flow");
      }
    }
