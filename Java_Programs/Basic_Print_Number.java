//3-wap to accept a number from the user and print that number
import java.util.*;
class Basic_Print_Number
{
	public static void main(String arg[])
	{
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number: ");
		num=s.nextInt();
		System.out.println("Number: " + num);
	}
}