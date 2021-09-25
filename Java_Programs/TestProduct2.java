//create a read-only class Book having getter methods
class Product
{
	private int id=789;
	private String name="Lenovo";

	//creating getter method
	public int getId()
	{return id;}

	public String getName()
	{return name;}
}

class TestProduct2
{
	public static void main(String arg[])
	{
		Product p=new Product();
		System.out.println("Product ID: "+p.getId());
		System.out.println("Product Name: "+p.getName());
	}
}