//create a class Product having private fields id and name and methods(setter and getter methods) setId(),setName and getId() and getName();
class Product
{
	private int id;
	private String name;

	//creating setter and getter methods
	public void setId(int id)
	{this.id=id;}

	public int getId()
	{return id;}

	public void setName(String name)
	{this.name=name;}

	public String getName()
	{return name;}
}

class TestProduct
{
	public static void main(String arg[])
	{
		Product p=new Product();
		p.setId(123);
		System.out.println("Product ID: "+p.getId());
		p.setName("Laptop");
		System.out.println("Product Name: "+p.getName());
	}
}