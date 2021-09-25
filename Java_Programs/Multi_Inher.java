//example of multilevel inheritance
//create a class person, then create a class employee inherited from person class, then create a class parttimeemployee inherited from employee class

//creating parent class Person
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
class Employee extends Person
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

class PartTimeEmployee extends Employee
{
	int hours;
	void insertparttimeemployeedata(int hours)
	{
		this.hours=hours;
	}
	void displayparttimeemployeedata()
	{
		System.out.println("hours " + hours);
	}
}
class Multi_Inher
{
	public static void main(String[] arg)
	{
		//creating object of child class parttimeemployee
		PartTimeEmployee s1=new PartTimeEmployee();
		s1.insertpersondata("amit","nagpur");
		s1.insertemployeedata(121,9999);
		s1.insertparttimeemployeedata(4);
		s1.displaypersondata();
		s1.displayemployeedata();
		s1.displayparttimeemployeedata();
	}
}
