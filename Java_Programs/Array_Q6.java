//Passing Array to a Method in Java

//We can pass the java array to method so that we can reuse the same logic on any array.
//create an integer array of 5 elements to store 5 subject marks

import java.util.*;
class Array_Q6
{
	public static void main(String[] arg) {
	int[] arr=new int[5];

	Scanner scan=new Scanner(System.in);
	for(int i=0;i<5;i++) {
	System.out.println("enter subject marks");
	arr[i]=scan.nextInt();
	}
	calculate(arr); //passing array to calculate method
	}
	//creating calculate method
	static void calculate(int marks[]) {
		int total=0;
		float per;
				for(int i : marks) {
					System.out.println("marks= " + i);
					total=total + i;
				}
				per=(float) (total / 500.0f) * 100.0f;
		System.out.println("total marks " + total);
System.out.println("percentage " + per);
	}



}
