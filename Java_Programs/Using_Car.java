//wap to create a class Car having fields model, color, and make methods start,stop.
class Car {

	String model;
	String color;

	public void start()
	{
		System.out.println("car is started");
	}

	public void stop()
	{
		System.out.println("car is stopped");
	}
}

class Using_Car
{
	public static void main(String arg[])
	{
		Car c1=new Car();
		c1.model="breeza";
		c1.color="black";
		System.out.println("model = " + c1.model);
		System.out.println("color = " + c1.color);
		c1.start();
		c1.stop();
	}
}
