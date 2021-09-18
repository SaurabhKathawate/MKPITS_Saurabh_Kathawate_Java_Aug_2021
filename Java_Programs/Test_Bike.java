//wap to create a class Bike having fields company, color, and make methods start, stop.
import java.util.*;
class Bike
{
	String company;
	String color;

	//method to initialize object
	public void insert(String cmp, String col)
	{
		company=cmp;
		color=col;
	}

	//start method
	public void start()
	{
		System.out.println("Bike is started");
	}
	// stop method
	public void stop()
	{
		System.out.println("Bike is stopped");
	}

	void display()
	{
		System.out.println("Company: "+company);
		System.out.println("Color: "+color);
	}
}

//main class
class Test_Bike
{
	public static void main(String arg[])
	{
		//creating object
		Bike b1=new Bike();
		b1.company="Honda";
		b1.color="Blue";
		b1.display();
		b1.start();
		b1.stop();
	}
}