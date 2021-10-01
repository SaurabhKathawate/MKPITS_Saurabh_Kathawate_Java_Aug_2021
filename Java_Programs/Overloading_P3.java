//Method Overloading: changing data type of arguments
//In this example, we have created two methods that differs in data type.
//The first add method receives two integer arguments and second add method receives two double arguments.

class Addition{
	static int add(int n1,int n2){
		return n1+n2;
	}
	static double add(double n1,double n2,double n3){
		return n1+n2+n3;
	}
}
class Overloading_P3{
	public static void main(String arg[]){
		Addition a = new Addition();
		System.out.println("Addition of 2 No: "+Addition.add(1,2));
		System.out.println("Addition of 3 No: "+Addition.add(1.5,2.5,3.5));
	}
}