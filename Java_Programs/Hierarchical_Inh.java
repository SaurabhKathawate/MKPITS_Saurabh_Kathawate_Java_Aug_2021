//Hierarchical Inheritance Example
//create a parent class person having common fields name,address and methods
//create a child class student inherited from person class having additional fields rno, marks and methods
//create a child class employee inherited from person class having additional fields empno, salary and methods.

//creating parent class person
class person
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
class student extends person
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

//creating inherited class employee
class employee extends person
{
	int empno;
	int salary;
	void insertemployeedata(int empno,int salary)
	{
		this.empno=empno;
		this.salary=salary;
	}
	void displayemployeedata()
	{
		System.out.println("empno " + empno);
		System.out.println("salary " + salary);
	}
}

class Hierarchical_Inh
{
	public static void main(String arg[])
	{
		//creating a object of child class Employee
		System.out.println("----enter employee details----");
		employee s1=new employee();
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("enter empname");
		String empname=scan.next();
		System.out.println("enter emp address ");
		String empaddress=scan.next();
		s1.insertpersondata(empname,empaddress);
		System.out.println("enter empno");
		int empno=scan.nextInt();
		System.out.println("enter emp salary");
		int salary=scan.nextInt();
		s1.insertemployeedata(empno,salary);
		s1.displaypersondata();
		s1.displayemployeedata();

		//creating a object of child class student
		System.out.println("----enter student details----");
		student s2=new student();
		System.out.println("enter student name");
		String sname=scan.next();
		System.out.println("enter student address ");
		String saddress=scan.next();
		s2.insertpersondata(sname,saddress);
		System.out.println("enter rno");
		int rno=scan.nextInt();
		System.out.println("enter marks");
		int marks=scan.nextInt();
		s2.insertstudentdata(rno,marks);
		s2.displaypersondata();
		s2.displaystudentdata();
	}
}
