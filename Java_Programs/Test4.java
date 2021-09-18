//Example of parameterized constructor
class Employee
{
	int empno;
	String name;
	//creating constructor(Default constructor (no-arg constructor))
	public Employee()
	{
		//System.out.println("default constructor called");
		empno=123;
		name="ranjan";
	}
	//creating parameterized constructor
	public Employee(int e,String n)
	{
		empno=e;
		name=n;
	}
	//creating method display
	public void display()
	{
		System.out.println("Empno " + empno); //123
		System.out.println("Empname " + name); //ranjan
	}
}

class Test4
{
	public static void main(String arg[])
	{
		//Every time an object is created using the new() keyword, at least one constructor is called.
		Employee emp=new Employee();// this will call default constructor automatically
		emp.display(); //
		Employee emp1=new Employee(111,"arjun shastri");//this will call parameterized construtor
		emp1.display();
	}
}
