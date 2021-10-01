//Method Overloading: changing no. of arguments
//In this example, we have created two methods, first add() method performs addition of two numbers and second add method performs addition of three numbers.

class calculate{
	void add(int n1,int n2){
		int res=n1+n2;
		System.out.println("addition of 2 no is " + res);
	}

	void add(int n1,int n2,int n3){
		int res=n1+n2+n3;
		System.out.println("addition of 3 no is " + res);
	}
}

class Overloading_Q1{
	public static void main(String[] arg){
		calculate c1=new calculate();
		c1.add(2,3);
		c1.add(2,3,5);
	}
}
