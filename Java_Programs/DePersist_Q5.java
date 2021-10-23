//Q5.2:-Now write the code for deserialization.

    import java.io.*;
    class DePersist_Q5{
     public static void main(String args[])throws Exception{
      ObjectInputStream in=new ObjectInputStream(new FileInputStream("f://iofiles3//stu_Q5.txt"));
      Student s=(Student)in.readObject();
      System.out.println(s.id+" "+s.name+" "+s.age);
      in.close();
     }
    }
