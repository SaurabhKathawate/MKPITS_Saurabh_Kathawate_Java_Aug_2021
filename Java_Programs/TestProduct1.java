class Product
{
	private int id;
	private String name;

	//creating setter and getter method
	public void setId(int id)
	{
		if(id>100)
		this.id=id;
		else
		System.out.println("ID should be greater than 100");}

	public int getId()
	{return id;}

	public void setName(String name)
	{this.name=name;}

	public String getName()
	{return name;}
}

class TestProduct1
{
	public static void main(String arg[])
	{
		Product p=new Product();
		p.setId(45);
		System.out.println("Product ID: "+p.getId());
		p.setName("HP");
		System.out.println("ProductName: "+p.getName());
	}
}