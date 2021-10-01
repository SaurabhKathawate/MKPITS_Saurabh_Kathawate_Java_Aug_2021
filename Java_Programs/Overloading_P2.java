//In this example, we are creating static methods so that we don't need to create instance for calling methods.

class Multiplication{
	static int mul(int n1,int n2){
		return n1*n2;

	}
	static int mul(int n1,int n2,int n3){
			return n1*n2*n3;

	}
}

class Overloading_P2{
	public static void main(String arg[]){
		System.out.println("Multiplication of 2 No: "+Multiplication.mul(1,2));
		System.out.println("Multiplication of 3 No: "+Multiplication.mul(1,2,3));
	}
}