//create a parent class person having fields name and address then create a inherited class student having new fields rno and marks
//creating parent class person
class Person
{
	String name;
	String address;
}
//creating inherited class student
class Student extends Person
{
	int rno;
	int marks;
}
class TestPersonInh
{
	public static void main(String arg[])
	{
		//creating object of child class student
		Student s1=new Student();
		s1.rno=12;
		s1.name="amit";
		s1.address="nagpur";
		s1.marks=99;
		System.out.println("rno: " + s1.rno);
		System.out.println("name: " + s1.name);
		System.out.println("address: " + s1.address);
		System.out.println("marks: " + s1.marks);
	}
}
