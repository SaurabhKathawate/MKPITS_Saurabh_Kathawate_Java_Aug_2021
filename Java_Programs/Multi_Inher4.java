//example of multilevel inheritance
//create a person class, then create a student class inherited from person class, then create a parttimestudent class inherited from student class by accepting values from the user

//creating parent class Person
class Person
{
	String name,add;
	void insertperson(String name,String add)
	{
		this.name=name;
		this.add=add;
	}
	void displayperson()
	{
		System.out.println("Name: "+name);
		System.out.println("Address: "+add);
	}
}

class Student extends Person
{
	int rno,marks;
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
	String date;
	void insert(String date)
	{this.date=date;}
	void display()
	{System.out.println("Date of Exam: "+date);}
}

class Multi_Inher4
{
	public static void main(String arg[])
	{
		//creating a object of child class parttimeemployee
		PartTimeStudent p=new PartTimeStudent();
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("Enter Name: ");
		String name=scan.next();
		System.out.println("Enter Address: ");
		String add=scan.next();
		p.insertperson(name,add);

		System.out.println("Enter Roll Number: ");
		int rno=scan.nextInt();
		System.out.println("Enter Marks Obtained: ");
		int marks=scan.nextInt();
		p.insertstudent(rno,marks);

		System.out.println("Date of Exam: ");
		String date=scan.next();
		p.insert(date);

		p.displayperson();
		p.displaystudent();
		p.display();



	}
}