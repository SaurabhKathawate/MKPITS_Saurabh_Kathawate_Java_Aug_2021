//4-wap to print even no. between 1 and 10 using while loop.
import java.util.*;
class While_Even_no_1to10
{
	public static void main(String arg[])
	{
		int num=1;
		System.out.println("Numbers are: ");
		while(num<=10)
		{
			if(num % 2 == 0)
			System.out.println(num);
			num++;
		}
	}
}