//create a person class and then create a child class customer having fields custno,gstno.
class Person
{
	String name;
}
//creating inherited class student
class Customer extends Person
{
	long custno;
	long gstno;
}

class TestPersonInh1
{
	public static void main(String arg[])
	{
		//creating object of child class customer
		Customer c=new Customer();
		c.name="Amit";
		c.custno=20211308336L;
		c.gstno=479190785380L;
		System.out.println("Customer Name: "+c.name);
		System.out.println("Customer Number: "+c.custno);
		System.out.println("Customer GST Number: "+c.gstno);
	}
}