//Case2: You declare the exception

//B)In case you declare the exception if exception occures, an exception will be thrown at runtime because throws does not handle the exception.

//B)Program if exception occurs

    import java.io.*;  
    class M{  
     void method()throws IOException{  
      throw new IOException("device error");  
     }  
    }  
    class Throws_Q6{  
       public static void main(String args[])throws IOException{//declare exception  
         M m=new M();  
         m.method();  
      
        System.out.println("normal flow...");  
      }  
    } 
