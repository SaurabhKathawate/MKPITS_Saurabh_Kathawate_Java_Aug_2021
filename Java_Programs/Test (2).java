class Employee
{
	//we have not created constructor in this class
	int empno;
	void insert(int e)
	{
		empno=e;
	}
}

class Test
{
	public static void main(String arg[])
	{
		//Every time an object is created using the new() keyword, at least one constructor is called.
		Employee emp=new Employee();//It calls a default constructor if there is no constructor available in the class
		emp.insert(100); // calling insert method
	}
}
