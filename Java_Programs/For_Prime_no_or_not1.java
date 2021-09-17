//8-wap to accept a no and print whether it is a prime no or not
import java.util.*;
class For_Prime_no_or_not1
{
	public static void main(String arg[])
	{
		int num,i,j=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number: ");
		num=s.nextInt();
		for(i=2;i<num;i++)
		{
			if(num % i==0)
			j++;
		}
		if(j==0)
		System.out.println("It is Prime Number");
		else
		System.out.println("It is not Prime Number");
	}
}