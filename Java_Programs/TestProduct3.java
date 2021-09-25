 //create a write-only class Book having setter methods
class Product
{
	private int id;
	private String name;

	// creating setter method
	public void setId(int id)
	{this.id=id;}

	public void setName(String name)
	{this.name=name;}

	void display()
	{
		System.out.println("Product ID: "+id);
		System.out.println("Product Name: "+name);
	}
}

class TestProduct3
{
	public static void main(String arg[])
	{
		Product p=new Product();
		p.setId(78);
		p.setName("Realme");
		p.display();
	}
}