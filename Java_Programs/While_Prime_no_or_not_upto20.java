//12-wap to print prime no. between 1 and 20 using while loop.
import java.util.*;
class While_Prime_no_or_not_upto20
{
	public static void main(String arg[])
	{
		int num,i=2;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number: ");
		num=s.nextInt();
		while(i<num && num<=20)
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
		else if(num>=21)
		System.out.print("Number is greater than 20 \n");
	}
}