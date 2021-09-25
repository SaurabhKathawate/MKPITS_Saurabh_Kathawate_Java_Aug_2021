//another example of single inhertance
//create  a class person and then create a child class employee

//creating parent class Person
class Person
{
	float salary;
	void insertperson(float salary)
	{this.salary=salary;}
	void displayperson()
	{System.out.println("Salary: "+salary);}
}
class Employee extends Person
{
	float bonus;
	void insertemployee(float bonus)
	{this.bonus=bonus;}
	void displayemployee()
	{System.out.println("Bonus: "+bonus);}
}

class TestEmployeeInh
{
	public static void main(String arg[])
	{
		//creating a object of child class Employee
		Employee e=new Employee();
		e.insertperson(49999.9f);
		e.insertemployee(4999.9f);
		e.displayperson();
		e.displayemployee();
	}
}
