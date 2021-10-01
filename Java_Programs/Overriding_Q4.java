class Vehicle
	{
		void run(){System.out.println("Vehicle is running");}
    }
class Bike extends Vehicle
    {
		void run(){System.out.println("bike is running");}
	}
class Car extends Vehicle
	{
		void run(){System.out.println("car is running");}
	}

class Overriding_Q4
{
	public static void main(String args[])
	{
	//creating an instance of child class
	Bike b = new Bike();
	//calling the method with child class instance
	b.run();

	Car c = new Car();
	//calling the method with child class instance
	c.run();
	}
}
