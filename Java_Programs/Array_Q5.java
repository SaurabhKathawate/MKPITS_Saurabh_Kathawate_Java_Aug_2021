//create an integer array of 5 elements to store 5 subject marks

import java.util.*;
class Array_Q5
{
	public static void main(String[] arg) {
		int[] arr=new int[5];
		int total=0;
		float per;
Scanner scan=new Scanner(System.in);
for(int i=0;i<5;i++) {
	System.out.println("enter subject marks");
	arr[i]=scan.nextInt();
}
//display
		for(int i : arr) {
			System.out.println("marks= " + i);
			total=total + i;
		}
		per=(float) (total / 500.0f) * 100.0f;
System.out.println("total marks " + total);
System.out.println("percentage " + per);
	}
}
