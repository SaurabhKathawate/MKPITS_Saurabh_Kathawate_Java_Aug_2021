class Vehicle{
	void run(){
		System.out.println("Vehicle is running");
		}
    }
    //Creating a child class
    class Overriding_Q2_Bike extends Vehicle
	{
	public static void main(String args[]){
		//creating an instance of child class
		Overriding_Q2_Bike obj = new Overriding_Q2_Bike();
		//calling the method with child class instance
		obj.run();
		}
	}
