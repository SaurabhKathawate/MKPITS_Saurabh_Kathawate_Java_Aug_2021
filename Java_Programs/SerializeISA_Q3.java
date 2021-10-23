//Java Serialization with Inheritance (IS-A Relationship)

//If a class implements Serializable interface then all its sub classes will also be serializable. Let's see the example given below:
	import java.io.*;
    import java.io.Serializable;
    class Person implements Serializable{
     int id;
     String name;
     Person(int id, String name) {
      this.id = id;
      this.name = name;
     }
    }
    class Student extends Person{
     String course;
     int fee;
     public Student(int id, String name, String course, int fee) {
      super(id,name);
      this.course=course;
      this.fee=fee;
     }
    }
    public class SerializeISA_Q3
    {
     public static void main(String args[])
     {
        try{
      //Creating the object
      Student s1 =new Student(211,"ravi","Engineering",50000);
      //Creating stream and writing the object
      FileOutputStream fout=new FileOutputStream("f://iofiles3//stu_Q3.txt");
      ObjectOutputStream out=new ObjectOutputStream(fout);
      out.writeObject(s1);
      out.flush();
      //closing the stream
      out.close();
      System.out.println("success");
      }catch(Exception e){System.out.println(e);}
      try{
      //Creating stream to read the object
      ObjectInputStream in=new ObjectInputStream(new FileInputStream("f://iofiles3//stu_Q3.txt"));
      Student s=(Student)in.readObject();
      //printing the data of the serialized object
      System.out.println(s.id+" "+s.name+" "+s.course+" "+s.fee);
      //closing the stream
      in.close();
      }catch(Exception e){System.out.println(e);}
     }
    }
