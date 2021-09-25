//3-create a class orders having field orderid,orderdate, productname, price and quantity and setter and getter methods and calculatebill and display method.
class Order
{
	private int id,quantity;
	private String date,name;
	private float price;

	//creating setter and getter methods
	public void setId(int id)
	{this.id=id;}
	public int getId()
	{return id;}

	public void setDate(String date)
	{this.date=date;}
	public String getDate()
	{return date;}

	public void setName(String name)
	{this.name=name;}
	public String getName()
	{return name;}

	public void setPrice(float price)
	{this.price=price;}
	public float getPrice()
	{return price;}

	public void setQuantity(int quantity)
	{this.quantity=quantity;}
	public int getQuantity()
	{return quantity;}
}

class TestOrder
{
	public static void main(String arg[])
	{
		Order o=new Order();
		o.setId(25);
		System.out.println("Order ID: "+o.getId());
		o.setDate("22/09/2021");
		System.out.println("Order Date: "+o.getDate());
		o.setName("Laptop");
		System.out.println("Product name: "+o.getName());
		o.setPrice(49999.99f);
		System.out.println("Product Price: "+o.getPrice());
		o.setQuantity(2);
		System.out.println("Product Quantity: "+o.getQuantity());
	}
}