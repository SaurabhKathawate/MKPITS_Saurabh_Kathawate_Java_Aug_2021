//Method Overloading: changing no. of arguments
//In this example, we have created two methods, first mul() method performs multiplication of two numbers and second mul() method performs multiplication of three numbers.

class Multiplication{
	void mul(int n1,int n2){
		int res=n1*n2;
		System.out.println("Multiplication of 2 no: "+res);
	}
void mul(int n1,int n2,int n3){
		int res=n1*n2*n3;
		System.out.println("Multiplication of 3 no: "+res);
	}
}

class Overloading_P1{
	public static void main(String arg[]){
		Multiplication m=new Multiplication();
		m.mul(1,2);
		m.mul(1,2,3);
	}
}