//example of multilevel inheritance
//create a person class, then create a student class inherited from person class, then create a parttimestudent class inherited from student class

//creating parent class Person
class Person
{
	String name;
	String add;
	void insertperson(String name,String add)
	{
		this.name=name;
		this.add=add;
	}
	void displayperson()
	{
		System.out.println("Name: "+name);
		System.out.println("Address:"+add);
	}
}
class Student extends Person
{
	int rno;
	int marks;
	void insertstudent(int rno,int marks)
	{
		this.rno=rno;
		this.marks=marks;
	}
	void displaystudent()
	{
		System.out.println("Roll Number: "+rno);
		System.out.println("Marks Obtained: "+marks);
	}
}
class PartTimeStudent extends Student
{
	int hours;
	void insertparttimestudent(int hours)
	{
		this.hours=hours;
	}
	void displayparttimestudent()
	{System.out.println("Working Hours: "+hours);}
}

class Multi_Inher3
{
	public static void main(String arg [])
	{
		//creating a object of child class parttimeemployee
		PartTimeStudent p=new PartTimeStudent();
		p.insertperson("Saurabh","Nagpur");
		p.insertstudent(11,90);
		p.insertparttimestudent(4);
		p.displayperson();
		p.displaystudent();
		p.displayparttimestudent();
	}
}