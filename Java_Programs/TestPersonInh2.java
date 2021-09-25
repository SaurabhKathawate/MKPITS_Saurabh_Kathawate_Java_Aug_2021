//another example of single inheritance
//create a parent class person and then create a child class student

//creating parent class person
class Person
{
	String name;
	String address;
	void insertpersondata(String name,String address)
	{
		this.name=name;
		this.address=address;
	}
	void displaypersondata()
	{
		System.out.println("name " + name);
		System.out.println("address " + address);
	}
}
//creating inherited class student
class Student extends Person
{
	int rno;
	int marks;
	void insertstudentdata(int rno,int marks)
	{
		this.rno=rno;
		this.marks=marks;
	}
	void displaystudentdata()
	{
		System.out.println("rno " + rno);
		System.out.println("marks " + marks);
	}
}

class TestPersonInh2
{
	public static void main(String[] arg)
	{
		//creating object of child class student
		Student s1=new Student();
		s1.insertpersondata("amit","nagpur");
		s1.insertstudentdata(12,99);
		s1.displaypersondata();
		s1.displaystudentdata();
	}
}
