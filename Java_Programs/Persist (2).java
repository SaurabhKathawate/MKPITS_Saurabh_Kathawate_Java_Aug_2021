//2-Example of Java Serialization

    import java.io.*;
    class Persist{
     public static void main(String args[]){
      try{
      //Creating the object
      Student s1 =new Student(211,"ravi");
      //Creating stream and writing the object
      FileOutputStream fout=new FileOutputStream("f://iofiles3//stu_Q2.txt");
      ObjectOutputStream out=new ObjectOutputStream(fout);
      out.writeObject(s1);
      out.flush();
      //closing the stream
      out.close();
      System.out.println("success");
      }catch(Exception e){System.out.println(e);}
     }
    }
