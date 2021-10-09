//Method Overloading: changing no. of arguments
//In this example, we have created two methods, first add() method performs addition of two numbers and second add method performs addition of three numbers.

class Addition{
	void sum(int n1,int n2)
	{int res= n1+n2;
	System.out.println("Addition of 2 no: "+res);}

	void sum(double n1, double n2, double n3)
	{double res= n1+n2+n3;
	System.out.println("Addition of 2 no: "+res);}
}

class A_Overloading_1{
	public static void main(String arg[]){
		Addition a = new Addition();
		a.sum(1,2);
		a.sum(1.1,2.2,3.3);
		//System.out.println("Addition of 2 no: "+Addition.sum(1,2));
		//System.out.println("Addition of 3 no: "+Addition.sum(1.1,2.2,3.3));
	}
}