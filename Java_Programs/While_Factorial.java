//6-wap to accept a no. print factorial of that no using while loop
import java.util.*;
class While_Factorial
{
	public static void main(String arg[])
	{
		int num,fact=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number: ");
		num=s.nextInt();
		while(num>0)
		{
			fact=fact*num;
			num--;
		}
		System.out.println("Factorial: "+fact);
	}
}