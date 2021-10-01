class Vehicle{
	void run(){System.out.println("Vehical is running");}
}
class Bike extends Vehicle{
	void run(){System.out.println("Bike is running");}
}

class Overriding_P2{
	public static void main(String arg[]){
		//Vehicle v=new Vehicle();
		//v.run();
		Bike b=new Bike();
		b.run();
	}
}