//6-wap to accept a no. and print factorial of that no. using for loop.
import java.util.*;
class For_Factorial
{
	public static void main(String arg[])
	{
		int num,fact=1,i=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number: ");
		num=s.nextInt();
		System.out.println("Facorial: ");
		for(i=1;i<=num;num--)
		{
			fact=fact*num;
		}
		System.out.println(fact);
	}
}