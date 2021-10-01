//In this example, Bike is an abstract class that contains only one abstract method run. Its implementation is provided by the Honda class.

abstract class Bike
{
	abstract void run();
	//{
		//method without body;
	//}
}

class Honda extends Bike
{
	void run()
	{
		System.out.println("Bike is running");
	}
}

class Abstract_Q2
{
	public static void main(String arg[])
	{
		Bike b=null;
		b=new Honda();
		b.run();
	}
}
