//2-create a class Product having field productid,productname,productprice and setter and getter method.
class Product
{
	private int id;
	private String name;
	private float price;

	//creating setter and getter method
	public void setId(int id)
	{this.id=id;}
	public int getId()
	{return id;}

	public void setName(String name)
	{this.name=name;}
	public String getName()
	{return name;}

	public void setPrice(float price)
	{this.price=price;}
	public float getPrice()
	{return price;}
}

class TestProduct4
{
	public static void main(String arg[])
	{
		Product p=new Product();
		p.setId(45);
		System.out.println("Product ID: "+p.getId());
		p.setName("HP");
		System.out.println("ProductName: "+p.getName());
		p.setPrice(4555.55f);
		System.out.println("Product Price: "+p.getPrice());
	}
}