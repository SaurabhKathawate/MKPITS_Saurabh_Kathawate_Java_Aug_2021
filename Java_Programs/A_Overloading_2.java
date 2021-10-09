//Method Overloading: changing data type of arguments
//In this example, we have created two methods that differs in data type.
//The first add method receives two integer arguments and second add method receives two double arguments.

class Addition{
	static int sum(int a, int b){
		return a+b;
	}
	static double sum(double a,double b,double c){
		return a+b+c;
	}
}

class A_Overloading_2{
	public static void main(String arg[]){
		System.out.println("Addition of 2 No: "+Addition.sum(1,2));
		System.out.println("Addition of 3 No: "+Addition.sum(1.1,2.2,3.3));
	}
}