//5-wap to print odd no. between 1 and 10 using for loop
import java.util.*;
class For_Odd_no
{
	public static void main(String arg[])
	{
		int i=0;
		System.out.println("Numbers are: ");
		for(i=1;i<=10;i++)
		{
			if(i % 2 != 0)
			System.out.println(i);
		}
	}
}