//Q4-Java Serialization with Aggregation (HAS-A Relationship)

import java.io.*;
 class Address implements Serializable{
     String addressLine,city,state;
     public Address(String addressLine, String city, String state) {
      this.addressLine=addressLine;
      this.city=city;
      this.state=state;
     }
    }

  class Student implements Serializable{
     int id;
     String name;
     Address address;//HAS-A
     public Student(int id, String name,Address address) {
      this.id = id;
      this.name = name;
      this.address=address;
     }
     public static void main(String[] arg) {
	 		try
	 		{
				Address addr=new Address("gandhichowk","nagpur","maharastra");
	 		Student s1=new Student(123,"amit",addr);
	 		FileOutputStream fos=new FileOutputStream("f://iofiles3//stu_Q4.txt");
	 		ObjectOutputStream oos=new ObjectOutputStream(fos);
	 		oos.writeObject(s1); //serialization
	 		oos.flush();
	 		fos.close();
	 		System.out.println("success");
	 	}
	 	catch(Exception ee)
	 	{
	 		System.out.println(ee.toString() );
	 	}


	 	try
				{

				FileInputStream fos=new FileInputStream("f://iofiles3//stu_Q4.txt");
				ObjectInputStream oos=new ObjectInputStream(fos);
			Student s1=(Student)oos.readObject(); //deserialization

				fos.close();
				System.out.println("student id " + s1.id);
				System.out.println("student name " + s1.name);
				System.out.println("city " + s1.address.city);
					System.out.println("state " + s1.address.state);
			}
			catch(Exception ee)
			{
				System.out.println(ee.toString() );
	}
	}
    }