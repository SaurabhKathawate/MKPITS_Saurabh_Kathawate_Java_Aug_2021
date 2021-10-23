//create an integer array of 5 elements to store 5 subject marks

import java.util.*;
class Array_Q2
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
	for(int i=0;i<arr.length;i++) {
		System.out.println("marks= " + arr[i]);
		total=total + arr[i];
		}
		per=(float) (total / 500.0f) * 100.0f;
		System.out.println("total marks " + total);
		System.out.println("percentage " + per);
		}
}
