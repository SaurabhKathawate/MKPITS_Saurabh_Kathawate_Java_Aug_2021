//Example of default constructor
//In this example, we are creating the no-arg constructor in the Bike class. It will be invoked at the time of object creation.

//Java Program to create and call a default constructor (no-arg constructor)
class Bike1
{
	//creating a default constructor
    Bike1()
    {System.out.println("Bike is created");}
    //main method
    public static void main(String arg[])
    {
    	//calling a default constructor
    	Bike1 b=new Bike1();
    }
 }
