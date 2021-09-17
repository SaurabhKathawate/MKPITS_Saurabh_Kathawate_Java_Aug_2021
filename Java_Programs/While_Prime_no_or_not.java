//9-wap to accept a no. and then print whether it is prime no. or not.
import java.util.*;
class While_Prime_no_or_not
{
	public static void main(String arg[])
	{
		int num,i=2;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number: ");
		num=s.nextInt();
		while(i<num)
		{
			if(num % i ==0)
			{
				System.out.print("It is not Prime Number ");
				break;
			}
			i++;
		}
		if(num==i)
		System.out.print("It is Prime Number \n");
	}
}