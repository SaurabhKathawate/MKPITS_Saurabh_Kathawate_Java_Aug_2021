//Employee has an object of Address, address object contains its own information's such as city, state, country etc. In such case relationship is Employee HAS-A address.
//by accepting values from the user.

class Address
{
	String city;
	String state;
	String country;
	Address(String city,String state, String country)
	{
		this.city=city;
		this.state=state;
		this.country=country;
	}
}

class Employee
{
	String empname;
	Address address;
	Employee(String empname, Address address)
	{
		this.empname=empname;
		this.address=address;
	}
	void display()
	{
		System.out.println("Employee Name: "+empname);
		System.out.println("City: "+address.city);
		System.out.println("State: "+address.state);
		System.out.println("Country: "+address.country);
	}
}

class Employee_Aggr
{
	public static void main(String arg[])
	{
		Address adr=new Address("Nagpur","Maharashtra","India");
		Employee emp=new Employee("Saurabh",adr);
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("Enter Employee Name: ");
		String empname=scan.next();
		//System.out.println("Enter City: ");
		//String address.city=scan.next();
		//System.out.println("Enter State: ");
		//String address.state=scan.next();
		//System.out.println("Enter Country: ");
		//String address.country=scan.next();
		emp.display();
	}
}