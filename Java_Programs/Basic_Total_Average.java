//9-wap to accept 3 number and print total and average.
import java.util.*;
class Basic_Total_Average
{
	public static void main(String arg[])
	{
		int n1,n2,n3,total;
		float average;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number n1: ");
		n1=s.nextInt();
		System.out.println("Enter Number n2: ");
		n2=s.nextInt();
		System.out.println("Enter Number n3: ");
		n3=s.nextInt();
		total=n1+n2+n3;
		average=(float) total/3.0f;
		System.out.println("Total: "+total);
		System.out.println("Average: "+average);
	}
}