//another example of single inheritance
//create a parent class Product and then create a child class Employee

//creating parent class Product
class Product
{
	int id;
	void insertproduct(int id)
	{this.id=id;}
	void displayproduct()
	{
		System.out.println("Product ID: "+id);
	}
}
class Employee extends Product
{
	String name;
	String add;
	void insertemployee(String name, String add)
	{
		this.name=name;
		this.add=add;
	}
	void displayemployee()
	{
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Address: "+add);
	}
}

class TestProductInh
{
	public static void main(String arg[])
	{
		//creating a object of child class Employee
		Employee e=new Employee();
		e.insertproduct(12);
		e.insertemployee("Saurabh","Nagpur");
		e.displayproduct();
		e.displayemployee();
	}

}