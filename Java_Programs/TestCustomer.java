//1-create a class Customer having field customerid, customername , customeremail,customermobile and setter and getter method.
class Customer
{
	private int id;
	private String name,email;
	private long mobno;

	//create setter and getter method
	public void setId(int id)
	{this.id=id;}
	public int getId()
	{return id;}
	public void setName(String name)
	{this.name=name;}
	public String getName()
	{return name;}
	public void setEmail(String email)
	{this.email=email;}
	public String getEmail()
	{return email;}
	public void setMobno(long mobno)
	{this.mobno=mobno;}
	public long getMobno()
	{return mobno;}
}

class TestCustomer
{
	public static void main(String arg[])
	{
		Customer c=new Customer();
		c.setId(147);
		System.out.println("Customer ID: "+c.getId());
		c.setName("Saurabh");
		System.out.println("Customer Name: "+c.getName());
		c.setEmail("saurabh@email.com");
		System.out.println("Customer email: "+c.getEmail());
		c.setMobno(9028436561L);
		System.out.println("Customer Mobile Number: "+c.getMobno());
	}
}