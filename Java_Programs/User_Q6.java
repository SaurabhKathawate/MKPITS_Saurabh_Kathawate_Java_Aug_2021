//Example for accepting student details from user using Scanner class.
import java.io.*;
import java.util.*;
     class Student implements Serializable{
     int id;
     String name;
     transient int age;//Now it will not be serialized
     public Student(int id, String name,int age) {
      this.id = id;
      this.name = name;
      this.age=age;
     }
    }
    class User_Q6{
     public static void main(String args[])throws Exception{
		 Scanner scan=new Scanner(System.in);
		 System.out.println("enter student id ");
		 int id=scan.nextInt();
		  System.out.println("enter student name ");
		 String name=scan.next();
		  System.out.println("enter student age ");
		 int age=scan.nextInt();

      Student s1 =new Student(id,name,age);//creating object
      //writing object into file
      FileOutputStream f=new FileOutputStream("f://iofiles3//user_Q6.txt");
      ObjectOutputStream out=new ObjectOutputStream(f);
      out.writeObject(s1);
      out.flush();
      out.close();
      f.close();
      System.out.println("success");

      FileInputStream fos=new FileInputStream("f://iofiles3//user_Q6.txt");
	  		ObjectInputStream oos=new ObjectInputStream(fos);
	  	Student s11=(Student)oos.readObject(); //deserialization
	  	fos.close();
	  	System.out.println("id " + s11.id);
	  		System.out.println("name " + s11.name);
		System.out.println("age " + s11.age);


     }
    }

